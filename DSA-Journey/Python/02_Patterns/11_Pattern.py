n = int(input("Enter the number :- "))

start = 1
for i in range(0 , n):
    if i % 2 == 0:
        start = 1
    else:
        start = 0
    for i in range(0 , i+1):
        print(start , end="")
        start = 1 - start
    print("")
    