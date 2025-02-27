a = [1,4,2,3]

print(f"Original Array: {a}")

def reverse(a):
    rev = []
    index = len(a) - 1

    while index >= 0:
        rev.append(a[index])
        index -= 1
    print(f"Reversed Array: {rev}")    

reverse(a)