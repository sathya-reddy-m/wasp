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

case class ControllerStatusDTO(
  /* The number of active threads in the NiFi. */
  activeThreadCount: Option[Int] = None,
  /* The number of terminated threads in the NiFi. */
  terminatedThreadCount: Option[Int] = None,
  /* The number of flowfiles queued in the NiFi. */
  queued: Option[String] = None,
  /* The number of FlowFiles queued across the entire flow */
  flowFilesQueued: Option[Int] = None,
  /* The size of the FlowFiles queued across the entire flow */
  bytesQueued: Option[Long] = None,
  /* The number of running components in the NiFi. */
  runningCount: Option[Int] = None,
  /* The number of stopped components in the NiFi. */
  stoppedCount: Option[Int] = None,
  /* The number of invalid components in the NiFi. */
  invalidCount: Option[Int] = None,
  /* The number of disabled components in the NiFi. */
  disabledCount: Option[Int] = None,
  /* The number of active remote ports in the NiFi. */
  activeRemotePortCount: Option[Int] = None,
  /* The number of inactive remote ports in the NiFi. */
  inactiveRemotePortCount: Option[Int] = None,
  /* The number of up to date versioned process groups in the NiFi. */
  upToDateCount: Option[Int] = None,
  /* The number of locally modified versioned process groups in the NiFi. */
  locallyModifiedCount: Option[Int] = None,
  /* The number of stale versioned process groups in the NiFi. */
  staleCount: Option[Int] = None,
  /* The number of locally modified and stale versioned process groups in the NiFi. */
  locallyModifiedAndStaleCount: Option[Int] = None,
  /* The number of versioned process groups in the NiFi that are unable to sync to a registry. */
  syncFailureCount: Option[Int] = None
) extends ApiModel

