def bubble_sort(arr):
    for i in range(len(arr)):
        # last i nums must have been sorted
        for j in range(len(arr) - i - 1):
            # each time, we switch the bigger num to right side
            # arr[j] < arr[j + 1] for reversal
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


if __name__ == '__main__':
    import random
    arr = [random.randint(0, 100) for _ in range(10)]
    print(arr)
    bubble_sort(arr)
    print(arr)

