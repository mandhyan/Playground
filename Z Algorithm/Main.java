words = input()
pat= input()
lpat=len(pat)
lwords=len(words)
window=0
flag= False
while window+lpat-1 < lwords:
  if words[window:window+lpat] == pat:
    flag= True
    print ("Found pattern at index {}".format(window))
    break
  window+=1