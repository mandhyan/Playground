words=input()
count={}
for each in words:
  if each in count:
    count[each]+=1
  else:
    count[each]=1
for each in sorted(count):
  print ("{}:{}".format(each,count[each]))
