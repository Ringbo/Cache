diff --git a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
index 272d901..f50de2d 100644
--- a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
@@ -704,7 +704,8 @@
 			String localizedName = layout.getName(locale);
 
 			for (Layout curLayout : previousLayouts) {
-				if (curLayout.getName(locale).equals(localizedName)) {
+				if (curLayout.getName(locale).equals(localizedName) ||
+						curLayout.getFriendlyURL().equals(friendlyURL)) {
 					existingLayout = curLayout;
 
 					break;
