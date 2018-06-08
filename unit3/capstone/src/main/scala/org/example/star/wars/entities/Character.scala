package org.example.star.wars.entities


trait Character {
  def id: String
  def name: Option[String]
  def friends: List[String]
}

case class Human(id: String,
                 name: Option[String],
                 friends: List[String],
                 appearsIn: List[Episode],
                 homePlanet: Option[String]) extends Character

case class Droid(id: String,
                 name: Option[String],
                 friends: List[String],
                 appearsIn: List[Episode],
                 primaryFunction: Option[String]) extends Character

