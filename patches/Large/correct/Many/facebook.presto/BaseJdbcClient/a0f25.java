diff --git a/presto-base-jdbc/src/main/java/com/facebook/presto/plugin/jdbc/BaseJdbcClient.java b/presto-base-jdbc/src/main/java/com/facebook/presto/plugin/jdbc/BaseJdbcClient.java
index 386a05a..ae26299 100644
--- a/presto-base-jdbc/src/main/java/com/facebook/presto/plugin/jdbc/BaseJdbcClient.java
+++ b/presto-base-jdbc/src/main/java/com/facebook/presto/plugin/jdbc/BaseJdbcClient.java
@@ -527,7 +527,7 @@
             if (((VarcharType) type).isUnbounded()) {
                 return "varchar";
             }
-            return "varchar(" + ((VarcharType) type).getLength() + ")";
+            return "varchar(" + ((VarcharType) type).getLengthSafe() + ")";
         }
         if (type instanceof CharType) {
             if (((CharType) type).getLength() == CharType.MAX_LENGTH) {
