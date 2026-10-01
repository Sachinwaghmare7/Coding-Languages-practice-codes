collection = {1,2,3,4,2,"sachin", "ajay","sachin"}    # this is the set collection items unorderd form
print(collection)

num = set()            # this syntax is show the set writting
print(type(num))

num.add(1)
num.add(2)
num.add(2)          # duplicte element value not execute in set
print(num)
num.remove(1)
print(num)
num.clear()
print(num)



set ={2,4,5,1,6,}
print(set)
set.pop()
print(set)


# following code will be show you set union

set1 = {1,2,3,4,5}
set2 = {3,4,7}
print(set1.union(set2))
print(set1)
print(set2)
print(set1.intersection(set2))