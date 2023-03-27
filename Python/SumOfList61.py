# Write a python program to sum all the itemm in list.

total=0

list = [10, 20, 30]

for i in range(0, len(list)):
    total = total + list[i]

print("Sum of all elements in given list: ",total)
