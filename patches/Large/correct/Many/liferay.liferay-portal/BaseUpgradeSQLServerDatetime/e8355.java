diff --git a/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradeSQLServerDatetime.java b/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradeSQLServerDatetime.java
index 7025668..d2fdc45 100644
--- a/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradeSQLServerDatetime.java
+++ b/portal-kernel/src/com/liferay/portal/kernel/upgrade/BaseUpgradeSQLServerDatetime.java
@@ -102,9 +102,9 @@
 					}
 
 					if (newTypeName.equals(columnRS.getString("TYPE_NAME")) &&
-						(_newSize == columnRS.getInt("COLUMN_SIZE"))) {
+						(_newSize == columnRS.getInt("DECIMAL_DIGITS"))) {
 
-						_log.error(
+						_log.warn(
 							StringBundler.concat(
 								"Column ", columnName, " in Table ", tableName,
 								" already is ", newTypeDefinition));
