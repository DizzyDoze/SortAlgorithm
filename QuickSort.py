def quicksort(arr, left, right):
    if left < right:
        p = partition(arr, left, right)
        quicksort(arr, left, p-1)
        quicksort(arr, p+1, right)


def partition(arr, left, right):
    pivot = arr[right]
    # take pointer i as the partitioner
    # numbers smaller than pivot is on i's left
    # numbers larger than pivot is on i's right
    # pointer i will be the index for pivot after all the switches
    #          j
    # [2,1,7,8,3,5]
    #      i
    i = left
    for j in range(left, right):
        # KEY: j smaller, move it to the left, i++
        if arr[j] < pivot:
            arr[i], arr[j] = arr[j], arr[i]
            i += 1
    # put pivot into i spot
    arr[i], arr[right] = arr[right], arr[i]
    # KEY: smaller numbers | partition point i | larger numbers
    return i


if __name__ == "__main__":
    import random
    arr = [random.randint(1, 100) for _ in range(20)]
    print("Before: ", arr)
    quicksort(arr, 0, len(arr) - 1)
    print("After: ", arr)
