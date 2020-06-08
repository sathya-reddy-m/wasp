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

case class ConnectionStatusDTO(
  /* The ID of the connection */
  id: Option[String] = None,
  /* The ID of the Process Group that the connection belongs to */
  groupId: Option[String] = None,
  /* The name of the connection */
  name: Option[String] = None,
  /* The timestamp of when the stats were last refreshed */
  statsLastRefreshed: Option[String] = None,
  /* The ID of the source component */
  sourceId: Option[String] = None,
  /* The name of the source component */
  sourceName: Option[String] = None,
  /* The ID of the destination component */
  destinationId: Option[String] = None,
  /* The name of the destination component */
  destinationName: Option[String] = None,
  aggregateSnapshot: Option[ConnectionStatusSnapshotDTO] = None,
  /* A list of status snapshots for each node */
  nodeSnapshots: Option[Seq[NodeConnectionStatusSnapshotDTO]] = None
) extends ApiModel

