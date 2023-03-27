# Write a program to find common items from to items.

def CommonItem(a, b):
    setA= set(a)
    setB = set(b)

    if (setA & setB):
        print(setA & setB)
    else:
        print("No common elements")


a = [4, 5]
b = [5, 6]
CommonItem(a, b)

a = [1, 2]
b = [6, 7]
CommonItem(a, b)
