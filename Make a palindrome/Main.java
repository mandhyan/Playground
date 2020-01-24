n= input()
count = 0

def ispal(s):
  if s == s[::-1]:
    return True
  else:
    return False


while count < len(n):

  check=ispal(n[count:])
  if check is False:
    count+=1
  else:
    break

print (count)
