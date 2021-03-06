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

case class ReportingTaskStatusDTO(
  /* The run status of this ReportingTask */
  runStatus: Option[ReportingTaskStatusDTOEnums.RunStatus] = None,
  /* Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid) */
  validationStatus: Option[ReportingTaskStatusDTOEnums.ValidationStatus] = None,
  /* The number of active threads for the component. */
  activeThreadCount: Option[Int] = None
) extends ApiModel

object ReportingTaskStatusDTOEnums {

  type RunStatus = RunStatus.Value
  type ValidationStatus = ValidationStatus.Value
  object RunStatus extends Enumeration {
    val RUNNING = Value("RUNNING")
    val STOPPED = Value("STOPPED")
    val DISABLED = Value("DISABLED")
  }

  object ValidationStatus extends Enumeration {
    val VALID = Value("VALID")
    val INVALID = Value("INVALID")
    val VALIDATING = Value("VALIDATING")
  }

}

