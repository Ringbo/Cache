diff --git a/portal-impl/src/com/liferay/portal/lar/backgroundtask/PortletStagingBackgroundTaskExecutor.java b/portal-impl/src/com/liferay/portal/lar/backgroundtask/PortletStagingBackgroundTaskExecutor.java
index a2ea7de..4d9d875 100644
--- a/portal-impl/src/com/liferay/portal/lar/backgroundtask/PortletStagingBackgroundTaskExecutor.java
+++ b/portal-impl/src/com/liferay/portal/lar/backgroundtask/PortletStagingBackgroundTaskExecutor.java
@@ -62,7 +62,7 @@
 		try {
 			missingReferences =
 				LayoutLocalServiceUtil.validateImportPortletInfo(
-					userId, targetGroupId, targetPlid, portletId, parameterMap,
+					userId, targetPlid, targetGroupId, portletId, parameterMap,
 					larFile);
 
 			backgroundTask = markBackgroundTask(backgroundTask, "validated");
