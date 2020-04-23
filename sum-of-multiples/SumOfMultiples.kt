object SumOfMultiples {
	fun sum(factors: Set<Int>, limit: Int): Int { 
        val values = mutableSetOf<Int>()
        for(factor in factors){
				values.addAll((1 until limit).filter{factor != 0 && it % factor == 0})
                println(values)
        }
        return values.sum()
	//println((1 until limit).filter{num -> factors.any{it != 0 && num % it == 0}}) #2
        // return factors.flatMap{(0 until limit).step(it)}.distinct().sum() #3
    }
}