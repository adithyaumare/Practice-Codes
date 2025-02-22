def pattern(n):
    #increasing loop
    for i in range(0, n, +1):
        for j in range(0, i):
            print("* ", end="")
        print("\r")

    #decreasing loop
    for i in range(n, 0, -1):
        for j in range(0, i):
            print("* ", end="")
        print("\r")

number = int(input("Enter a number: "))
pattern(number)