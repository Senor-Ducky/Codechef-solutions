t = input()

for i in range(int(t)):
    g1,s1,b1,g2,s2,b2 = input().split()
    sum_1 = int(g1)+int(s1)+int(b1)
    sum_2 = int(g2)+int(s2)+int(b2)

    if(sum_1 > sum_2):
        print(1)
    else:
        print(2)