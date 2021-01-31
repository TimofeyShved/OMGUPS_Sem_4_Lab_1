fun charSort(word: String): String {
    println("Ouuuu! O.o")
    return ""+word
}

fun main()
{
    println(charSort("Hi"))
/*
    val words = WordWithIndex::class.java.getResource("20k.txt")
        .readText()
        .split("\n")
        .filter { it.length>10 }
        .toTypedArray()
*/

    print("------------------------Arrey---4---char-----------------------\n")

    val arrayString: Array<String> = arrayOf(			// Создаем массив слов
        "gora",
        "roga",
        "free",
        "doma",
        "refe",
        "rago"
    )

    var a1:String=""//arrayOfNulls<Char>(200)
    var a2 = emptyArray<Char>()  //Array(200){}
    var k:Int
    var h:Int=0
    var flag:Int
    var i:Int=0
    var j:Int=0
    var dop : Char							//переменные

    while(i<arrayString.size) // цикл по i
    {
        while(j<arrayString[i].length)				// 2 цикл по j
        {
            print(" ${arrayString[i][j].toChar()} |" );		// вывод на экран
            j++
        }
        j=0
            print("\n");
        i++
    }
    print("\n");
    i=0

    while(i<arrayString.size) // цикл по i
    {
        while(j<arrayString[i].length)				// 2 цикл по j
        {
            a1.padEnd(1, arrayString[i][j])// выделяем конкретное слово из массива
            j++
            print(" ${a1.toString()} -" );
        }
        j=1

        while(j<arrayString[i].length)			// 2 цикл по j для сортировки
        {
            k=j;			//т.к. каждая буква, это число по Asci коду
            while(((a1[k-1].toInt())>(a1[k].toInt()))&&(k<a1.length)) // то мы формируем возростание из букв
            {
                dop=a1[k];	// переменная для хранение текущего элменета
                a1[k]=a1[k-1];	// сохрание в него предыдущего
                a1[k-1]=dop;	// в предыдущем сохрание из переменной
                k++;
                if(k>0) {
                    j=0
                }

            }
            j++
        }
        j=0

        while(h<arrayString.size) 		// 2 цикл по h
        {
            for(j:Int in 0..arrayString[i].length)		// 3 цикл по j
            {
                a2[j]=arrayString[h][j];	// выделяем конкретное слово из массива
            }
            j=0

            while(j<arrayString[i].length)			// 3 цикл по j для сортировки
            {
                k=j;		//т.к. каждая буква, это число по Asci коду
                while((a2[k-1]>a2[k])&&(k<200))	// то мы формируем возростание из букв
                {
                    dop=a2[k];	// переменная для хранение текущего элменета
                    a2[k]=a2[k-1];	// сохрание в него предыдущего
                    a2[k-1]=dop;// в предыдущем сохрание из переменной
                    k++;
                    if(k>0) {
                        j=0
                    }
                }
                j++
            }
            j=0

            flag=0;
            for(j:Int in 0..arrayString[i].length)		// 3 цикл по j
            {
                if((a2[j])==(a1[j]))	// Если j-элменет у двух слов совподает
                {
                    flag=1;	//то мы запоминаем праду (true) 1
                }
                else
                {
                    flag=0;		// иначе всё сбрасываем
                    break
                }
            }// И так мы проверям пока у нас не закончится цикл или до сброса
            j=0

            if(flag==1)		// Если до этого всё прошло успешно (true) 1
            {
                for(j:Int in 0..arrayString[i].length)		// 3 цикл по j
                {
                        print(" ${arrayString[i][j].toChar()} |2 ");// вывод на экран
                }
                j=0
                    print(" - ");
            }
            h++
        }
        j=0
        h=0

            print(" \n");
        i++
    }
    i=0

}

