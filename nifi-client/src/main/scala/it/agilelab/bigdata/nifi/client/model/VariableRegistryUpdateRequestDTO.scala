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

import java.time.OffsetDateTime

import it.agilelab.bigdata.nifi.client.core.ApiModel

case class VariableRegistryUpdateRequestDTO(
  /* The ID of the request */
  requestId: Option[String] = None,
  /* The URI for the request */
  uri: Option[String] = None,
  /* The timestamp of when the request was submitted */
  submissionTime: Option[OffsetDateTime] = None,
  /* The timestamp of when the request was last updated */
  lastUpdated: Option[OffsetDateTime] = None,
  /* Whether or not the request is completed */
  complete: Option[Boolean] = None,
  /* The reason for the request failing, or null if the request has not failed */
  failureReason: Option[String] = None,
  /* A value between 0 and 100 (inclusive) indicating how close the request is to completion */
  percentCompleted: Option[Int] = None,
  /* A description of the current state of the request */
  state: Option[String] = None,
  /* The steps that are required in order to complete the request, along with the status of each */
  updateSteps: Option[Seq[VariableRegistryUpdateStepDTO]] = None,
  /* The unique ID of the Process Group that the variable registry belongs to */
  processGroupId: Option[String] = None,
  /* A set of all components that will be affected if the value of this variable is changed */
  affectedComponents: Option[Set[AffectedComponentEntity]] = None
) extends ApiModel

