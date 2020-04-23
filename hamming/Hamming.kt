object Hamming {
    fun compute(left: String, right: String): Int {
	var distance = 0
        if (left.length != right.length) throw IllegalArgumentException("left and right strands must be of equal length")
	for (i in 0 until left.length){
		if (left[i] != right[i]){
			distance++
		}
	}
        return distance
    }
}

