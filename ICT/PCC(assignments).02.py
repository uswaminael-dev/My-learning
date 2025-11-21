#ASSINMENTS OF DECISION MAKING AND LOOPING

#1
print("---------TRAFFIC SIGNAL--------")
traffic_light=input("Red,Green,Yellow\n")
if traffic_light=="Red":
    print("STOP")
elif traffic_light=="Yellow":
    print("Get Ready")
else:
    print("GO")
print("--------------------------")


#2
print("----Message Generator----")
time=input("Morning,Afternoon or Evening\n")
if time=="Morning":
    print("GOOD MORNING")
elif time=="Afternoon":
    print("GOOD AFTERNOON")    
else:
    print("GOOD EVENING")    
print("--------------------------")


#3
print("----OUTFIT SUGGESTION----")
weather=input("hot or cold\n")
if weather=="hot":
    print("Wear Light Clothes")
elif weather=="cold":
    print("Wear A Jacket")
else:
    print("Carry an Umbrella")
print("_____________________")


#4
print("__REMARKS GIVER__")
grade=input("Enter your grade\n")
if grade=="A":
    print("EXCELLENT")
if grade=="B":
    print("GOOD")
if grade=="C":
    print("AVERAGE")
else:
    print("YOU NEED IMPROVEMENT")
print("-----------------------")


#5
Aamir_age=int(input("Enter the age of Aamir\n"))
Amara_age=int(input("Enter the age of Amara\n"))
if Aamir_age>Amara_age:
    print("Aamir is older than Amara")
else:
    print("Amara is older than Aamir")
print("------------------")


#6
exam_score=int(input("Enter your score\n"))
if exam_score>=50:
    print("You passed")
else:
    print("Better luck next time")


#7
print("------GRADING SYSTEM----")
score=int(input("Enter student's score:\n"))
if score>=90:
    print("Grade A")
elif score>=80:
    print("Grade B")
if score>=70:
    print("Grade C")
else:
    print("Grade F")
print("-----------------")

#8
print("----PUBLIC TRANSPORTATION FARE----")
age=int(input("Enter your age:\n"))
if age<12:
    print("Child fare applied")
elif age<=65:
    print("Adult fare applied")
else:
    print("Senior citizen fare applied")
print("--------------------")


#9
counter=1
while counter<=5:
    print("Count:", counter)
    counter+=1


#10
for item in range(1,11):
    print("Checking stock for item:",item)

#11
print("------MENU SELECTION LIST------")
choice=0
while choice==4:
    print("\n---Main Menu---")
    print("1.Add item")
    print("2.View items")
    print("3.Delete item")
    print("4.Exit")

choice=int(input("Enter your choice"))
if choice==1:
    print("Adding items")
elif choice==2:
    print("Viewing items")
elif choice==3:
    print("Deleting Item")
elif choice==4:
    print("Exiting")
else:
    print("Invalid choice . Please try again")
print("--------------------")
