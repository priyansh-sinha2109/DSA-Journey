n = int(input("Enter the number :- "))

for i in range(0 , n):
    #Space
    for j in range(0 , n - i - 1):
        print(" " , end="")
    #Star
    for q in range(0 , ((2 * i) + 1)):
        print('*' , end="")
    #Space
    for k in range(0 , n - i - 1):
        print(" " , end=" ")
    print(" ")
for i in range(0 , n):
    #Space
    for j in range(0 , i):
        print(" " , end="")
    #Star
    for q in range(0 , 2*n - ((2*i) + 1)):
        print('*' , end="")
    #Space
    for k in range(0 , i):
        print(" " , end=" ")
    print(" ")