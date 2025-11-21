file=open('myFile.txt', 'r')
content = file.read()
print(content)
file.close()

file=open('myFile.txt', 'a')
file.write("Appending a new line.\n")
file.close()

file=open('myFile.txt', 'w')
file.write("don't start this time , CONTINUE.\n")
file.close()

students=["Umar","Usman","Fahad"]
with open('myFile.txt', 'w') as file:
    for student in students:
        file.write(student + "\n")

import csv
with open('newFile.csv','w', newline='') as file:
    writer=csv.writer(file)
    writer.writerow(['Name','Age','City'])
    writer.writerow(['Umar',20,'Karachi'])
    writer.writerow(['Usman',21,'Lahore'])
    writer.writerow(['Fahad',22,'Islamabad'])
with open('newFile.csv', 'r') as file:
    reader = csv.reader(file)
    for row in reader:
        print(row)
        