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

case class NodeProcessorStatusSnapshotDTO(
  /* The unique ID that identifies the node */
  nodeId: Option[String] = None,
  /* The API address of the node */
  address: Option[String] = None,
  /* The API port used to communicate with the node */
  apiPort: Option[Int] = None,
  statusSnapshot: Option[ProcessorStatusSnapshotDTO] = None
) extends ApiModel


