import random

fruits=['apple','banana','orange','cherry','mangoes','grapes','kiwi']
print (fruits)

print (fruits[0]) #getting something in file through indexing
print (fruits[2])

fruits[0]="watermelon" #changing value at a specific index

print(fruits)

random_fruit=random.choice(fruits) #giving random value from the list mentioned
print(random_fruit)

random.shuffle(fruits)
print(fruits)  # random.shuffle() shuffles the list in place and returns None

numbers=[1,2,3,4,5,6,7,8,9,0]
a=random.uniform(200,900)  #returns a random float between the arguments given
print(a)

random.shuffle(numbers)
print(numbers)