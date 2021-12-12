diff --git a/portal-impl/src/com/liferay/portlet/calendar/service/http/CalEventServiceHttp.java b/portal-impl/src/com/liferay/portlet/calendar/service/http/CalEventServiceHttp.java
index e9e2cb9..9456232 100644
--- a/portal-impl/src/com/liferay/portlet/calendar/service/http/CalEventServiceHttp.java
+++ b/portal-impl/src/com/liferay/portlet/calendar/service/http/CalEventServiceHttp.java
@@ -247,7 +247,7 @@
 
 	public static java.util.List<com.liferay.portlet.calendar.model.CalEvent> getEvents(
 		HttpPrincipal httpPrincipal, long groupId, java.util.Calendar cal,
-		java.lang.String types)
+		java.lang.String type)
 		throws com.liferay.portal.kernel.exception.PortalException,
 			com.liferay.portal.kernel.exception.SystemException {
 		try {
@@ -255,7 +255,7 @@
 					"getEvents", _getEventsParameterTypes5);
 
 			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
-					cal, types);
+					cal, type);
 
 			Object returnObj = null;
 
@@ -322,7 +322,7 @@
 	}
 
 	public static java.util.List<com.liferay.portlet.calendar.model.CalEvent> getEvents(
-		HttpPrincipal httpPrincipal, long groupId, java.lang.String types,
+		HttpPrincipal httpPrincipal, long groupId, java.lang.String type,
 		int start, int end)
 		throws com.liferay.portal.kernel.exception.SystemException {
 		try {
@@ -330,7 +330,7 @@
 					"getEvents", _getEventsParameterTypes7);
 
 			MethodHandler methodHandler = new MethodHandler(methodKey, groupId,
-					types, start, end);
+					type, start, end);
 
 			Object returnObj = null;
 
