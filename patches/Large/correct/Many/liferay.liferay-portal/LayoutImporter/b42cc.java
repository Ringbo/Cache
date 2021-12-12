diff --git a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
index dce35b8..78b8714 100644
--- a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
@@ -712,7 +712,7 @@
 		}
 
 		if (_log.isDebugEnabled()) {
-			if (layout == null) {
+			if (existingLayout == null) {
 				_log.debug(
 					"Layout with {groupId=" + groupId + ",privateLayout=" +
 						privateLayout + ",layoutId=" + layoutId +
