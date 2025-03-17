# Password Generator

## **Visão Geral**
Este é um projeto em **Java** que gera senhas seguras combinando letras maiúsculas, letras minúsculas, dígitos, caracteres especiais e palavras complexas. Foi projetado para oferecer alta segurança utilizando técnicas criptográficas confiáveis.

---

## **Funcionalidades**
- Geração de senhas com comprimento personalizado.
- Inclui:
  - Letras maiúsculas.
  - Letras minúsculas.
  - Dígitos numéricos.
  - Caracteres especiais.
  - Palavras complexas opcionais para maior robustez.
- Utiliza `SecureRandom` para gerar valores aleatórios criptograficamente seguros.

---

## **Como Usar**
1. Clone ou baixe este repositório:
   ```sh
   git clone https://github.com/seu-repositorio/password-generator.git
   ```
2. Compile o código:
   ```sh
   javac com/example/PasswordGenerator.java
   ```
3. Execute o gerador de senhas:
   ```sh
   java com.example.PasswordGenerator
   ```
   Ao executar, uma senha com 60 caracteres será gerada e exibida no console.

4. **Parâmetros Personalizáveis:** 
   - Você pode alterar o comprimento da senha ou adicionar/remover elementos diretamente no método `generatePassword()`.

---

## **Estrutura do Código**

### **Constantes**
- **UPPER**: Contém todas as letras maiúsculas do alfabeto.
- **LOWER**: Contém todas as letras minúsculas do alfabeto.
- **DIGITS**: Contém números de 0 a 9.
- **SPECIALS**: Contém caracteres especiais (exemplo: `!@#$%^&*()`).
- **COMPLEX_WORDS**: Lista com palavras complexas para dificultar ataques de força bruta.

### **Classes e Métodos**
#### Classe `PasswordGenerator`
- `generatePassword(int length)`: Gera uma senha com o comprimento especificado.
- `initializeSecureRandom()`: Inicializa a instância de `SecureRandom`.
- **Métodos de Acesso**:
  - `getUPPER()`, `getLOWER()`, `getDIGITS()`, etc.
- **Construtor**:
  - Inicializa a classe com a instância de `SecureRandom`.

#### Métodos Avançados
- Integrações para redefinir a semente da geração pseudoaleatória (`setSeed()`).
- Métodos adicionais para obter informações do algoritmo de segurança usado.

---

## **Exemplo**
Saída gerada pelo programa:
```
Senha gerada: F8@zD7!mPl&xXcVrPwD#1Q2wA%Yk9EnOs
```

---

## **Dependências**
- Java 8 ou superior.

---

## **Futuras Melhorias**
- Interface gráfica para personalizar facilmente os critérios da senha.
- Exportação das senhas geradas para arquivos seguros.
- Inclusão de funcionalidade para validar a força de senhas.

---

## **Licença**
Este projeto está licenciado sob os termos da **MIT License**. Veja o arquivo [LICENSE](LICENSE) para mais informações.

---

## **Autor**
Desenvolvido por Allan Lavorat.  
