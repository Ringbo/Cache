diff --git a/portal-impl/src/com/liferay/portal/model/impl/PortletImpl.java b/portal-impl/src/com/liferay/portal/model/impl/PortletImpl.java
index c24d2d5..1bd302e 100644
--- a/portal-impl/src/com/liferay/portal/model/impl/PortletImpl.java
+++ b/portal-impl/src/com/liferay/portal/model/impl/PortletImpl.java
@@ -1983,7 +1983,7 @@
 	public List<UserNotificationInterpreter>
 		getUserNotificationInterpreterInstances() {
 
-		if (_socialActivityInterpreterClasses.isEmpty()) {
+		if (_userNotificationInterpreterClasses.isEmpty()) {
 			return null;
 		}
 
