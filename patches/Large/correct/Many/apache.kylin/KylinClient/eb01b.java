diff --git a/jdbc/src/main/java/org/apache/kylin/jdbc/KylinClient.java b/jdbc/src/main/java/org/apache/kylin/jdbc/KylinClient.java
index 6814f2d..9826de5 100644
--- a/jdbc/src/main/java/org/apache/kylin/jdbc/KylinClient.java
+++ b/jdbc/src/main/java/org/apache/kylin/jdbc/KylinClient.java
@@ -176,20 +176,20 @@
             return new BigDecimal(value);
         case Types.BIT:
         case Types.BOOLEAN:
-            return Boolean.parseBoolean(value);
+            return Boolean.valueOf(value);
         case Types.TINYINT:
             return Byte.valueOf(value);
         case Types.SMALLINT:
             return Short.valueOf(value);
         case Types.INTEGER:
-            return Integer.parseInt(value);
+            return Integer.valueOf(value);
         case Types.BIGINT:
-            return Long.parseLong(value);
+            return Long.valueOf(value);
         case Types.FLOAT:
-            return Float.parseFloat(value);
+            return Float.valueOf(value);
         case Types.REAL:
         case Types.DOUBLE:
-            return Double.parseDouble(value);
+            return Double.valueOf(value);
         case Types.BINARY:
         case Types.VARBINARY:
         case Types.LONGVARBINARY:
