diff --git a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBTemplate.java b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBTemplate.java
index 8ca3bf5..4f2494e 100644
--- a/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBTemplate.java
+++ b/portlets/knowledge-base-portlet/docroot/WEB-INF/src/com/liferay/knowledgebase/hook/upgrade/v1_1_0/UpgradeKBTemplate.java
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
 
@@ -130,11 +130,11 @@
 		updateColumn(oldTableName, "engineType", "INTEGER", "0");
 		updateColumn(oldTableName, "cacheable", "BOOLEAN", "TRUE");
 
-		if (tableHasColumn(oldTableName, "templateId")) {
+		if (hasColumn(oldTableName, "templateId")) {
 			runSQL("alter table " + oldTableName + " drop column templateId");
 		}
 
-		if (tableHasColumn(oldTableName, "description")) {
+		if (hasColumn(oldTableName, "description")) {
 			runSQL("alter table " + oldTableName + " drop column description");
 		}
 	}
