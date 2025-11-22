num=[]
number1=int(input("Enter 5 numbers 1:"))
number2=int(input("Enter 5 numbers 2:"))
number3=int(input("Enter 5 numbers 3:"))
number4=int(input("Enter 5 numbers 4:"))
number5=int(input("Enter 5 numbers 5:"))
num.append({
    "first":number1,
    "second":number2,
    "third":number3,
    "fourth":number4,
    "fifth":number5
})
num=[number1,number2,number3,number4,number5]
orignal=int(input("Enter Orignal:"))
while orignal in num:
        orignal *=2
        print(f"Found new value:{orignal}")
print("final value is:",orignal)