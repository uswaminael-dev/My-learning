print("------ PYTHON ASSIGNMENT WEEK 01 ------")

print("\n__Task 1__\nVARIABLES\n")
#Declare a variable called 'student_name' and assign your name as a string
student_name="Uswa Minael"
#Declare a variable called 'course_credits' and assign the number of credits for this course as an integer
course_credits=3
#Declare a variable called 'is_enrolled' and assign a boolean value
is_enrolled=True
print("\n-------------------\n")


print("\n__Task 2__\nPRINTING & CONCATENATION\n")
#print the value of student_name
print(student_name)
#print the value of course_credits
print(course_credits)
#print the value of is_enrolled
print(is_enrolled)
#concatenate a string like "Hello,[student_name]! You are taking a course with [course_credits] credits." and print it.
print(f"Hello,{student_name}! You are taking a course with {course_credits} credits")
print("\n-------------------\n")

print("\n__Task 3__\nARIHMETIC OPERATIONS\n")
#declare two integer variables , num_a and num_b.
num_a=45
num_b=5
#add num_a and num_b and print the result.
print(num_a + num_b)
#subtract num_b from num_a and print the result.
print(num_a - num_b)
#multiply num_a and num_b and print the result.
print(num_a * num_b)
#divide num_a by num_b and print the result.
print(num_a / num_b)
print("\n-------------------\n")

print("\n__Task 4__\nRELATIONAL OPERATIONS\n")
#use the same num_a and num_b variables from the previous task
#check if num_a is equal to num_b and print the result
a=num_a==num_b
print (a)
#check if num_a is not equal to num_b and print the result
b=num_a!=num_b
print (b)
#check if num_a is grater than num_b and print the result
c=num_a>num_b
print (c)
#check if num_a is smaller than num_b and print the result
d=num_a<num_b
print (d)
print("\n-------------------\n")

print("\n__Task 5__\nUSING INPUT()\n")
#use the input() functionto ask the user "What is your favourite subject?" and store the reponse in a variable 'favourite_subject'.
favourite_subject=input("What is your favourite subject?\n")
#print a message like "Your favourite subject is [favourite_subject]."
print(f"Your favourite subject is {favourite_subject}.")
print("\n-------------------\n")

print("\n__Task 6__\nTYPE CONVERSION\n")
#use the input() function to as the user "How many hours did you study today?" and store the response in a variable  called 'study_hours_str'.
study_hours_str=input("How many hours did you study today?\n")
#convert the 'study_hours_str' variable from a string to an integer and store it in a variable called ' study_hours_int'
study_hours_int=int(study_hours_str)
#print the datatype of 'study_hours_int' using the type function .
print(type(study_hours_int))
print("\n-------------------\n")

print("\n__Task 7__\nSIMPLE CALCULATOR(SUBTRACTION)\n")
#use the input() function  to ask the user for the first number and convert it into an integer . Store i n a variable called 'first_num'.
first_num=int(input("Enter the first number: "))
#use the input() function  to ask the user for the second number and convert it into an integer . Store i n a variable called 'second_num'.
second_num=int(input("Enter the second number: "))
#subtract 'second_num' from 'first_num' and store the resultin a variable caled 'difference'
difference=first_num-second_num
#print the result in a clear message , like  "The difference is:[difference]".
print(f"The difference is: {difference}")
print("\n-------------------\n")