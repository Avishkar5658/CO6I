# write a program to create class employee with id and name and display its contents.


class Emp:

    id = 0
    name = ""

    def __init__(self,id,name):
        print("Id:",id)
        print("Name:",name)

e = Emp(1,"avi")
