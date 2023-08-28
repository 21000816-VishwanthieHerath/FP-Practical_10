object Question01 {

    def main(args: Array[String]): Unit = {

        def calculateAverage(temp: List[Double]): Double = {

            val newTemp = temp.map((celsius) => { (celsius * 9 / 5) + 32 })
            val sumTemp = newTemp.reduce((a, b) => a + b)
            return sumTemp / newTemp.length

        }

        print("Enter the temperature list in Celsius : ")
        val temps = scala.io.StdIn.readLine()
        val tempList = temps.split(",").map(_.trim).map(_.toDouble).toList

        val averageTemp = calculateAverage(tempList)

        println(f"The average Fahrenheit temperature : ${averageTemp}%.2f F") 

    }

}
