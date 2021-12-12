diff --git a/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ExportApplicationDataMVCActionCommand.java b/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ExportApplicationDataMVCActionCommand.java
index 329baae..12079cb 100644
--- a/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ExportApplicationDataMVCActionCommand.java
+++ b/modules/apps/foundation/user-associated-data/user-associated-data-web/src/main/java/com/liferay/user/associated/data/web/internal/portlet/action/ExportApplicationDataMVCActionCommand.java
@@ -51,12 +51,12 @@
 
 		long selUserId = getSelectedUserId(actionRequest);
 
-		String[] applicaitonNames = StringUtil.split(
+		String[] applicationNames = StringUtil.split(
 			ParamUtil.getString(actionRequest, "applicationNames"));
 
-		for (String applicaitonName : applicaitonNames) {
+		for (String applicationName : applicationNames) {
 			UADExporter.exportApplicationDataInBackground(
-				applicaitonName, selUserId, themeDisplay.getScopeGroupId());
+				applicationName, selUserId, themeDisplay.getScopeGroupId());
 		}
 
 		String redirect = ParamUtil.getString(actionRequest, "redirect");
