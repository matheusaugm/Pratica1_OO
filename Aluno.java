import java.util.Scanner;

public class Aluno {
    public  static String nome;
    public float notaAV1;
    public float notaAV2;
    public float notaAE;

    public String matricula;
    public String curso;
    public int periodo;

    public Aluno(String nome, float notaAV1, float notaAV2, float notaAE, String matricula, String curso, int periodo) {
        this.nome = nome;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
    }
    //Altera nota do aluno
    public void alterarNota(float nota, String avaliacao) {
        avaliacao=avaliacao.toLowerCase();
        switch(avaliacao){
            case "av1" -> this.notaAV1=nota;
            case "av2" -> this.notaAV2=nota;
            case "ave" -> this.notaAE=nota;
            default -> {

            }
        }
    }
    //Calcula nota final, identificando se o aluno foi para recuperação
    public void avaliarAluno(){
        float somatorio = this.notaAV1 + this.notaAV2;
        if (somatorio <60) {
           System.out.println("Recuperação");
       }
       else {
           System.out.println("Aprovado!");
       }
    }
//Achei bem esquisito o jeito de calcular a recuperação, não deveria ser a média da porcentagem
// das provas? Fiz uma microgambiarra pra resolver o problema, mas ainda sim não vai funcionar corretamente, porque
   // a média é praticamente inalcansável seguindo essa regra.
    public void avaliarRecuperacao() {
        if(this.notaAV1+this.notaAV2 <60){
       float resultadoRecuperacao = (this.notaAV1 + this.notaAV2 + this.notaAE)/3;
       if (resultadoRecuperacao <60){
           System.out.println("Reprovado");
       }
       else {
           System.out.println("Aprovado");
       }}
        else{
            System.out.println("não precisa de AE.");

        }
    }

    public static void main(String[] args) {
        Scanner scannear = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scannear.nextLine();
        System.out.println("Digite a matricula do aluno: ");
        String matriculaAluno = scannear.nextLine();
        System.out.println("Digite o curso do aluno: ");
        String cursoAluno = scannear.nextLine();
        System.out.println("Digite o periodo do aluno: ");
        int periodoAluno = scannear.nextInt();
        System.out.println("Digite a nota da AV1 do aluno: ");
        float notaAV1Aluno = scannear.nextFloat();
        System.out.println("Digite a nota da AV2 do aluno: ");
        float notaAV2Aluno = scannear.nextFloat();
        System.out.println("Digite a nota da AE do aluno: ");
        float notaAEAluno = scannear.nextFloat();
        Aluno novoAluno= new Aluno(nomeAluno, notaAV1Aluno,notaAV2Aluno,notaAEAluno, matriculaAluno, cursoAluno, periodoAluno);
        System.out.println("Deseja alterar a nota de alguma avaliação do aluno? Digite 1 para sim, 2 para não");
        int alterarNota = scannear.nextInt();
        if (alterarNota == 1) {
            System.out.println("Digite qual avaliacao deseja alterar a nota: AV1, AV2, AE");
            String qualAvaliacao = scannear.next();
            if (qualAvaliacao.length() > 0){
                System.out.println("Digite a nova nota: ");
                float novaNota = scannear.nextFloat();
                novoAluno.alterarNota(novaNota, qualAvaliacao);
            }

        }
        novoAluno.avaliarAluno();
        novoAluno.avaliarRecuperacao();




    }

}
