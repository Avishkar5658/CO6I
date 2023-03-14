# Write a Python program to calculate factorial of a number.

n = int(input("Enter a number: "))

# check if the input is valid
factorial = 1
for i in range(1, n + 1):
   factorial *= i
   print("Factorial of", n, "is", factorial)
