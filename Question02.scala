object Question02 {

    def main(args: Array[String]): Unit = {

        def countLetterOccurences(words: List[String]): Int = {

            val lengths = words.map((word) => {
                word.length()
            })

            val totalLetters = lengths.reduce((a, b) => a + b)

            return totalLetters

        }

        print("Enter the list of words : ")
        val words = scala.io.StdIn.readLine()
        val wordList = words.split(",").map(_.trim).toList

        val letterCount = countLetterOccurences(wordList)

        println(f"The total count of letter occurences : ${letterCount}")

    }

}
