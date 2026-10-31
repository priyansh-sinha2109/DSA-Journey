N = int(input("Enter the number :- "))

for i in range(0 , N):
    for j in range(0 , i+1):
        print("*" , end="")
    print("")
for i in range(1 , N+1):
    for j in range(0 , N - i + 1):
        print("*" , end="")
    print("")