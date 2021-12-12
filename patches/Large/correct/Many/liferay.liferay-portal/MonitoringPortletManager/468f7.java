diff --git a/portal-impl/src/com/liferay/portlet/MonitoringPortletManager.java b/portal-impl/src/com/liferay/portlet/MonitoringPortletManager.java
index 155449377..4311348 100644
--- a/portal-impl/src/com/liferay/portlet/MonitoringPortletManager.java
+++ b/portal-impl/src/com/liferay/portlet/MonitoringPortletManager.java
@@ -31,46 +31,46 @@
 public class MonitoringPortletManager implements MonitoringPortletManagerMBean {
 
 	public boolean isMonitoringPortletActionRequest() {
-		return MonitoringPortletImpl.isMonitoringPortletActionRequest();
+		return MonitoringPortlet.isMonitoringPortletActionRequest();
 	}
 
 	public boolean isMonitoringPortletEventRequest() {
-		return MonitoringPortletImpl.isMonitoringPortletEventRequest();
+		return MonitoringPortlet.isMonitoringPortletEventRequest();
 	}
 
 	public boolean isMonitoringPortletRenderRequest() {
-		return MonitoringPortletImpl.isMonitoringPortletRenderRequest();
+		return MonitoringPortlet.isMonitoringPortletRenderRequest();
 	}
 
 	public boolean isMonitoringPortletResourceRequest() {
-		return MonitoringPortletImpl.isMonitoringPortletResourceRequest();
+		return MonitoringPortlet.isMonitoringPortletResourceRequest();
 	}
 
 	public void setMonitoringPortletActionRequest(
 		boolean monitoringPortletActionRequest) {
 
-		MonitoringPortletImpl.setMonitoringPortletActionRequest(
+		MonitoringPortlet.setMonitoringPortletActionRequest(
 			monitoringPortletActionRequest);
 	}
 
 	public void setMonitoringPortletEventRequest(
 		boolean monitoringPortletEventRequest) {
 
-		MonitoringPortletImpl.setMonitoringPortletEventRequest(
+		MonitoringPortlet.setMonitoringPortletEventRequest(
 			monitoringPortletEventRequest);
 	}
 
 	public void setMonitoringPortletRenderRequest(
 		boolean monitoringPortletRenderRequest) {
 
-		MonitoringPortletImpl.setMonitoringPortletRenderRequest(
+		MonitoringPortlet.setMonitoringPortletRenderRequest(
 			monitoringPortletRenderRequest);
 	}
 
 	public void setMonitoringPortletResourceRequest(
 		boolean monitoringPortletResourceRequest) {
 
-		MonitoringPortletImpl.setMonitoringPortletResourceRequest(
+		MonitoringPortlet.setMonitoringPortletResourceRequest(
 			monitoringPortletResourceRequest);
 	}
 
