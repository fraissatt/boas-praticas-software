public class Sistema {

    public static double mediaAluno(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static String resultadoAluno(double media) {
        return media >= 6 ? "Aprovado" : "Reprovado";
    }

    public static void main(String[] args) {
        String nome = "Carlos";
        double nota1 = 8;
        double nota2 = 7;
        double media = mediaAluno(nota1, nota2);
        String resultado = resultadoAluno(media);

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);
        System.out.println(resultado);
    }
}