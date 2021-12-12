diff --git a/portal-impl/src/com/liferay/portlet/messageboards/util/MBThreadIndexer.java b/portal-impl/src/com/liferay/portlet/messageboards/util/MBThreadIndexer.java
index a2750b8..7e04faf 100644
--- a/portal-impl/src/com/liferay/portlet/messageboards/util/MBThreadIndexer.java
+++ b/portal-impl/src/com/liferay/portlet/messageboards/util/MBThreadIndexer.java
@@ -155,7 +155,7 @@
 				document, MBThread.class.getName(), thread.getThreadId(), null,
 				null, MBThreadTrashRenderer.TYPE);
 
-			String className = MBCategory.class.getName();
+			String className = MBThread.class.getName();
 			long classPK = thread.getThreadId();
 
 			if (thread.isInTrashContainer()) {
