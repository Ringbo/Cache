diff --git a/client-adapter/common/src/main/java/com/alibaba/otter/canal/client/adapter/support/JdbcTypeUtil.java b/client-adapter/common/src/main/java/com/alibaba/otter/canal/client/adapter/support/JdbcTypeUtil.java
index 77e2241..ebcb4ec 100644
--- a/client-adapter/common/src/main/java/com/alibaba/otter/canal/client/adapter/support/JdbcTypeUtil.java
+++ b/client-adapter/common/src/main/java/com/alibaba/otter/canal/client/adapter/support/JdbcTypeUtil.java
@@ -76,7 +76,7 @@
                || "TEXT".equalsIgnoreCase(columnType) || "TINYTEXT".equalsIgnoreCase(columnType);
     }
 
-    public static Object typeConvert(String columnName, String value, int sqlType, String mysqlType) {
+    public static Object typeConvert(String tableName ,String columnName, String value, int sqlType, String mysqlType) {
         if (value == null
             || (value.equals("") && !(isText(mysqlType) || sqlType == Types.CHAR || sqlType == Types.VARCHAR || sqlType == Types.LONGVARCHAR))) {
             return null;
@@ -161,7 +161,7 @@
             }
             return res;
         } catch (Exception e) {
-            logger.error("table: {} column: {}, failed convert type {} to {}", columnName, value, sqlType);
+            logger.error("table: {} column: {}, failed convert type {} to {}", tableName, columnName, value, sqlType);
             return value;
         }
     }
