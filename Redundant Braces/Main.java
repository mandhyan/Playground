words=input()

operands=[]
flag= True

for letter in words:
  if letter.isalpha() is False:
    if letter != ')':
      operands.append(letter)
  if letter == ')':

    if len(operands) == 0:
      flag= False
      break
    else:
      
      new=operands.pop()
      
      count=0
      
      while new != '(':
 
        count+=1
        new=operands.pop()
      if count == 0:
        flag= False
        break
    
if flag:
  print ("No")
else:
  print ("Yes")