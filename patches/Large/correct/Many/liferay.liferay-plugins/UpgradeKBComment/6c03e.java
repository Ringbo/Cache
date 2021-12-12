diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBComment.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBComment.java
index 1c5dfc4..12a00cf 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBComment.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBComment.java
@@ -42,7 +42,7 @@
 			String tableSqlCreate, String tableSqlDrop)
 		throws Exception {
 
-		if (tableHasData(newTableName)) {
+		if (hasRows(newTableName)) {
 			if (_log.isWarnEnabled()) {
 				_log.warn(
 					"Not renaming " + oldTableName + " to " + newTableName +
@@ -52,7 +52,7 @@
 			return;
 		}
 
-		if (!tableHasData(oldTableName)) {
+		if (!hasRows(oldTableName)) {
 			if (_log.isWarnEnabled()) {
 				_log.warn(
 					"Not renaming " + oldTableName + " to " + newTableName +
@@ -83,7 +83,7 @@
 			String tableName, String columnName, String dataType, String data)
 		throws Exception {
 
-		if (tableHasColumn(tableName, columnName)) {
+		if (hasColumn(tableName, columnName)) {
 			return;
 		}
 
@@ -128,7 +128,7 @@
 
 		updateColumn(oldTableName, "kbCommentId", "LONG", "commentId");
 
-		if (tableHasColumn(oldTableName, "commentId")) {
+		if (hasColumn(oldTableName, "commentId")) {
 			runSQL("alter table " + oldTableName + " drop column commentId");
 		}
 	}
