
# -------------------------------------------------------------------
# Вводные данные
arr = [72, 72, 73, 68, 71, 77, 74, 67, 68, 71, 74, 69, 69, 81, 68, 67,
        76, 67, 68, 69, 70, 69]
alpha = 0.01
# -------------------------------------------------------------------
# Инициализирующиеся данные
N = len(arr) # Выборка
k = N-1 # Число степеней свободы
# -------------------------------------------------------------------
xAriphmetic = sum(arr)/len(arr)
print("Среднее арифметическое:", xAriphmetic)

sSelective = sum([(i - xAriphmetic)**2 for i in arr])/N
print("Выборочкая дисперсия:", sSelective)

S = (N/(N-1))*sSelective
print("Исправленная дисперсия:", S)
print("Корень из испр. дисп.:", S**(1/2))

