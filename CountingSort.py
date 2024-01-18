"""
1. count occurrence of each num, counts[num] = occurrence of num
2. overwrite original counts with start index of each num
3. fill sorted list by start index
"""


def counting_sort(arr):
    # for all range of nums, including negative nums
    mx, mn = max(arr), min(arr)
    offset = -mn
    length = mx - mn + 1
    # eg. max is 5, we need 0, 1, 2, 3, 4, 5 to store the counts, which is 6
    counts = [0] * length

    # update count of each num into counts
    for num in arr:
        counts[num+offset] += 1
    # print("counts: ", counts)

    # we now overwrite our original counts with the starting index of each element
    start_idx = 0
    for i, count in enumerate(counts):
        # number i starts at start_idx
        counts[i] = start_idx
        # start_idx + count -> the start_idx for next number
        start_idx += count

    # print("start_idx: ", counts)

    sorted_ls = [0] * len(arr)
    # fill
    for num in arr:
        # counts[num-offset] -> the start index the current num should be put
        sorted_ls[counts[num-offset]] = num
        # same number should be put to the next index
        counts[num-offset] += 1

    return sorted_ls


if __name__ == '__main__':
    import random
    arr = [random.randint(-5, 5) for _ in range(10)]
    print("before: ", arr)
    sorted_ls = counting_sort(arr)
    print("after: ", sorted_ls)


