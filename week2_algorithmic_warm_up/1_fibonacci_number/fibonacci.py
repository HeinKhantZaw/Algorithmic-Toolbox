# python3
def fibonacci_number_naive(n):
    if n <= 1:
        return n

    return fibonacci_number_naive(n - 1) + fibonacci_number_naive(n - 2)


def fibonacci_number(n):
    if n <= 1:
        return n
    num = [0] * (n)
    num[0] = 1
    num[1] = 1
    for i in range(2, n):
        num[i] = num[i - 1] + num[i - 2]
    return num[n - 1]

if __name__ == '__main__':
    input_n = int(input())
    print(fibonacci_number(input_n))

