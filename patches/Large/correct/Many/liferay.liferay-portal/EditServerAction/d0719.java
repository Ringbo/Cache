diff --git a/portal-impl/src/com/liferay/portlet/admin/action/EditServerAction.java b/portal-impl/src/com/liferay/portlet/admin/action/EditServerAction.java
index c19d0f4..a7cc821 100644
--- a/portal-impl/src/com/liferay/portlet/admin/action/EditServerAction.java
+++ b/portal-impl/src/com/liferay/portlet/admin/action/EditServerAction.java
@@ -503,7 +503,8 @@
 			SessionMessages.add(actionRequest, "language", language);
 			SessionMessages.add(actionRequest, "script", script);
 
-			ScriptingUtil.exec(null, portletObjects, language, script);
+			ScriptingUtil.exec(
+				null, portletObjects, language, script, new String[0]);
 
 			unsyncPrintWriter.flush();
 
