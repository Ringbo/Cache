diff --git a/portal-impl/src/com/liferay/portal/lar/PortletExporter.java b/portal-impl/src/com/liferay/portal/lar/PortletExporter.java
index 9be180d..ed70b03 100644
--- a/portal-impl/src/com/liferay/portal/lar/PortletExporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/PortletExporter.java
@@ -602,8 +602,7 @@
 				UnicodeProperties typeSettingsProperties =
 					expandoColumn.getTypeSettingsProperties();
 
-				typeSettingsElement.addCDATA(
-					typeSettingsProperties.toSortedString());
+				typeSettingsElement.addCDATA(typeSettingsProperties.toString());
 			}
 		}
 
