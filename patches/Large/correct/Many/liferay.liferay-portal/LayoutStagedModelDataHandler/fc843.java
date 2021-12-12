diff --git a/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java b/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java
index 09abeb4..d251ea4 100644
--- a/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java
@@ -1166,8 +1166,7 @@
 			previousTypeSettingsProperties.setProperty(
 				columnId, StringUtil.merge(portletIds));
 
-			layout.setTypeSettings(
-				previousTypeSettingsProperties.toSortedString());
+			layout.setTypeSettings(previousTypeSettingsProperties.toString());
 		}
 		catch (IOException ioe) {
 			layout.setTypeSettings(newTypeSettings);
