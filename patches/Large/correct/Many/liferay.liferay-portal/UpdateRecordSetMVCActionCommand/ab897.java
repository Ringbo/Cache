diff --git a/modules/apps/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/portlet/action/UpdateRecordSetMVCActionCommand.java b/modules/apps/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/portlet/action/UpdateRecordSetMVCActionCommand.java
index 482af75..d9b5263 100644
--- a/modules/apps/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/portlet/action/UpdateRecordSetMVCActionCommand.java
+++ b/modules/apps/dynamic-data-lists/dynamic-data-lists-form-web/src/main/java/com/liferay/dynamic/data/lists/form/web/portlet/action/UpdateRecordSetMVCActionCommand.java
@@ -65,7 +65,7 @@
 
 		UnicodeProperties typeSettingsProperties = new UnicodeProperties(true);
 
-		boolean publish = ParamUtil.getString(actionRequest, "publish");
+		boolean publish = ParamUtil.getBoolean(actionRequest, "publish");
 
 		typeSettingsProperties.setProperty(
 			"published", String.valueOf(publish));
