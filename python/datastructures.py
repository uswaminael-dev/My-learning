#lists are ordered , mutable type of datastructure that can contain different kind of datatypes
number_list=[1,2,3,4,5,6,7,8,9]
alphabets_list=["a","l","q","k","u"]
fruits=["mangoes","apples"]
print(number_list)

print(len(number_list)) #gives the length of list
print(sum(number_list)) #gives the sum of all the numbers in a list
print(sorted(alphabets_list)) #sorts in alphabetitical and nemerical order
print(list("lavendar")) #converts an iterable into a list

fruits.append("apricots")
print(fruits)

number_list.extend([10])
print(number_list)

fruits.insert(0,"peaches")
print(fruits)

alphabets_list.remove("u")
print(alphabets_list)

fruits.pop()
print(fruits)

fruits.clear()
print(fruits)

print(number_list.index(9))

print(alphabets_list.count("u"))

print(number_list.reverse())

print(max(number_list))

print(min(number_list))