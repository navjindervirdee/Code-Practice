def printList(nested_list,indent=False,level=0,):
	for element in nested_list:
		if(isinstance(element,list)):
			printList(element,indent,level+1)
		else:
			if(indent):
				for l in range(level):
					print('\t',end='')
			print(element)

	
			
