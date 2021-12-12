diff --git a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java
index 9aaf9f8..7609b44 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Utils.java
@@ -86,7 +86,7 @@
     }
 
     private static boolean appendValueIfLiteral(Object value, StringBuilder sb) {
-        if (value instanceof Integer || value instanceof Long || value instanceof Float || value instanceof Double || value instanceof UUID) {
+        if (value instanceof Integer || value instanceof Long || value instanceof Float || value instanceof Double || value instanceof UUID || value instanceof Boolean) {
             sb.append(value);
             return true;
         } else if (value instanceof InetAddress) {
