p= int(input())
profits=[int(x) for x in input().split()]
w= int(input())
weights=[int(x) for x in input().split()]
hw=int(input())
ratios=sorted([ (item[0],item[1]) for item in zip(profits,weights)],reverse=True,key=lambda item:item[1]/item[0])
count = 0
cost=0

c=0
while c < len(ratios):

  if ratios[c][1] + cost > hw:
    c+=1
    continue
  count+=ratios[c][0]
  cost+=ratios[c][1]
  c+=1
print (count)