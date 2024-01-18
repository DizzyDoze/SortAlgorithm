"""
Extension of Counting Sort
1. do Counting Sort for each of the digit, from Left to Right(LSD: Least Significant Digit)
2. use place_val for current digit calculation, place_val *= 10 each round
3. deal with the offset for probably negative nums
"""


def counting_sort(arr, place_val, K=10):
    """
    :param arr: current arr
    :param place_val: current digit spot, 1, 10, 100...
    :param K: length of the maximum digit, 10 for int, 26 for english letters, etc
    :return: new sorted list or in place sort, both will do
    """
    counts = [0] * K
    # count occurrence of each digit
    for num in arr:
        # get current digit
        digit = (num // place_val) % 10
        counts[digit] += 1

    # overwrite counts with start index
    start_idx = 0
    for i, count in enumerate(counts):
        counts[i] = start_idx
        # start_idx + count => start index for next number
        start_idx += count

    # sort the elem in original array
    sorted_ls = [0] * len(arr)
    for elem in arr:
        # KEY: always get current digit, we are sorting by digit, not element itself
        digit = (elem // place_val) % 10
        # counts[digit] => the start index for element with current digit
        sorted_ls[counts[digit]] = elem
        # start index for the element increase by 1 for the next same element
        counts[digit] += 1

    for i in range(len(sorted_ls)):
        arr[i] = sorted_ls[i]

    # return sorted list instead of in place replacement is also fine


def radix_sort(arr):
    mx, shift = max(arr), min(arr)
    # inplace shift minimum num to 0([:] means using the same reference, not a new one)
    arr[:] = [num - shift for num in arr]

    place_val = 1
    while place_val <= mx:
        # sort by current digit
        counting_sort(arr, place_val)
        # move to the next digit
        place_val *= 10

    # unshift back
    arr[:] = [num + shift for num in arr]


if __name__ == '__main__':
    import random
    arr = [random.randint(-5, 5) for _ in range(10)]
    print("before: ", arr)
    radix_sort(arr)
    print("after: ", arr)