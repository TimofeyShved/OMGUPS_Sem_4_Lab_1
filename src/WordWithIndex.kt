import java.util.ArrayList;
import java.util.List;

class WordWithIndex(val word:String, val index:Int){
    fun wordArraySort(array: Array<WordWithIndex>)
    {
        //сортирует array по убыванию свойства word
    }

    fun getAnagrams(words: Array<String>) :ArrayList<ArrayList<String>>
    {
        val NewerList = ArrayList<ArrayList<String>>()

        /*
        val outer = ArrayList<ArrayList<Int>>()
        var inner = ArrayList<Int>()

        inner.add(100)
        inner.add(200)
        outer.add(inner) // add first list
        inner = ArrayList(inner) // create a new inner list that has the same content as
        // the original inner list
        outer.add(inner) // add second list

        outer[0].add(300) // changes only the first inner list
        */

        NewerList[0][0] = "ghgh"


        /*
        возвращает список списков анаграмм, например:
        {{автор, тавро, отвар, рвота, втора, товар}, {сила, лиса}, …}.
        Эта функция создает массив из WordWithIndex из исходного массива,
        затем, используя функцию charSort, создает новый массив из WordWithIndex
        с отсортированными буквами в каждом слове. Далее, последний массив
        сортируется с помощью функции wordArraySort.

        В отсортированном массиве анаграммы должны быть расположены
        по порядку и находятся за один проход по массиву.
         */
        return NewerList
    }
}

