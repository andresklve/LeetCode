def two_sum(nums, target):
    vistos = {}  # número -> índice

    for i, num in enumerate(nums):
        complemento = target - num

        if complemento in vistos:
            return [vistos[complemento], i]

        vistos[num] = i

    return []


nums = [1, 4, 8]
target = 12

print(two_sum(nums, target))  # pyright: ignore
