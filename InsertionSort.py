def insertionSort(arr):
    """
    check backward, j bigger, move it forward.
    j<-j<-j<-j<-j  i
    7->8->2->3->9->1->0->4->6
    in-place, nothing return
    """
    for i in range(1, len(arr)):      # start from 1, leave a spot for j
        # save current element for later insertion after spot found
        cur = arr[i]
        # j be the backward index helping to find the insertion spot
        j = i - 1
        while j >= 0 and arr[j] > cur:
            # j is bigger, move it one step forward
            arr[j+1] = arr[j]
            # move j backward
            j -= 1
        # spot found, insert the element we save earlier
        arr[j+1] = cur


if __name__ == '__main__':
    import random
    arr = [random.randint(1, 100) for _ in range(20)]
    print("Before: ", arr)
    insertionSort(arr)
    print("After: ", arr)
