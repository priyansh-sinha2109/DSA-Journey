# 1. Problem :- Print Name 5 times

Name = input("Enter the name :- ")
count = 0   

def Print_Name():
    global count
    if count == 5:
        return 
    else:
        print(Name)
        count = count + 1
    Print_Name()

Print_Name()


#2. Problem :- Print Linearly from 1 to N

N = int(input("Enter the number :- "))
count = 0

def Linearly_Print():
    global count
    if count == N:
        return
    else:
        print(count)
        count = count + 1
    Linearly_Print()

Linearly_Print()

#3. Problem :- Print N to 1

N = int(input("Enter the Last Number :- "))

count = N

def N_to_1():
    global count
    if count <= 0:
        return
    else:
        print(count)
        count = count - 1
    N_to_1()

N_to_1() 

#Alrenative method :-

def N_Times(i , N):
    if i > N:
        return
    else:
        print("raj")
    N_Times(i + 1 , N)

N_Times(1 , 5) 


# Question 4 :- 

N = int(input("Enter the N number :- "))

def one_to_N(i , N):
    if i < 1:
        return
    else:
        one_to_N(i-1 , N)
        print(i)

one_to_N(N , N)

#Question  5 :-

N = int(input("Enter the N number :- "))

def N_to_one(i , N):
    if i > N:
        return
    else:
        N_to_one(i+1 , N)
        print(i)

N_to_one(1 , N)


