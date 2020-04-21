import math


# N всего элементов
# x_i числа (1 столбик)
# n_i кол-во x_i (2 столбик)
# n_i/N частота (3 столбик)
# k шаг таблицы 
# 
# round(x, y): x - округляемое, y - до скольких знаков округлить

N = 69
x_i = [0, 1, 2, 3, 4, 5, 6]
n_i = [6, 11, 21, 15, 6, 9, 1]
k = 1
# ----------------------------------------------
# N = 66
# x_i = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
# n_i = [1, 6, 5, 10, 12, 13, 10, 8, 0, 1]
# k = 1
# ----------------------------------------------

# N = 79
# x_i = [0, 1, 2, 3, 4, 5, 6, 7]
# n_i = [4, 13, 14, 24, 16, 3, 3, 2]
# k = 1


verojatnost = []
poligon = []

# 1 Размах
z = max(x_i) - min(x_i) + 1
print("Размах:", z)

# 2 TODO Дописать полигон накопленных частот
for i in range(z):
    verojatnost.append(round(n_i[i]/N, 4))


print("Вероятности:", verojatnost)

# 3 средне арифметическое (проверенно)
lowSum = lambda x_i, n_i: x_i*n_i
l = [lowSum(x_i[i], n_i[i]) for i in range(z)]
sred = round(sum(l)/N, 4)
print("Среднее арифметическое:", sred)

# 4 дисперсия (проверенно)
c = x_i[n_i.index(max(n_i))]
dispSum = lambda x_i, c, k, n_i: n_i*(((x_i - c)/k)**2)
S = []
S = [round(dispSum(x_i[i], c, k, n_i[i]), 4) for i in range(z)]
disp = round((k**2/N) * sum(S) - (sred - c)**2, 4)
print("Дисперсия:", disp)


# 5 Отклонение:
print("Отклонение sqrt(S^2):", round(math.sqrt(disp), 4))
