diff --git a/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java b/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java
index 680f53c..7739388 100644
--- a/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java
@@ -97,7 +97,7 @@
 		return calEventLocalService.getEvent(eventId);
 	}
 
-	public List<CalEvent> getEvents(long groupId, Calendar cal, String types)
+	public List<CalEvent> getEvents(long groupId, Calendar cal, String type)
 		throws PortalException, SystemException {
 
 		return getEvents(groupId, cal, new String[] {types});
@@ -127,7 +127,7 @@
 	}
 
 	public List<CalEvent> getEvents(
-			long groupId, String types, int start, int end)
+			long groupId, String type, int start, int end)
 		throws SystemException {
 
 		return getEvents(groupId, new String[] {types}, start, end);
@@ -157,7 +157,9 @@
 	public int getEventsCount(long groupId, String[] types)
 		throws SystemException {
 
-		if ((types != null) && (types.length > 0)) {
+		if ((types != null) && (types.length > 0) &&
+			((types.length > 1) || Validator.isNotNull(types[0]))) {
+
 			return calEventPersistence.filterCountByG_T(groupId, types);
 		}
 		else {
