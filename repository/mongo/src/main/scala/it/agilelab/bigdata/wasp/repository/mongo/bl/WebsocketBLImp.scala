package it.agilelab.bigdata.wasp.repository.mongo.bl

import it.agilelab.bigdata.wasp.repository.core.bl.WebsocketBL
import it.agilelab.bigdata.wasp.models.WebsocketModel
import it.agilelab.bigdata.wasp.repository.mongo.WaspMongoDB
import org.bson.BsonString

class WebsocketBLImp(waspDB: WaspMongoDB) extends WebsocketBL  {


  private def factory(ws: WebsocketModel) = new WebsocketModel(ws.name, ws.host, ws.port, ws.resourceName, ws.options)

  def getByName(name: String): Option[WebsocketModel] = {
    waspDB.getDocumentByField[WebsocketModel]("name", new BsonString(name)).map(ws => {
      factory(ws)
    })
  }




  override def persist(wsModel: WebsocketModel): Unit = waspDB.insert[WebsocketModel](wsModel)
}
