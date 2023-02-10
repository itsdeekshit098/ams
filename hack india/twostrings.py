
def twoStrings(s1, s2):
    l=0
    for i in range(0,len(s1)):
        for j in range(0,len(s2)):
            if(s1[i]==s2[j]):
                l=l+1
    if(l>=1):
        return "YES"
    else:
        return "NO"       
n=int(input())            
for i in range(1,n+1):
    s1=input()
    s2=input()
    print(twoStrings(s1,s2))
