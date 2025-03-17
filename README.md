# Personal-project

# Password Generator

## Overview
This project is a Java-based password generator that creates secure passwords using a combination of uppercase letters, lowercase letters, digits, special characters, and complex words.

## Features
- Generates passwords of specified length
- Includes uppercase letters, lowercase letters, digits, and special characters
- Optionally includes complex words for added security
- Uses `SecureRandom` for cryptographic security

## Usage
To generate a password, run the `PasswordGenerator` class. The `main` method will generate a password of length 60 and print it to the console.

```sh
java com.example.PasswordGenerator



GitHub Copilot
Here is a README.md file with all the necessary information about your project:

Code Structure
UPPER: A constant string containing uppercase letters.
LOWER: A constant string containing lowercase letters.
DIGITS: A constant string containing digits.
SPECIALS: A constant string containing special characters.
COMPLEX_WORDS: A list of complex words used to enhance password security.
RANDOM: An instance of SecureRandom used for generating random values.
Methods
getUPPER(): Returns the UPPER string.
getLOWER(): Returns the LOWER string.
getDIGITS(): Returns the DIGITS string.
getSPECIALS(): Returns the SPECIALS string.
getCOMPLEX_WORDS(): Returns the COMPLEX_WORDS list.
getRANDOM(): Returns the RANDOM instance.
setUPPER(String upper): Throws UnsupportedOperationException as UPPER is a constant.
setLOWER(String lower): Throws UnsupportedOperationException as LOWER is a constant.
setDIGITS(String digits): Throws UnsupportedOperationException as DIGITS is a constant.
setSPECIALS(String specials): Throws UnsupportedOperationException as SPECIALS is a constant.
setCOMPLEX_WORDS(List<String> complexWords): Throws UnsupportedOperationException as COMPLEX_WORDS is a constant.
setRANDOM(SecureRandom random): Throws UnsupportedOperationException as RANDOM is a constant.
generatePassword(int length): Generates a password of the specified length.
PasswordGenerator(): Constructor that initializes the SecureRandom instance.
hashCode(): Returns the hash code of the RANDOM instance.
equals(Object obj): Checks if the current instance is equal to another object.
isDeprecated(): Checks if the RANDOM instance is deprecated.
nextInt(), nextInt(int bound), nextLong(), nextBoolean(), nextFloat(), nextDouble(), nextGaussian(), nextBytes(byte[] bytes), etc.: Various methods for generating random values.
getProvider(), getAlgorithm(), getParameters(): Methods for retrieving information about the SecureRandom instance.
setSeed(byte[] seed), setSeed(long seed): Methods for setting the seed of the SecureRandom instance.
reseed(), reseed(SecureRandomParameters params): Methods for reseeding the SecureRandom instance.
initializeSecureRandom(): Initializes the SecureRandom instance.
toString(): Returns a string representation of the PasswordGenerator instance.
Dependencies
Java 8 or higher
License
This project is licensed under the MIT License.

Author
Allan Lavorat
