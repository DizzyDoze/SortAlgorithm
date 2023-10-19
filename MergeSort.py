def merge_sort(arr):
    """divide and merge"""
    if len(arr) < 2:
        return arr
    mid = len(arr) // 2
    # keep dividing until there's only 1 element and return
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    # then combine two sorted list
    return merge(left, right)


def merge(left, right):
    """merge two sorted list"""
    res = list()
    while left and right:
        if left[0] < right[0]:
            res.append(left.pop(0))
        else:
            res.append(right.pop(0))
    # rest of the nums in left
    while left:
        res.append(left.pop(0))
    # rest of the nums in right
    while right:
        res.append(right.pop(0))

    return res


if __name__ == '__main__':
    import random
    arr = [random.randint(10, 1000) for _ in range(20)]
    print(arr)
    res = merge_sort(arr)
    print(res)


