n, m = list(map(int, input().split(' ')))
numbers = list(map(int, input().split(' ')))
numbers.sort(reverse=True)
len = len(numbers)

def calc():
    result = sum = 0    
    for i in range(len-2):
        for j in range(i+1, len-1):
            for k in range(j+1, len):
                sum = numbers[i]+numbers[j]+numbers[k]
                if(sum <= m):
                    result = max(sum, result)    
    return result


print(calc())
