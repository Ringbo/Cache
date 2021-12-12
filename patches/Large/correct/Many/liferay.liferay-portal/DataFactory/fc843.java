diff --git a/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java b/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java
index aac2253..c375ea4 100644
--- a/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java
+++ b/portal-impl/src/com/liferay/portal/tools/samplesqlbuilder/DataFactory.java
@@ -1668,7 +1668,7 @@
 		typeSettingsProperties.setProperty("column-2", column2);
 
 		String typeSettings = StringUtil.replace(
-			typeSettingsProperties.toSortedString(), "\n", "\\n");
+			typeSettingsProperties.toString(), "\n", "\\n");
 
 		layoutModel.setTypeSettings(typeSettings);
 
