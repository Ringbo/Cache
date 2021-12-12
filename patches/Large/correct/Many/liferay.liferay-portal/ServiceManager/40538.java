diff --git a/portal-impl/src/com/liferay/portal/monitoring/jmx/ServiceManager.java b/portal-impl/src/com/liferay/portal/monitoring/jmx/ServiceManager.java
index c9633e3..2ed4ae7 100644
--- a/portal-impl/src/com/liferay/portal/monitoring/jmx/ServiceManager.java
+++ b/portal-impl/src/com/liferay/portal/monitoring/jmx/ServiceManager.java
@@ -81,7 +81,7 @@
 
 	@Override
 	public boolean isActive() {
-		return _serviceMonitorAdvice.isActive();
+		return ServiceMonitorAdvice.isActive();
 	}
 
 	@Override
