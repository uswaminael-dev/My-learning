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
