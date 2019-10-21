#coding: utf-8

def mergesort(seq):
    """归并排序"""
    if len(seq) <= 1:
        return seq
    mid = len(seq) // 2  # 将列表分成更小的两个列表
    # 分别对左右两个列表进行处理，分别返回两个排序好的列表¥
    #
    #print('seq' , seq)
    left = mergesort(seq[:mid])
    #print('left', left)
    right = mergesort(seq[mid:])
    #print('right', right)
    return merge(left, right)
def merge(left, right):
    """合并两个已排序好的列表，产生一个新的已排序好的列表"""
    result = []  # 新的已排序好的列表
    i = 0  # 下标
    j = 0
    # 对两个列表中的元素 两两对比。
    # 将最小的元素，放到result中，并对当前列表下标加1
    counter = 0
    while i < len(left) and j < len(right):
        
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
            print(result)
        else:
            result.append(right[j])
            j += 1
            print(result)

    #result += left[i:]
    #result += right[j:]
    return result

seq = [5,3,0,6,1,4]
print ('排序前：',seq)
result = mergesort(seq)
print ('排序后：',result)
    



#mergesort([5, 3, 0, 6, 1, 4])

