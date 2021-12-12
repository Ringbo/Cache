diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBArticle.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBArticle.java
index 627b5e8..71ce415 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBArticle.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBArticle.java
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
@@ -95,7 +95,7 @@
 			String tableName, String columnName, String dataType, String data)
 		throws Exception {
 
-		if (tableHasColumn(tableName, columnName)) {
+		if (hasColumn(tableName, columnName)) {
 			return;
 		}
 
@@ -150,7 +150,7 @@
 		updateColumn(oldTableName, "statusByUserName", "STRING", "userName");
 		updateColumn(oldTableName, "statusDate", "DATE", "modifiedDate");
 
-		if (tableHasColumn(oldTableName, "articleId")) {
+		if (hasColumn(oldTableName, "articleId")) {
 			runSQL("alter table " + oldTableName + " drop column articleId");
 		}
 	}
