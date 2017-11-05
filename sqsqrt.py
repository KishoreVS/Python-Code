#To find the square and square root of given numbers
#Kishore
#16/9/2017
import random
options=['square','sq_root']
#To generate choices print(random.choice(options))
opt=random.choice(options)
num=random.randint(1,20)
# We define function
def sq(num):
    return num**2
def sqrt(num):
    return int((num**2) / num)
square =  sq(num)
sq_root = sqrt(num)
if opt == 'square':
    user_ip= input("To find the "+str(opt)+" of "+ str(num)+":")
    if int(user_ip) == square:
        print("The entered number " + str(user_ip) + "is correct for " +str(opt) + " for " + str(num))
    else:
        print("The enter number is wrong "+ "correct number is "+ str(square))  
        
else :
    user_ip= input("To find the "+str(opt)+" of "+ str(num)+":")
    if int(user_ip) == sq_root:
         print("The entered number " + str(user_ip) + "is correct for " +str(opt) + " for " + str(num))
    else:
        print("The enter number is wrong "+ "correct number is "+ str(sq_root))  
        

