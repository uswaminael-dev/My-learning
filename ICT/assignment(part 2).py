print("\n______________________________________________________________\n")
print("\n__Task 1__\nCHECKING FOR EVEN OR ODD\n")
#get input from user
num=int(input("Enter an integer: "))
#task: write an if else statement to check  if the number is even or odd
if num%2==0:
    print(f"{num} is Even")
else:
    print (f"{num} is Odd")
print("\n-------------------\n")


print("\n__Task 2__\nSIMPLE COUNTDOWN\n")
#task: use a while-loop to perform a count count from 5 to 1
count=5
while count>=1:
    print(count)
    count-=1
print("Lift off!")

print("\n__Task 3__\nSIMPLE CALCULATOR \n")
#defining functions 
def add(x,y):
    return x+y
def subtract(x,y):
    return x-y
def multiply(x,y):
    return x*y
def divide(x,y):
    if y==0:
        return "Error: Cannot divide by zero"
    else:
        return x/y

#getting input from the user
num1_str=input("Enter the first number: ")
operation=input("Enter the operation (+, -, *, /): ")
num2_str=input("Enter the second number: ")
#converting input to float
num1=float(num1_str)
num2=float(num2_str)
#initialize result
result=None

if operation=='+':
    result=add(num1,num2)
elif operation=='-':
    result=subtract(num1,num2)
elif operation=='*':
    result=multiply(num1,num2)
elif operation=='/':
    result=divide(num1,num2)
else:
    result="Error: Invalid operation"

#printing the result
print(f"The result is: {result}")
print("\n-------------------\n")