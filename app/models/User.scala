package models

import play.api.libs.json.{Json, OFormat}

case class User(id: String,
                firstName: String,
                lastName: String,
                role: Int)

object User {

  implicit val fmt: OFormat[User] = Json.format[User]
}
