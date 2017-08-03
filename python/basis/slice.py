tag = '<a href="http://wwww.python.org">Python web site</a>'
print tag[9:31]  # pick up    http://www.python.org
print (tag[33:-4])  # pick up   Python web site
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print numbers[4:7]     #[5,6,7]
print numbers[-3:-1]   #[8,9]
print numbers[-3:]     #[8,9,10]
print numbers[:3]      #[1,2,3]
print numbers[:]       #[1,2,3,4,5,6,7,8,9,10]

#with steps
print numbers[::2]     #[1,3,5,7,9]
print numbers[2::3]    #[3,6,9]
print numbers[8:3:-1]  #[9,8,7,6,5]