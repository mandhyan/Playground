q=[]
while True:
  n = int(input("Enter the value to insert:"))
  print ("")
  if n == -1:
    break
  p = int(input("Enter the priority of that value:\n"))
  q.append((p,n))
for each in sorted(q):
  print (each[1],end=" ")
  