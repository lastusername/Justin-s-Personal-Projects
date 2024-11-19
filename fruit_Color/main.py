import os
def ask4Name():
  global ask4Name
  name = input( "Please enter your first name and last name: ") 

  space = name.find(" ")
  print("Number of blank positions:" , space)

  firstname = name[0: space]. capitalize()
  print("First name =" ,firstname)

  lastname = name[space : ] .title()
  print("Last name =", lastname)

  print ("Welcome," + lastname + ", " + firstname)
  return() 

path ='fruitf.txt'
if os.path.exists("fruitf.txt"):
  os.remove("fruitf.txt")
  os.remove("colorf.txt")
  os.remove("bothf.txt")
def numOfFruits():
 correct = True
 while correct:
  try:
    global total
    total = int(input("How many fruit(s) do you want to enter: "))
    correct = False
  except ValueError:
    askuser = input("oh no! You didn't enter a correct amount. Want to re-enter the correct amount? (y/n):")
    if askuser.lower() == "y":
      correct = True
    else:
      correct = False
      total = 0
      print("alright, bye")
  return()

 
fruitl = []
colorlist = []




def fruitbowl():
     global fruit
     
     fruitl.append(fruit)

     fruitFile = open("fruitf.txt","a")
     fruitFile.write(fruit + "\n")
     fruitFile.close()
     return()

def colorbowl():
     global color
     color = input("now enter the color the corresponds with" + " " + " " + fruit + " " + ":")
     colorlist.append (color)

     colorFile = open("colorf.txt", "a")
     colorFile.write(color + "\n")
     colorFile.close()

     bothFiles = open("bothf.txt","a")
     bothFiles.write(fruit+"'s color is "+color+"\n")
     bothFiles.close()
     return()
ask4Name()
numOfFruits()

def File():
  global bothf
  global colorf
  global fruitf
  fruitf = open("fruitf.txt","a")
  fruitf.write("These are the fruits you entered:\n")
  fruitf.close()

  colorf = open("colorf.txt","a")
  colorf.write("These are the colors you entered:\n")
  colorf.close()
 
  bothf = open("bothf.txt","a")
  bothf.close()
  return()
File()

def Program():
   global fruit
   for x in range(total):
     fruit = input("Enter fruit: "+str(x+1)+": ")
     fruitbowl()
     colorbowl()
     askuser = input("would you like to continue? (y/n):")
     if askuser.lower() == "n":
      print("oh ok")
      break
      return()
Program()

b = open("bothf.txt", "r")
print(b.read())

