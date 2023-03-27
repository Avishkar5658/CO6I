# Print the number in words.


def printValue(digit):

    if digit == '0':
        print("Zero ", end = " ")

    elif digit == '1':
        print("One ", end = " ")

    elif digit == '2':
        print("Two ", end = " ")

    elif digit=='3':
        print("Three",end=" ")

    elif digit == '4':
        print("Four ", end = " ")

    elif digit == '5':
        print("Five ", end = " ")

    elif digit == '6':
        print("Six ", end = " ")

    elif digit == '7':
        print("Seven", end = " ")

    elif digit == '8':
        print("Eight", end = " ")

    elif digit == '9':
        print("Nine ", end = " ")

def printWord(n):
    i = 0
    length = len(n)


    while i < length:


        printValue(n[i])
        i += 1

n = "1234"
printWord(n)