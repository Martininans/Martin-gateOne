matrix = [['' for _ in range(3)] for _ in range(3)]
print("Enter characters (x or o):")
for counter in range(3):
        for count in range(9):
                matrix[counter][count] = input()[0]

        for row in matrix:
            print(' '.join(row))
        
