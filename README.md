сами джакоко объясняют свою формулу проще, чем википедия, а именно:

number of branches (B) and the number of decision points (D): v(G) = B - D + 1

Правда абсолютно не объясняют соотношение: элемент - счетчик - значение (и в интернетах я этого не нашла).

Есть их пом-файл, где можно предположить, что элементом является метод, счетчиком комплексити, а значение для него тоже coveredratio.

Какое рекомендуемое покрытие - этого я тоже не нашла, но предположим, что от 0,6 до 0,8 судя по следам во все том же интернете.

Полагаю, что чем сложнее методы, тем разумнее уменьшать этот показатель, поскольку к 100% покрытию стремиться нет смысла, цель разработки не в этом.

Но у меня 100% покрытие тестами, поэтому я установила точно такое же 100% ratio, и в метриках от джакоко не вижу ни одного missing для колонки Cxty, в которой в свою очередь и подсчитывается то смое количество тестов на метод.

И то хлеб. Но хотелось бы конечно найти инструкцию, хоть на немецком, раз на русском и англйском гугл не поддается.

