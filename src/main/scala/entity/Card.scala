package cmp.entity;

import cmp.entity.Suit._

case class Card(value: Int, suit: Suit) {
	override def toString = Card.names(value) + suit.toString 
}

object Card {
	val names = ((0 to 12).toList zip (2 to 10).toList ++ List("J", "Q", "K", "A")).toMap
}