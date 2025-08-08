#include<iostream>
using namespace std;

int factorial(int num1){
    int product=1;
    for(int i=1;i<=num1;i++){
        product=product*i;
}
    cout<<"The factorial of "<<num1<< " is "<<product<<endl;
}

int main(){
    int num;
    cout<<"Enter a number to find its factorial: ";
    cin>>num;
    factorial(num);
    return 0;
}