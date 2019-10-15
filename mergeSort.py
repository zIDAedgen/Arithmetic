#coding: utf-8

def mergesort(seq):
    """归并排序"""
    if len(seq) <= 1:
        return seq
    mid = len(seq) // 2  # 将列表分成更小的两个列表
    # 分别对左右两个列表进行处理，分别返回两个排序好的列表¥
    print('seq' , seq)
    left = mergesort(seq[:mid])
    print('left', left)
    right = mergesort(seq[mid:])
    print('right', right)
    



mergesort([5, 3, 0, 6, 1, 4])

