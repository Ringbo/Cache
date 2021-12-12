diff --git a/portal-kernel/src/com/liferay/portal/kernel/portlet/bridges/mvc/BaseMVCResourceCommand.java b/portal-kernel/src/com/liferay/portal/kernel/portlet/bridges/mvc/BaseMVCResourceCommand.java
index 054f598..70ab589 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/portlet/bridges/mvc/BaseMVCResourceCommand.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/portlet/bridges/mvc/BaseMVCResourceCommand.java
@@ -40,7 +40,7 @@
 		try {
 			doServeResource(resourceRequest, resourceResponse);
 
-			return SessionErrors.isEmpty(resourceRequest);
+			return !SessionErrors.isEmpty(resourceRequest);
 		}
 		catch (PortletException pe) {
 			throw pe;
