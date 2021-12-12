diff --git a/modules/apps/social/social-networking-service/src/main/java/com/liferay/social/networking/upgrade/v1_0_0/UpgradeNamespace.java b/modules/apps/social/social-networking-service/src/main/java/com/liferay/social/networking/upgrade/v1_0_0/UpgradeNamespace.java
index 4cb4695..034f220 100644
--- a/modules/apps/social/social-networking-service/src/main/java/com/liferay/social/networking/upgrade/v1_0_0/UpgradeNamespace.java
+++ b/modules/apps/social/social-networking-service/src/main/java/com/liferay/social/networking/upgrade/v1_0_0/UpgradeNamespace.java
@@ -58,7 +58,7 @@
 			String tableSqlCreate, String tableSqlDrop)
 		throws Exception {
 
-		if (tableHasData(newTableName)) {
+		if (hasRows(newTableName)) {
 			if (_log.isWarnEnabled()) {
 				_log.warn(
 					"Not renaming " + oldTableName + " to " + newTableName +
@@ -68,7 +68,7 @@
 			return;
 		}
 
-		if (!tableHasData(oldTableName)) {
+		if (!hasRows(oldTableName)) {
 			if (_log.isWarnEnabled()) {
 				_log.warn(
 					"Not renaming " + oldTableName + " to " + newTableName +
