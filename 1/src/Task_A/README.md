# Task_A. Interactor

Лена руководит разработкой тестирующей системы, в которой реализованы интерактивные задачи. 

До заверщения очередной стадии проекта осталось написать модуль, определяющий итоговый вердикт системы для интерактивной задачи. Итоговый вердикт определяется из кода завершения задачи, вердикта интерактора и вердикта чекера по следующим правилам:

- Вердикт чекера и вердикт интерактора — это целые числа от 0 до 7 включительно.
- Код завершения задачи — это целое число от -128 до 127 включительно.
- Если интерактор выдал вердикт 0, итоговый вердикт равен 3 в случае, если программа завершилась с ненулевым кодом, и вердикту чекера в противном случае.
- Если интерактор выдал вердикт 1, итоговый вердикт равен вердикту чекера.
- Если интерактор выдал вердикт 4, итоговый вердикт равен 3 в случае, если программа завершилась с ненулевым кодом, и 4 в противном случае.
- Если интерактор выдал вердикт 6, итоговый вердикт равен 0.
- Если интерактор выдал вердикт 7, итоговый вердикт равен 1.
- В остальных случаях итоговый вердикт равен вердикту интерактора.

Ваша задача — реализовать этот модуль.

## Input file format

Входной файл состоит из трёх строк. В первой задано целое число r (−128 ≤ r ≤ 127) — код завершения задачи, во второй — целое число i
(0 ≤ i ≤ 7) — вердикт интерактора, в третьей — целое число c(0 ≤ c ≤ 7) — вердикт чекера.

## Output file format

Выведите одно целое число от 0 до 7 включительно — итоговый вердикт системы.

## Example 1

Input:

    0   0   0

Output:

    0

## Example 2

Input:

    -1 0 1

Output:

    3

## Example 3

Input:

    42  1  6

Output:

    6

## Example 4

Input:

    44   7   4

Output:

    1

## Example 5

Input:

    1   4   0

Output:

    3

## Example 6

Input:

    -3   2   4

Output:

    2

