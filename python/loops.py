# # # a=int(input("enter your number:"))
# # count = 1
# # while count <= 10:
# #     print("welcome in alone world")
# #     count += 1
    
    
    
# i = 1                     # this is the while loop increasing numbers
# while i <= 1000:
#     print(i)
#     i+=1
    
    
# i = 100              # this  is the decreasin numbers for using while loop
# while i >= 1:
#     print(i)
#     i-=1
    
    
    
    #multipliction table by the no 3
    
# a = 1
# n = int(input("enter your no:"))
# while a <= 10:
#         print(a*n)
        # a+=1
        
        
        
# a = 1                      #following code will be print 1 to 10 no powers
    
# while a <= 10:
#         print(a**2)       # FIRST CHECK IN LOOPING  STATEMENT HOW VALUE WILL BE CHANGED #
#         a+=1
        
        
# in looping statement print list values

# num =["1","2","4","9","16","25","36","49","64","81","100"]   

# idx =0
# while idx < len(num):       # traverse
#     print(num[idx])
#     idx+=1




#in tuple using looping statemet find the fix value otherwise random value

# nums =("1","2","4","9","16","25","36","49","64","81","100","36")

# x="36"

# i=0
# while i < len(nums):
#     if(nums[i] == x):
#         print("i found by:",i)
#         break                         # used to terminate the loop when encountered 
#     else:
#         print("FINDING...")
#     i += 1
    
    
# i = 0
# while i<= 5:
#         if(i == 3):
#             i += 1
#             continue        #terminate execution in the current iteration & continues execution of the loop with                    the            next                    iteration 
#         print(i)
#         i += 1
        
        
#         i=0
#         while i<= 10:
#             if(i%2== 0):
#                 i+=1
#                 continue # skip 
#             print(i)
#             i+=1
            
            # following code is show the list of items print for loop through
            
cars = ["dudage","buggati","farari","mastang"]
for val in cars:
    print(val)
    
    
    
str = "sachin waghmare"
for char in str:                              # this for loop code print each character
    if(char == "m"):
         print("m is found")
         break
    print(char)
else:
    print("end")