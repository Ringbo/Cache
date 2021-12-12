diff --git a/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java b/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java
index 7739388..4faf647 100644
--- a/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/calendar/service/impl/CalEventServiceImpl.java
@@ -100,7 +100,7 @@
 	public List<CalEvent> getEvents(long groupId, Calendar cal, String type)
 		throws PortalException, SystemException {
 
-		return getEvents(groupId, cal, new String[] {types});
+		return getEvents(groupId, cal, new String[] {type});
 	}
 
 	public List<CalEvent> getEvents(long groupId, Calendar cal, String[] types)
@@ -130,7 +130,7 @@
 			long groupId, String type, int start, int end)
 		throws SystemException {
 
-		return getEvents(groupId, new String[] {types}, start, end);
+		return getEvents(groupId, new String[] {type}, start, end);
 	}
 
 	public List<CalEvent> getEvents(
