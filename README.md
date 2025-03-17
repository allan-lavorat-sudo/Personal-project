# Password Generator

## **Overview**
This is a **Java** project that generates secure passwords by combining uppercase letters, lowercase letters, digits, special characters, and complex words. It is designed to provide high security using reliable cryptographic techniques.

---

## **Features**
- Generates passwords with customizable length.
- Includes:
  - Uppercase letters.
  - Lowercase letters.
  - Numeric digits.
  - Special characters.
  - Optional complex words for added robustness.
- Uses `SecureRandom` to generate cryptographically secure random values.

---

## **How to Use**
1. Clone or download this repository:
   ```sh
   git clone https://github.com/your-repository/password-generator.git
   ```
2. Compile the code:
   ```sh
   javac com/example/PasswordGenerator.java
   ```
3. Run the password generator:
   ```sh
   java com.example.PasswordGenerator
   ```
   When executed, a 60-character password will be generated and displayed on the console.

4. **Customizable Parameters:**  
   - You can modify the password length or add/remove elements directly in the `generatePassword()` method.

---

## **Code Structure**

### **Constants**
- **UPPER**: Contains all uppercase letters of the alphabet.
- **LOWER**: Contains all lowercase letters of the alphabet.
- **DIGITS**: Contains numbers from 0 to 9.
- **SPECIALS**: Contains special characters (e.g., `!@#$%^&*()`).
- **COMPLEX_WORDS**: A list of complex words to make brute-force attacks more difficult.

### **Classes and Methods**
#### Class `PasswordGenerator`
- `generatePassword(int length)`: Generates a password with the specified length.
- `initializeSecureRandom()`: Initializes the `SecureRandom` instance.
- **Access Methods**:
  - `getUPPER()`, `getLOWER()`, `getDIGITS()`, etc.
- **Constructor**:
  - Initializes the class with the `SecureRandom` instance.

#### Advanced Methods
- Integrations for resetting the pseudo-random generation seed (`setSeed()`).
- Additional methods to retrieve information about the security algorithm used.

---

## **Example**
Output generated by the program:
```
Generated password: F8@zD7!mPl&xXcVrPwD#1Q2wA%Yk9EnOs
```

---

## **Dependencies**
- Java 8 or higher.

---

## **Future Improvements**
- Graphical user interface to easily customize password criteria.
- Export functionality to save generated passwords to secure files.
- Adding a feature to validate password strength.

---

## **License**
This project is licensed under the terms of the **MIT License**. See the [LICENSE](LICENSE) file for more information.

---

## **Author**
Developed by **Allan Lavorat.  
