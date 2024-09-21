fun main(args: Array<String>) {

    val letter: Array<Char> = arrayOf('А', 'Б', 'В', 'Г', 'Д', 'E', 'Ё','Ж','З','И','Й','К',
        'Л','М','Н','О','П','Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ь','Ы','Ъ','Э','Ю','Я')



    var array: Array<Array<String>> =Array(33) {Array(33) {""} }

    var a = 1
    for(i in 0 ..30)
        for(j in 0..30) {
            array[i][j] += a.toString()
            a++
        }

    for(i in 0 ..30) {
        for (j in 0..30) {
            print(array[i][j] + "\t")
        }
        println()
    }



}

