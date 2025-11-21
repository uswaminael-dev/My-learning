#Function is reusable block of code that performs a specific task

#defining a function 
def greeting():
    print("Hello, Glad to have to here")
#calling a function
greeting()

#Function with parameters
def greeting_with_name(name):
    print(f"Hello {name}, Glad to have you here") #using f string (formatted string)
#parameters are the boxes like "name" here and arguments are the value we place in those boxes like John here
greeting_with_name("John")


print("\n------------MAKING TEA--------------")
def make_tea():
    print("Boil water")
    print("Add tea leaves")
    print("Pour in milk")
    print("Add sugar to taste")
    print("Stir well")
make_tea()



print("\n------------PRINTING  WELCOME MESSAGE--------------")
def welcome():
    print("Welcome to our store")
welcome()



print("\n------------PLAYING A NASHEED--------------")
#songs are haram tho
def play_nasheed():
    print("Opening the playlist nasheed")
    print("Playing a beautiful nasheed")
play_nasheed()



print("\n------------FUNCTION WITH ONE PARAMETER--------------")
def remind_task(task):
    print(f"Reminder: {task}")
remind_task("Take Medicine")
remind_task("Go for a walk")




print("\n------------FUNCTION WITH MULTIPLE PARAMETERS--------------")
def remind_tasks(task, time):
    print(f"Reminder: {task} at {time}")
remind_tasks("Breakfast","8:00 AM")




print("\n------------FUNCTION WITH DEFAULT VARIABLES--------------")
#in this case when we will give an argument , it will get printed else the value we have given in the parameter while creating the function will get printed
def reminder(task="Drink Water", time="Every Hour"):
    print(f"Reminder: {task} at {time}")
reminder() #will use default values
reminder("Lunch") #deafult time
reminder("Meeting","3:00 PM") #both provided

 
 #SCOPE OF VARIABLES (local/global)
print("\n------------LOCAL VARIABLE--------------")
def greet():
    message="Hello"
    print(message)  # Local variable
greet()
'''print(message)'''  # This will raise an error because 'message' is not defined outside the function


print("\n------------GLOBAL VARIABLE--------------")
message="Greetings"
def greetings():
    print(message)  # This will access the global variable 'message'
greetings()


print("\n------------MODIFYING GLOBAL VARIABLES INSIDE FUNCTIONS--------------")
count=0
def increment_count():
    global count
    count += 1
    print(count)
increment_count()  # Output: 1


#BUILT_IN MODULES
'''A PYTHON FILE CONTAINING CODE THAT YOU CAN REUSE IN OTHER FILES'''


import math
print(math.sqrt(16))  # Output: 4.0


from random import randint
# randint is a function from the random module that generates a random integer between two specified values
print(randint(1, 10))  # Output: Random integer between 1 and 10



#and many more