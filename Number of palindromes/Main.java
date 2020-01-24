import math

n =int(input())
pal=0
if n == 1:
  pal=9

else:
  for i in range(1,n+1):
    if i % 2 == 0:
      temp= 9 * (math.pow(10,(i-1)//2))
    else:
      temp= 9 * (math.pow(10,(i-1)//2))
    pal= pal+temp

print (int(pal))