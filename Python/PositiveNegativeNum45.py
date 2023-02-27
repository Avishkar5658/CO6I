# Write a program to check if a number is positive, negative or zero.

num = float(input("Enter a number: "))
if num > 0:
   print(num,"is positive number")
elif num == 0:
   print("Number is Zero")
else:
   print(num,"is negative number")