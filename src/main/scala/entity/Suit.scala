package cmp.entity

object Suit extends Enumeration {
	type Suit = Value

	val Diamond = Value(0, "D")
	val Club = Value(1, "C")
	val Heart = Value(2, "H")
	val Spade = Value(3, "S")
}