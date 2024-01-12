def selection_sort(arr):
    """
    [3, 2, 5, 1]
     i  -------
           j
    1. find the smallest element in [i+1, len-1]
    2. swap it with current index i

    Time Complexity: O(n^2) double loops
    Space Complexity: O(1)  no extra space

    inplace, nothing return
    """
    for i in range(len(arr)):
        min_idx = i
        for j in range(i+1, len(arr)):
            # smaller j found, update as min_idx
            if arr[j] < arr[min_idx]:
                min_idx = j
        # swap the smallest index min_idx with current index i
        arr[i], arr[min_idx] = arr[min_idx], arr[i]


if __name__ == '__main__':
    import random
    arr = [random.randint(0, 100) for _ in range(20)]
    print(arr)
    selection_sort(arr)
    print(arr)
