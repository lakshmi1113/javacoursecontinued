# from sys import maxsize
# def createStack():
#     stack =[]
#     return stack

# def isEmpty(stack):
#     return len(stack) == 0

# def push(stack, x):
#     stack.append(x)
#     print(x,"has been pushed to stack")

# def pop(stack):
#     if isEmpty(stack):
#         return str(-maxsize -1)
#     return stack.pop(len(stack)-1)

# def peek(stack):
#     if isEmpty(stack):
#         return str(-maxsize -1)
#     return stack[-1]

# stack = createStack()
# print(isEmpty(stack), "stack is empty")
# push(stack,"10")
# push(stack,"20")
# push(stack,"10")
# print(pop(stack), "popped from stack")
# print(peek(stack),"peeked from stack")
# print(stack)
def calculateSpan(p, S):
    n = len(price)
    st =[]
    st.append(0)
    S[0] = 1

    for i in range(1,n):
        while (len(st)>0 and price[st[-1]] <= price[i]):
            st.pop()
        if (len(st)==0):
            S[i] = i+1
        else:
            st.append(i)

    def printArr(Array, n):
        for i in range(0,n):
            print(Array[i], end =" ")

    price = [10,5,20,15,40,25]
    S = [0 for i in range(len(price)+1)]

    calculateSpan(price, S)
    printArr(S, len(price))