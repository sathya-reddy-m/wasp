package it.agilelab.bigdata.wasp.master.web.controllers

import it.agilelab.bigdata.wasp.core.bl.ConfigBL
import it.agilelab.bigdata.wasp.core.models.FreeCodeModel

trait FreeCodeDBService {

  def getByName(name: String): Option[FreeCodeModel]

  def deleteByName(name : String) : Unit

  def getAll: Seq[FreeCodeModel]

  def insert(freeCodeModel: FreeCodeModel): Unit

}

object FreeCodeDBServiceDefault extends FreeCodeDBService {

  def getByName(name: String): Option[FreeCodeModel] = ConfigBL.freeCodeBL.getByName(name)

  def deleteByName(name : String) : Unit = ConfigBL.freeCodeBL.deleteByName(name)

  def getAll: Seq[FreeCodeModel] = ConfigBL.freeCodeBL.getAll

  def insert(freeCodeModel: FreeCodeModel): Unit = ConfigBL.freeCodeBL.insert(freeCodeModel)



}