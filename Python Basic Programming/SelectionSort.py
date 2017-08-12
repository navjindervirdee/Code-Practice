
def selectionSort():
	size = int(input("Enter size : "))
	numbers = []
	for i in range(size):
		print('enter ',i+1, ' number: ')
		num = int(input())
		numbers.append(num)
        
	for i in range(len(numbers)):
		minnum = 10000000
		index = 0
		for j in range(i,len(numbers)):
			if minnum>numbers[j]:
				minnum = numbers[j]
				index = j
		temp = numbers[i]
		numbers[i] = numbers[index]
		numbers[index]=temp
	print('sorted : ' ,numbers)