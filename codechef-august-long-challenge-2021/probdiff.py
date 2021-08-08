

t = input()

for i in range(int(t)):
    l = list(map(int, input().strip().split()))
    a = set(l)

    if len(a) == 3 or len(a) == 4:
        print(2)
    elif len(a) == 2:
        if l.count(l[0]) == 2:
            print(2)
        else:
            print(1)
    elif len(a) == 1:
        print(0)


    
    
    

