package st.alr.mqttitude.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table WAYPOINT.
 */
public class Waypoint {

	private Long id;
	private String description;
	private Double latitude;
	private Double longitude;
	private Float radius;
	private String geofenceId;
	private Boolean notification;
	private Integer transitionType;
	private String notificationTitle;
	private Boolean shared;
	private java.util.Date date;

	public Waypoint() {
	}

	public Waypoint(Long id) {
		this.id = id;
	}

	public Waypoint(Long id, String description, Double latitude,
			Double longitude, Float radius, String geofenceId,
			Boolean notification, Integer transitionType,
			String notificationTitle, Boolean shared, java.util.Date date) {
		this.id = id;
		this.description = description;
		this.latitude = latitude;
		this.longitude = longitude;
		this.radius = radius;
		this.geofenceId = geofenceId;
		this.notification = notification;
		this.transitionType = transitionType;
		this.notificationTitle = notificationTitle;
		this.shared = shared;
		this.date = date;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Float getRadius() {
		return this.radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public String getGeofenceId() {
		return this.geofenceId;
	}

	public void setGeofenceId(String geofenceId) {
		this.geofenceId = geofenceId;
	}

	public Boolean getNotification() {
		return this.notification;
	}

	public void setNotification(Boolean notification) {
		this.notification = notification;
	}

	public Integer getTransitionType() {
		return this.transitionType;
	}

	public void setTransitionType(Integer transitionType) {
		this.transitionType = transitionType;
	}

	public String getNotificationTitle() {
		return this.notificationTitle;
	}

	public void setNotificationTitle(String notificationTitle) {
		this.notificationTitle = notificationTitle;
	}

	public Boolean getShared() {
		return this.shared;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

}
