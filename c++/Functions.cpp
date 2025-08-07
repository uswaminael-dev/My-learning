#include<iostream>
using namespace std;


int factorial(int num1){
    int product=1;
    for(int i=1,i<=num1,i++){
        product=product*i;
}
    cout<<"The factorial of"<<num1<< "is"<<product<<endl;
}

int main(){
    factorial(5);
    return 0;
}