n= 0
q=[]
while True:
  n= int(input())
  if n == -1:
    break
  else:
    q.append(n)
for i in range(len(q)):
  print (q[0],end=" ")
  q.pop(0)