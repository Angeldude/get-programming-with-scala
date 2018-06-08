package org.example.star.wars.entities

sealed trait Episode

case object NewHope extends Episode
case object Empire extends Episode
case object Jedi extends Episode
