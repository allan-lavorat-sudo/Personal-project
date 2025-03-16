package demo.src;

import java.util.Random;

public class GeradorSenhaSeguro {
    private int tamanhoSenha = 50; // Default password length set to 50
    private static final Random aleatorio = new Random();

    public GeradorSenhaSeguro(int tamanhoSenha) {
        if (tamanhoSenha < 8) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 8 caracteres.");
        }
        this.tamanhoSenha = tamanhoSenha;
    }

    public static void main(String[] args) {
        GeradorSenhaSeguro gerador = new GeradorSenhaSeguro(75); // Tamanho da senha
        String senha = gerador.gerarSenhaAleatoria();
        System.out.println("Senha gerada: " + senha);
    }

    public String gerarSenhaAleatoria() {
        StringBuilder senha = new StringBuilder();

        // Garantir que a senha tenha pelo menos um caractere de cada tipo
        senha.append((char) ('A' + aleatorio.nextInt(26))); // Letra maiuscula
        senha.append((char) ('a' + aleatorio.nextInt(26))); // Letra minuscula
        senha.append((char) ('0' + aleatorio.nextInt(10))); // Numero
        char[] especiais = {'!', '@', '$', '*',}; // Removed '.', '?', '^'
        senha.append(especiais[aleatorio.nextInt(especiais.length)]); // Caractere especial

        for (int i = 4; i < tamanhoSenha; i++) {
            char caractere;

            // Alterna entre diferentes grupos de caracteres
            int tipo = aleatorio.nextInt(3); // 0 para letras, 1 para numeros, 2 para caracteres especiais

            caractere = switch (tipo) {
                case 0 -> // Letras
                    (char) (aleatorio.nextBoolean() ? 'A' + aleatorio.nextInt(26) : 'a' + aleatorio.nextInt(26));
                case 1 -> // Numeros
                    (char) ('0' + aleatorio.nextInt(10));
                case 2 -> // Caracteres especiais
                    especiais[aleatorio.nextInt(especiais.length)];
                default -> throw new IllegalStateException("Unexpected value: " + tipo);
            };

            senha.append(caractere);
        }

        return senha.toString();
    }
}
