diff --git a/portlets/social-coding-portlet/docroot/WEB-INF/src/com/liferay/socialcoding/hook/upgrade/v1_0_0/UpgradeNamespace.java b/portlets/social-coding-portlet/docroot/WEB-INF/src/com/liferay/socialcoding/hook/upgrade/v1_0_0/UpgradeNamespace.java
index cefa69a..86c4686 100644
--- a/portlets/social-coding-portlet/docroot/WEB-INF/src/com/liferay/socialcoding/hook/upgrade/v1_0_0/UpgradeNamespace.java
+++ b/portlets/social-coding-portlet/docroot/WEB-INF/src/com/liferay/socialcoding/hook/upgrade/v1_0_0/UpgradeNamespace.java
@@ -49,7 +49,7 @@
 			String tableSqlCreate, String tableSqlDrop)
 		throws Exception {
 
-		if (tableHasData(newTableName)) {
+		if (hasRows(newTableName)) {
 			if (_log.isWarnEnabled()) {
 				_log.warn(
 					"Not renaming " + oldTableName + " to " + newTableName +
@@ -59,7 +59,7 @@
 			return;
 		}
 
-		if (!tableHasData(oldTableName)) {
+		if (!hasRows(oldTableName)) {
 			if (_log.isWarnEnabled()) {
 				_log.warn(
 					"Not renaming " + oldTableName + " to " + newTableName +
