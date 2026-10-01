marks = [94,32,34,46,64,66]    #in this code define the create list of items
print(marks[4])

student = ["sachin","42","waghmare"]
print(student[0])
student[0] = "ajay"
print(student)
print(student)


list = [7,4,5,6,2,3] 
print(list)
list.sort()          # sort in ascending order
print(list)
list.sort(reverse=True)      ## sorts in decending order
print(list)
print(list)                                      #  using this is the list methods
list.append(4)          # adds one element at the end

print(list)

list.insert(list[4],"sachin")    # insert element at index
print(list)


list2  = ["w","e","t","f","v","v","z","v"]
print(list2)
list2.reverse()         # this method is automatically arrange  last to first
print(list2)

list2.remove("v")
print(list2)        # remoeve first occurrence of element
print(list2.pop(3))
print(list2)
