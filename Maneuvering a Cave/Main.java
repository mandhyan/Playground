n,m=[int(x) for x in input().split()]
def cave(n,m):
  if n == 1 or m == 1:
    return 0
  else:
    return 1 + cave(n-1,m) + cave(n,m-1)

print (cave(n,m)+1)