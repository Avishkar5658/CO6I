# Write a python program to print Fibonacci series.

n = int(input("Enter the number of terms: "))

# initialize the first two terms
a, b = 0, 1

# check if the number of terms is valid
print("Fibonacci series:")
for i in range(n):
    print(a)
    a, b = b, a + b
