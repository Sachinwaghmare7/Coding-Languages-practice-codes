#following code will be show you nested dictionry

student={
    "name":"prince",
    "subject":{
        "chem": 87,
        "phys": 67,
        "bio": 77,
        "math": 97 ,
        
    },
    "age":30,
    "class":"12th",
    
}
print(student)
print(student["subject"]["math"])
print(len(student))
print(list(student))
print(student.keys())          # this is all of the dictionary methods used in python language
print(student.items())  
print(student.update({"city":"dilhi"}))  
print(student) 