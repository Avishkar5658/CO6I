# Write a python program to multiplies all the item in list.

def multiplyList(list):

    result = 1
    for i in list:
        result = result * i
    return result

list1 = [1, 2, 3]
list2 = [3, 2, 4]
print(multiplyList(list1))
print(multiplyList(list2))
