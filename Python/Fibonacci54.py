# Write a python program to print Fibonacci series.

n = int(input("Enter the number of terms: "))

# initialize the first two terms
a, b = 0, 1

# check if the number of terms is valid
if n <= 0:
   print("Invalid input!")
elif n == 1:
   print(a)
else:
   print("Fibonacci series:")
   for i in range(n):
       print(a)
       a, b = b, a + b
