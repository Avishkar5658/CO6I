# Create tuple and find the minimum and maximum number from it.

t=tuple()
n=int(input("Total number of values in tuple ")) #how many element u want to enter
for i in range(n):
    a=input("enter elements ") #Enter upper chose value
    t=t+(a,)
print ("maximum value=",max(t))
print ("minimum value=",min(t))