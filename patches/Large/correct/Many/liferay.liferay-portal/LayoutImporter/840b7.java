diff --git a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
index f64b6e0..57247ea 100644
--- a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
@@ -907,7 +907,7 @@
 
 			boolean addGroupPermissions = true;
 
-			Group group = layout.getGroup();
+			Group group = importedLayout.getGroup();
 
 			if (privateLayout && group.isUser()) {
 				addGroupPermissions = false;
