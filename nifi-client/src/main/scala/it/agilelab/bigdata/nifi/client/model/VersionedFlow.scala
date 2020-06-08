/**
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * The version of the OpenAPI document: 1.11.4
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package it.agilelab.bigdata.nifi.client.model

import it.agilelab.bigdata.nifi.client.core.ApiModel

case class VersionedFlow(
  link: Option[JaxbLink] = None,
  /* An ID to uniquely identify this object. */
  identifier: Option[String] = None,
  /* The name of the item. */
  name: String,
  /* A description of the item. */
  description: Option[String] = None,
  /* The identifier of the bucket this items belongs to. This cannot be changed after the item is created. */
  bucketIdentifier: String,
  /* The name of the bucket this items belongs to. */
  bucketName: Option[String] = None,
  /* The timestamp of when the item was created, as milliseconds since epoch. */
  createdTimestamp: Option[Long] = None,
  /* The timestamp of when the item was last modified, as milliseconds since epoch. */
  modifiedTimestamp: Option[Long] = None,
  /* The type of item. */
  `type`: VersionedFlowEnums.`Type`,
  permissions: Option[Permissions] = None,
  /* The number of versions of this flow. */
  versionCount: Option[Long] = None
) extends ApiModel

object VersionedFlowEnums {

  type `Type` = `Type`.Value
  object `Type` extends Enumeration {
    val Flow = Value("Flow")
    val Bundle = Value("Bundle")
  }

}
