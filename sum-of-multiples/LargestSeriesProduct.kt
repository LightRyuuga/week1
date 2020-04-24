class Series(val input: String) {
    
	init {
        require(input.all { it.isDigit() })
    }

    fun getLargestProduct(span: Int): Long {
        var list = input.map{Character.getNumericValue(it)}
        var maxi = 1
        require(span in 0..list.count()) {"!"}
        if (list.count() != 0 && span != 0)
        {
            maxi = 
                (0..list.count()-span)//3
                    .map{i -> list.subList(i,i+span)//0 0
                    .reduce{acc, j -> j * acc}}
                    .max() ?:1
        }     
        return if(span != 0) maxi.toLong() else 1
    }
}