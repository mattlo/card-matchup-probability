package cmp.entity

class Suit(val value: Int)

object Suit {
	val List(diamond, club, heart, spade) = (0 to 3).toList
	def apply(value: Int) = new Suit(value)
}