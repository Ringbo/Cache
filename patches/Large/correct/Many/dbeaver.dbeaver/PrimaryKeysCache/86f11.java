diff --git a/plugins/org.jkiss.dbeaver.generic/src/org/jkiss/dbeaver/ext/generic/model/PrimaryKeysCache.java b/plugins/org.jkiss.dbeaver.generic/src/org/jkiss/dbeaver/ext/generic/model/PrimaryKeysCache.java
index 5d8ff3a..4c282d6 100644
--- a/plugins/org.jkiss.dbeaver.generic/src/org/jkiss/dbeaver/ext/generic/model/PrimaryKeysCache.java
+++ b/plugins/org.jkiss.dbeaver.generic/src/org/jkiss/dbeaver/ext/generic/model/PrimaryKeysCache.java
@@ -96,7 +96,7 @@
     {
         String columnName = GenericUtils.safeGetStringTrimmed(pkObject, dbResult, JDBCConstants.COLUMN_NAME);
         if (CommonUtils.isEmpty(columnName)) {
-            log.warn("Null primary key column for '" + object.getName() + "'");
+            log.debug("Null primary key column for '" + object.getName() + "'");
             return null;
         }
         if (columnName.startsWith("[") && columnName.endsWith("]")) {
