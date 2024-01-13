def insertionSort(arr):
    """
    moving smaller element to the LEFT
    check backward, num at j smaller, move it to the LEFT.
    j<-j<-j<-j<-j  i
    7->8->2->3->9->1->0->4->6
    in-place, nothing return
    """
    for i in range(1, len(arr)):
        # start from current index i, moving backward, to index 0, exclusive since j-1==0
        for j in range(i, 0, -1):
            # j smaller, move it to the LEFT
            if arr[j] < arr[j-1]:
                arr[j], arr[j-1] = arr[j-1], arr[j]


if __name__ == '__main__':
    import random
    arr = [random.randint(1, 100) for _ in range(10)]
    print("Before: ", arr)
    insertionSort(arr)
    print("After: ", arr)
