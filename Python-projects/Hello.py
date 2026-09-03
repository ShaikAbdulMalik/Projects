# This is a comprehensive notes/code for the kagge coursework
# This is used to write comments 
# Variable Assignment does not require declaration and we can assign any datatype
spam_amount = 0 
spam_amount = spam_amount + 4
# This is a function call used to display the values passed on to the screen
# print(spam_amount)
# We can use this code to get the type of datatype
# print(type(spam_amount)) 

a = 10
b = 5
# This is true division which used normally and its always in float datatype
print(a/b) 
# This is floor divsion that rounds off to the nearest integer
print(a//b)
print(5//2) # answer should be 2.5 but its 2 since its been rounded off
# Modulus operator gives us the remainder
print(a%b)
# Exponents operator
# This refers to 10 power 5
print(a**b)
# Negation operator
# prints the oposite sign to the value
print(-a)

# Builtin functions
# min() prints the min value from the given numbers
print(min(1,2,3,4)) 
# max() prints the max value from the given numbers
print(max(1,2,3,4))
# abs returns the absolute value which is excluding all the integer signs
print(abs(-32))
print(abs(32))

# int, float and String
# int is used to convert float or strings to integer type
print(int(12.2))
# float can be used to convert int or Strings to decimal type
print(float(129))
# They can be even used on Strings 
print(int('807')+1)

name = "Abdul Malik"
age = 20
current_year = 2026
graduation_year = 2027

years_remaining = graduation_year - current_year

print(name)
print(age)
print(years_remaining)  
print(name , 'has' , years_remaining , "year remaining until graduation.")
