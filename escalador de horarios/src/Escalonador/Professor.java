package Escalonador;

public class Professor {
    public static int id;
    public static String nome;
    public static Disciplina[] disciplinasAfins;
    public static Horarios disponibilidade;

    Professor(int pos){
        id = Integer.parseInt(BancoDeDados.getCollunm("id","Professor")[pos]);
        nome = BancoDeDados.getCollunm("nome","Professor")[pos];
        disciplinasAfins = area();
    }

    private Disciplina[] area(){
        String cond = "id_prof = " + id;
        String[] ids_disp = BancoDeDados.getCollunm("id_disp","areaprofessor", cond);
        Disciplina[] disp = new Disciplina[ids_disp.length];
        for(int i = 0; i<ids_disp.length; i++){
            disp[i] = new Disciplina(ids_disp[i]);
        }
        return disp;
    }

    private Horarios getDisponibilidade(){
        String cond = "id_prof = " + id;
        String[] dias = BancoDeDados.getCollunm("dia","disponibilidadeprofessor",cond);
        String[] horarios = BancoDeDados.getCollunm("dia","disponibilidadeprofessor",cond);
    }
}
