public class Sistema {

    public static double mediaAluno(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static String resultadoAluno(double media) {
        return media >= 6 ? "Aprovado" : "Reprovado";
    }

    // main é somente utilizada para orquestrar o fluxo + saída
    public static void main (String[] args) {
        String nome = "Carlos";
        double nota1 = 7.5;
        double nota2 = 8.0;

        double media = mediaAluno(nota1, nota2);
        String resultado = resultadoAluno(media);

        System.out.println("Aluno: " + nome + "\n - Média: " + media + "\n - Resultado: " + resultado);
    } 
}