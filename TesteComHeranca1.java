public class TesteComHeranca1 {

        public static void main(String[] args) {
            AlunoDeGraduacao aluno = new AlunoDeGraduacao();

            aluno.nota1 = 7;
            aluno.nota2 = 9;
            aluno.nome = "jose";
            aluno.idade = 22;

            System.out.printf("nome: %s, idade: %s \n", aluno.nome, aluno.idade);
        }
    
}
