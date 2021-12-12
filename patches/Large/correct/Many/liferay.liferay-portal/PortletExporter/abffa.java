diff --git a/portal-impl/src/com/liferay/portal/lar/PortletExporter.java b/portal-impl/src/com/liferay/portal/lar/PortletExporter.java
index ed70b03..9be180d 100644
--- a/portal-impl/src/com/liferay/portal/lar/PortletExporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/PortletExporter.java
@@ -602,7 +602,8 @@
 				UnicodeProperties typeSettingsProperties =
 					expandoColumn.getTypeSettingsProperties();
 
-				typeSettingsElement.addCDATA(typeSettingsProperties.toString());
+				typeSettingsElement.addCDATA(
+					typeSettingsProperties.toSortedString());
 			}
 		}
 
