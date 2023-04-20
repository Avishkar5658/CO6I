#  Write a program to create a dictionary of student that includes their ROLL NO and NAME.
# i. Add three student above dictionary.
# ii. Update NAME= Shreyash of ROLL NO= 2
# iii. Delete information of ROLL NO= 1

Dict = {}
# Adding elements to dictionary one at a time
Dict[1] = 'Peter'
Dict[2] = 'Joseph'
Dict[3] = 'Ricky'
print("After Add: ",Dict)

Dict[2] = 'Shreyash'
print("After Update: ",Dict)

Dict.pop(1)
print("After Delete: ",Dict)