import math

t = int(input())

for i in range(t):
    g = int(input())
    for j in range(g):
        k,n,q = input().split()
        

        if int(k) == 1:
            if int(q) == 1:
                print(math.floor(int(n)/2))
            else:
                print(math.ceil((int(n)/2)))
        elif int(k) == 2:
            if int(q) == 1:
                print(math.ceil((int(n)/2)))
            else:
                print(math.floor(int(n)/2))
            
        

                
