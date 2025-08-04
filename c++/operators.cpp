//PRACTICING DIFFERENT TYPES OF OPERATORS IN C++

#include<iostream>
using namespace std;
int main(){

    //1.ARITHMETIC OPERATORS
/*BINARY*/
    int a,b,c;
    cout<<"Enter any three numbers";
    cin>>a>>b>>c;

    int addition=a+b; //+
    cout<<addition;
    int subtraction=a-b;    //-
    cout<<subtraction;
    int multiplication=a*b; //*
    cout<<multiplication;
    int division=a/b; //(/)
    cout<<division;
    int remainder=a%b; //(%)
    cout<<remainder;

/*Unary*/
    a=a++; //post-increment
    cout<<a;
    a=++a; //pre-increment
    cout<<a;
    b=b--; //post-decrement
    cout<<b;
    b=--b; //pre-decrement
    cout<<b;

    //2.RELATIONAL OPERATORS//
    /*returns a boolean value (true or false)*/
   
    if (a==b);                      //is equal to
        cout<<"a is equal to b" ; 
    else if (a=!b);                 //is not equal to
        cout<<"a is equal to b" ; 
    else if (a<=b);                  //is smaller than or equal to
         cout<<"a is equal to b" ; 
    else if(a>=b);                         //is greater than or equal to
         cout<<"a is equal to b" ; 
    else if(a>b);                          //is greater than
         cout<<"a is equal to b" ; 
    else (a<b);                          //is smaller than
         cout<<"a is equal to b" ; 

    //3.LOGICAL OPERATORS//
    
    &&      //AND operator
     /*returns true only when both conditions are true*/
    
     ||      //OR operator
     /*returns true even if one condition is true*/          
    
     !      //NOT operator
     /*returns reverse of a value*/

     //4.ASSIGNMENT OPERATORS//
      a=b; //assigning value of a to b
      a+=b; //adding value of b to a
      a-=b; //subtracting value of b from a
      a*=b; //multiplying value of b with a
      a/=b; //dividing value of a by b
      a%=b; //modulus of a and b

    //5.BITWISE OPERATORS//
    /*works on bits and performs bit-by-bit operation*/
    
    &       //AND operator (returns true if both bits are 1)
    |       //OR operator (returns true if either bit is 1)
    ^       //XOR operator (returns true if bits are different)
    ~       //NOT operator (inverts all bits)
    <<      //Left shift operator (shifts bits to the left) (a<<=n is equivalent to a=a*2^n)
    >>      //Right shift operator (shifts bits to the right) (a>>=n is equivalent to a=a/2^n)

    //6.CONDITIONAL OPERATOR//
      /*also known as TERNARY OPERATOR*/

      int num1,num2;
      cout<<"Please any 2 numbers";
      cin>>num1>>num2;

      m=(num1==num2)?(num1+num2):(num1-num2)

      //and many more operators but we don't need to know EVERYTHING because no one knows EVERYTHING not even an expertise of a field
        
    
}