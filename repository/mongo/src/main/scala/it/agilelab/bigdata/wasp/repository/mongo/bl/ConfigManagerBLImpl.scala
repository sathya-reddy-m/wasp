package it.agilelab.bigdata.wasp.repository.mongo.bl

import it.agilelab.bigdata.wasp.repository.core.bl.ConfigManagerBL
import it.agilelab.bigdata.wasp.models.Model
import it.agilelab.bigdata.wasp.repository.mongo.WaspMongoDB
import org.bson.BsonString

import scala.reflect.runtime.universe._
import scala.reflect.ClassTag

class ConfigManagerBLImpl(waspDB: WaspMongoDB) extends ConfigManagerBL{

  def getByName[T <: Model](name : String)(implicit ct: ClassTag[T], typeTag: TypeTag[T]): Option[T] = {
    waspDB.getDocumentByField[T]("name", new BsonString(name))
  }

  def retrieveConf[T <: Model](default: T, nameConf: String)(implicit ct: ClassTag[T], typeTag: TypeTag[T]): Option[T] = {
    waspDB.insertIfNotExists[T](default)
    getByName[T](nameConf)
  }

}