
#include <iostream>
#include <string>
using namespace std;

// Function example
int add(int a, int b) {
    return a + b;
}

// Simple class example
class Person {
public:
    string name;
    int age;
    void introduce() {
        cout << "Hi, my name is " << name << " and I am " << age << " years old." << endl;
    }
};

int main() {
    // Variables
    int x = 5;
    double y = 3.14;
    char c = 'A';
    string s = "sk";

    // Output
    cout << "x = " << x << ", y = " << y << ", c = " << c << ", s = " << s << endl;

    // Input
    int num;
    cout << "Enter a number: ";
    cin >> num;
    cout << "You entered: " << num << endl;

    // Conditionals
    if (num > 0) {
        cout << "Positive number" << endl;
    } else if (num < 0) {
        cout << "Negative number" << endl;
    } else {
        cout << "Zero" << endl;
    }

    // Loops
    cout << "Counting from 1 to 5:" << endl;
    for (int i = 1; i <= 5; ++i) {
        cout << i << " ";
    }
    cout << endl;

    // Arrays
    int arr[3] = {10, 20, 30};
    cout << "Array elements: ";
    for (int i = 0; i < 3; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;

    // Function call
    cout << "Sum of 2 and 3 is: " << add(2, 3) << endl;

    // Class usage
    Person p;
    p.name = "Uswa";
    p.age =19;
    p.introduce();

    return 0;
}
