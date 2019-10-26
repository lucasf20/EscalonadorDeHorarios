package Escalonador;
public class EscalonadorMain {
    public static void main (String[] args){
        Disciplina[] d = new Disciplina[5];
        for(int i = 0; i < 5; i++){
            d[i] = new Disciplina(i);
            System.out.println(d[i].id);
            System.out.println(d[i].nome);
            System.out.println(d[i].demanda);
            System.out.println(d[i].laboratorio);
            System.out.println(d[i].chs);
            System.out.println("\n");
        }
    }
}
