package com.myspace.assupol_cm;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ErrorEvent implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Timestamp")
	private java.util.Date timestamp;
	@org.kie.api.definition.type.Label("Instance Id")
	private java.lang.Long instanceId;

	@org.kie.api.definition.type.Label(value = "Node Instance Id")
	private java.lang.Long nodeInstanceId;

	@org.kie.api.definition.type.Label(value = "Error Message")
	private java.lang.String errorMessage;

	public ErrorEvent() {
	}

	public java.util.Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(java.util.Date timestamp) {
		this.timestamp = timestamp;
	}

	public java.lang.Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(java.lang.Long instanceId) {
		this.instanceId = instanceId;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Timestamp: ");
		builder.append(timestamp);
		builder.append('\n');
		builder.append("Instance Id: ");
		builder.append(instanceId);
		builder.append('\n');
		builder.append("Node Instance Id: ");
		builder.append(nodeInstanceId);
		builder.append('\n');
		builder.append("Error Message: ");
		builder.append(errorMessage);
		builder.append('\n');

		return builder.toString();
	}

	public java.lang.Long getNodeInstanceId() {
		return this.nodeInstanceId;
	}

	public void setNodeInstanceId(java.lang.Long nodeInstanceId) {
		this.nodeInstanceId = nodeInstanceId;
	}

	public java.lang.String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(java.lang.String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public ErrorEvent(java.util.Date timestamp, java.lang.Long instanceId,
			java.lang.Long nodeInstanceId, java.lang.String errorMessage) {
		this.timestamp = timestamp;
		this.instanceId = instanceId;
		this.nodeInstanceId = nodeInstanceId;
		this.errorMessage = errorMessage;
	}

}