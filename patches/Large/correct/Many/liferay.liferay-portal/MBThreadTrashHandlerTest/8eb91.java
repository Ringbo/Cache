diff --git a/portal-impl/test/integration/com/liferay/portlet/messageboards/trash/MBThreadTrashHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/messageboards/trash/MBThreadTrashHandlerTest.java
index 2f61ae1..647e820 100644
--- a/portal-impl/test/integration/com/liferay/portlet/messageboards/trash/MBThreadTrashHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/messageboards/trash/MBThreadTrashHandlerTest.java
@@ -145,8 +145,7 @@
 		throws Exception {
 
 		MBMessage message = MBTestUtil.addMessage(
-			serviceContext.getScopeGroupId(), getSearchKeywords(), approved,
-			serviceContext);
+			serviceContext.getScopeGroupId());
 
 		return message.getThread();
 	}
