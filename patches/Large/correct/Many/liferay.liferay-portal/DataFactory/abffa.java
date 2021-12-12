diff --git a/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java b/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java
index c375ea4..aac2253 100644
--- a/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java
+++ b/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java
@@ -1668,7 +1668,7 @@
 		typeSettingsProperties.setProperty("column-2", column2);
 
 		String typeSettings = StringUtil.replace(
-			typeSettingsProperties.toString(), "\n", "\\n");
+			typeSettingsProperties.toSortedString(), "\n", "\\n");
 
 		layoutModel.setTypeSettings(typeSettings);
 
