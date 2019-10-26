package Escalonador;

public class Disciplina {
    public static int id;
    public static String nome;
    public static String laboratorio;
    public static int demanda;
    public static int chs;

    Disciplina(int pos){
        id = Integer.parseInt(BancoDeDados.getCollunm("id","Disciplina")[pos]);
        nome = BancoDeDados.getCollunm("nome","Disciplina")[pos];
        laboratorio = BancoDeDados.getCollunm("laboratorio", "Disciplina")[pos];
        demanda = Integer.parseInt(BancoDeDados.getCollunm("demanda","Disciplina")[pos]);
        chs = Integer.parseInt(BancoDeDados.getCollunm("cargahorariasemanal","Disciplina")[pos]);
    }

    Disciplina(String id_disp){
        int pos = 0;
        String cond = "id = " + id_disp;
        id = Integer.parseInt(BancoDeDados.getCollunm("id","Disciplina",cond)[pos]);
        nome = BancoDeDados.getCollunm("nome","Disciplina",cond)[pos];
        laboratorio = BancoDeDados.getCollunm("laboratorio", "Disciplina",cond)[pos];
        demanda = Integer.parseInt(BancoDeDados.getCollunm("demanda","Disciplina",cond)[pos]);
        chs = Integer.parseInt(BancoDeDados.getCollunm("cargahorariasemanal","Disciplina",cond)[pos]);
    }
}
