diff --git a/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradeSharding.java b/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradeSharding.java
index 5ace890..47aaa66 100644
--- a/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradeSharding.java
+++ b/portal-impl/src/com/liferay/portal/upgrade/v7_0_0/UpgradeSharding.java
@@ -79,7 +79,7 @@
 		throws Exception {
 
 		try {
-			if (!hasRows(targetConnection, tableName)) {
+			if (hasRows(targetConnection, tableName)) {
 				if (_log.isWarnEnabled()) {
 					_log.warn(
 						"Control table " + tableName + " should not contain " +
