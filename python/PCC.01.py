#INSTALLATION OF PYTHON ON GOOGLE COLAB

print("HELLO WORLD")
print("Happy Coding")

#VARIABLE INITIALIZATION AND DECLARATION
var_1=47
var_2=0.56
var_3="Hello"

#PRINTNG A VARIABLE
print(var_3)

#Strings don't accept any mathematical operation and are always written in quotes

#= ----> Assignment operator

#variables are the containers used to store data of different datatypes

#taking the input feom the user
Input=input("What is your name?") #always gives string datatype


#how to find the datatype of a variable
print(type(var_1))


#CONDITIONALS

'''-----> IF ELSE '''

if var_1 > var_2:
    print("var_1 is greater than var_2")
else:
    print("var_1 is less than or equal to var_2")

'''-----> FOR/WHILE LOOP'''
for i in range(1, 11):
    print(f"5 x {i} = {5 * i}")

while var_1 < 100:
    var_1 += 1
    print(var_1)

'''to be continued'''