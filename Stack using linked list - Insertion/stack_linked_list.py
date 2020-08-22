n=[]
while True:
  m=int(input())
  if m == -1:
    break
  else:
    n.append(m)

if len(n) == 0:
  print (" ")
else:
  for i in range(len(n)):
    print (n.pop(),end=" ")
    