diff --git a/portal-impl/src/com/liferay/portlet/messageboards/service/persistence/MBMessageFinderImpl.java b/portal-impl/src/com/liferay/portlet/messageboards/service/persistence/MBMessageFinderImpl.java
index 9f40955..a9c32ab 100644
--- a/portal-impl/src/com/liferay/portlet/messageboards/service/persistence/MBMessageFinderImpl.java
+++ b/portal-impl/src/com/liferay/portlet/messageboards/service/persistence/MBMessageFinderImpl.java
@@ -90,10 +90,10 @@
 			qPos.add(createDate_TS);
 			qPos.add(threadId);
 
-			Iterator<Long> itr = q.list().iterator();
+			Iterator<Integer> itr = q.list().iterator();
 
 			if (itr.hasNext()) {
-				Long count = itr.next();
+				Integer count = itr.next();
 
 				if (count != null) {
 					return count.intValue();
