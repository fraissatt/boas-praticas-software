public class Sistema {

    public static double mediaAluno(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static void main(String[] args) {
        String nome = "Carlos";
        double nota1 = 8;
        double nota2 = 7;
        double media = mediaAluno(nota1, nota2);

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}