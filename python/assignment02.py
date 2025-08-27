print("------ PYTHON ASSIGNMENT WEEK 02 ------")

print("---FILE HANDLING---")

print("_____Task 1_____")
#writing to a file
file = open('my_first_file.txt', 'w')
write= file.write("Hello, File Handling.!")
file.close()
print("---------------")

print("_____Task 2_____")
#reading from a file
file = open('my_first_file.txt', 'r')
read = file.read()
file.close()
print("File Content:")
print(read)
print("---------------")

print("_____Task 3_____")
#appending to a file
with open('my_first_file.txt', 'a') as file:
    file.write("\nAppending new content.")
    print("Content appended.")
with open('my_first_file.txt', 'r') as file:
    read = file.read()
    print("File Content After Appending:")
    print(read)
print("---------------")

print("_____Task 4_____")
#handling file not found error
try:
 with open('second_file.txt', 'r') as file:
    read = file.read()
    print(read)
except FileNotFoundError:
    print("File not found.")
print("---------------")

print("---EXCEPTION HANDLING---")

print("_____Task 1_____")
#basic try-except block
try:
    age=input("Enter your age: ")
    conversion=int(age)
    print (conversion)
except ValueError:
    print("Invalid input. Please enter a number.")
print("---------------")

print("_____Task 2_____")
#Handling ZeroDivisionError
try:
    num_1=int(input("Enter first number: "))
    num_2=int(input("Enter second number: "))
    division=num_1/num_2
    print("Division Result:", division)
except ZeroDivisionError:
    print("Division by zero is not allowed.")
except ValueError:
    print("Invalid input. Please enter a valid number.")   
print("---------------")

print("_____Task 3_____")
#using the finally block
try:
    with open('my_first_file.txt', 'r') as file:
        content = file.read()
        print("File Content:")
        print(content)
except FileNotFoundError:
    print("File not found.")
finally:
    print("Attempted File Operation.")
print("---------------")

print("---DATA ANALYSIS WITH NUMPY---")

print("_____Task 1_____")
#creating and squaring a NumPy array
import numpy as np
my_array=np.array([1,2,3,4,5,6,7,8,9,10])
squared_array=my_array**2
print("Original Array:", my_array)
print("Squared Array:", squared_array)
print("---------------")

print("_____Task 2_____")
#element-wise operations with NumPy arrays
array1=np.random.randint(0,21,5)
array2=np.random.randint(0,21,5)
sum_array=array1+array2
product_array=array1*array2
print("Array 1:", array1)
print("Array 2:", array2)
print("Sum Array:", sum_array)
print("Product Array:", product_array)
print("---------------")

print("_____Task 3_____")
#basic statistical calculation with NumPy
data:float=np.random.randint(0,101,20)
mean=data.mean()
median=np.median(data)
std_dev=data.std()
print("Mean:", mean)
print("Median:", median)
print("Standard Deviation:", std_dev)
print("---------------")

print("_____Task 4_____")
#array slicing,indexing and filtering
array=np.random.randint(1,51, size=(4,5))
print("Original Array:")
print(array)
first_two_rows=array[:2]
print("Sliced Array (First 2 Rows):")
print(first_two_rows)
last_three_columns=array[:,-3:]
print("Sliced Array (Last 3 Columns):")
print(last_three_columns)
element=array[1,2]
print("Element at (1,2):", element)
greater_than_25=array[array > 25]
print("Elements Greater Than 25:")
print(greater_than_25)
print("---------------")

print("---DATA ANALYSIS WITH PANDAS---")
import pandas as pd
print("_____Task 1_____")
#creating and analyzing a pandas series
my_series=pd.Series([15,22,30,45,50,12,8,35])
mean=my_series.mean()
print(mean)
maximum=my_series.max()
print(maximum)
print("---------------")

print("_____Task 2_____")
#creating and exploring pandas dataframe
student_df={
    "Name": ["Anoosha", "Ayesha", "Rameen", "Amina"],
    "Age": [16, 17, 18, 16],
    "Score": [85.5, 90.0, 78.5, 88.0],
    "GPA": [3.8, 3.9, 3.7, 3.6]
}

student_df=pd.DataFrame(student_df)
print(student_df)
print("---------------")

print("_____Task 3_____")
#basic data analysis with dataframe
descriptive_statistics=student_df.describe()
print(descriptive_statistics)

greater_gpa=student_df[student_df["GPA"] > 3.7]
print(greater_gpa)
print("---------------")

print("_____Task 4_____")
#grouping and aggregating data
gpa_groups=student_df.groupby("GPA").size()
print(gpa_groups)
print("---------------")

