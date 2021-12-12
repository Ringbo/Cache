diff --git a/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java b/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java
index d251ea4..09abeb4 100644
--- a/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java
+++ b/portal-impl/src/com/liferay/portlet/layoutsadmin/lar/LayoutStagedModelDataHandler.java
@@ -1166,7 +1166,8 @@
 			previousTypeSettingsProperties.setProperty(
 				columnId, StringUtil.merge(portletIds));
 
-			layout.setTypeSettings(previousTypeSettingsProperties.toString());
+			layout.setTypeSettings(
+				previousTypeSettingsProperties.toSortedString());
 		}
 		catch (IOException ioe) {
 			layout.setTypeSettings(newTypeSettings);
