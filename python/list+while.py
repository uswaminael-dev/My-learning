

print("Ali has following girls in his following list;\n")
girls_list=["Fizzah", "Tayyaba", "Ariba","Maryam","Aiman"]
for girl in girls_list:
    print(girl)

def unfollow_question():
  try:
      response=input("Do you want him to unfollow all of them?\n Yes or No \n")
      if response.strip().lower()=="yes":
        print("Mr.Ali! You better go and unfollow all of them without justifying anything")
      elif response.strip().lower()=="no":
        print("Sadly, You are not sincere with Ali.")
      else:
        print("Invalid Input! Please enter YES or NO")
  except ValueError:
      print ("Invalid Input!\n Try Again")

unfollow_question()

action=input("Do you want to continue?\nYes/No\n") 

while (action.strip().lower()=="yes"):
    unfollow_question()
    action=input("Do you want to continue?\nYes/No\n") 
else:
    print("Thank You For Coming")