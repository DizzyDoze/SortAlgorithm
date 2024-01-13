def bubble_sort(arr):
    # i rounds for i elements in the arr
    # worst case we have to go i rounds for each of the num
    for i in range(len(arr)):
        # last i nums must have been sorted
        for j in range(len(arr) - i - 1):
            # each time, we switch the bigger num to right side
            # arr[j] < arr[j + 1] for reversal
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]


# using flag to stop when sorting is finished
def bubble_sort_flag(arr):
    swap = True
    while swap:
        # in the beginning of every round, NO swap happened
        swap = False
        for i in range(len(arr)-1):
            if arr[i] > arr[i+1]:
                arr[i], arr[i+1] = arr[i+1], arr[i]
                swap = True
    # no swap happened, exit the loop



if __name__ == '__main__':
    import random
    arr = [random.randint(0, 100) for _ in range(10)]
    print(arr)
    # bubble_sort(arr)
    bubble_sort_flag(arr)
    print(arr)

