# DAY 3 OF HACKERRANK 30 DAY CHALLENGE: INTRO TO CONDITIONAL STATEMENTS (PYTHON)

N = int(input().strip())

if N % 2 == 1:
    print("Weird")
else:
    if N >= 2 & N <= 5:
        print("Not Weird")
    if N >= 6 & N <= 20:
        print("Weird")
    if N > 20:
        print("Not Weird")
