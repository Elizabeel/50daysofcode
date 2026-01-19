package src;

public class Usuario {

    String nome;
    String idadeTexto;
    int idade;
    boolean ativo;

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.nome = "Elizabete";
        usuario.idadeTexto = "22";
        usuario.ativo = true;

        usuario.idade = Integer.parseInt(usuario.idadeTexto);

        boolean idadeValida = validarIdade(usuario.idade);

        if (idadeValida) {
            System.out.println("Usuário maior de idade. Cadastro permitido.");
        } else {
            System.out.println("Usuário menor de idade. Cadastro não permitido.");
        }
    }

    public static boolean validarIdade(int idade) {
        return idade >= 18;
    }
}

