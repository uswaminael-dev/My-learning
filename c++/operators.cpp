//PRACTICING DIFFERENT TYPES OF OPERATORS IN C++

#include<iostream>
#include<cmath>
using namespace std;
int main(){


    // 1. ARITHMETIC OPERATORS
    // BINARY
    int a, b;
    cout << "Enter any two numbers: ";
    cin >> a >> b;

    int addition = a + b; // +
    cout << "Addition: " << addition << endl;
    int subtraction = a - b; // -
    cout << "Subtraction: " << subtraction << endl;
    int multiplication = a * b; // *
    cout << "Multiplication: " << multiplication << endl;
    int division = a / b; // /
    cout << "Division: " << division << endl;
    int remainder = a % b; // %
    cout << "Remainder: " << remainder << endl;

    // UNARY
    a++; // post-increment
    cout << "Post-increment a: " << a << endl;
    ++a; // pre-increment
    cout << "Pre-increment a: " << a << endl;
    b--; // post-decrement
    cout << "Post-decrement b: " << b << endl;
    --b; // pre-decrement
    cout << "Pre-decrement b: " << b << endl;

    // 2. RELATIONAL OPERATORS
    // returns a boolean value (true or false)
    if (a == b) {
        cout << "a is equal to b" << endl;
    } else if (a != b) {
        cout << "a is not equal to b" << endl;
    } else if (a <= b) {
        cout << "a is smaller than or equal to b" << endl;
    } else if (a >= b) {
        cout << "a is greater than or equal to b" << endl;
    } else if (a > b) {
        cout << "a is greater than b" << endl;
    } else if (a < b) {
        cout << "a is smaller than b" << endl;
    }

    // 3. LOGICAL OPERATORS
    // Example usage:
    if ((a > 0) && (b > 0)) {
        cout << "Both a and b are positive" << endl;
    }
    if ((a > 0) || (b > 0)) {
        cout << "At least one of a or b is positive" << endl;
    }
    if (!(a > 0)) {
        cout << "a is not positive" << endl;
    }

    // 4. ASSIGNMENT OPERATORS
    a = b; // assigning value of b to a
    a += b; // adding value of b to a
    a -= b; // subtracting value of b from a
    a *= b; // multiplying value of b with a
    a /= b; // dividing value of a by b
    a %= b; // modulus of a and b

    // 5. BITWISE OPERATORS
    // works on bits and performs bit-by-bit operation
    int bit_and = a & b;
    int bit_or = a | b;
    int bit_xor = a ^ b;
    int bit_not = ~a;
    int left_shift = a << 1;
    int right_shift = a >> 1;
    cout << "Bitwise AND: " << bit_and << endl;
    cout << "Bitwise OR: " << bit_or << endl;
    cout << "Bitwise XOR: " << bit_xor << endl;
    cout << "Bitwise NOT: " << bit_not << endl;
    cout << "Left shift: " << left_shift << endl;
    cout << "Right shift: " << right_shift << endl;

    // 6. CONDITIONAL (TERNARY) OPERATOR
    int num1, num2;
    cout << "Please enter any 2 numbers: ";
    cin >> num1 >> num2;
    int m = (num1 == num2) ? (num1 + num2) : (num1 - num2);
    cout << "Result of ternary operator: " << m << endl;

    // and many more operators but we don't need to know EVERYTHING because no one knows EVERYTHING not even an expert of a field

    return 0;
}