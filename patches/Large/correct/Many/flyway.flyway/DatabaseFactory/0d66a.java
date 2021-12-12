diff --git a/flyway-core/src/main/java/org/flywaydb/core/internal/database/DatabaseFactory.java b/flyway-core/src/main/java/org/flywaydb/core/internal/database/DatabaseFactory.java
index 237da56..a0fbeed 100644
--- a/flyway-core/src/main/java/org/flywaydb/core/internal/database/DatabaseFactory.java
+++ b/flyway-core/src/main/java/org/flywaydb/core/internal/database/DatabaseFactory.java
@@ -201,7 +201,7 @@
      */
     static String filterUrl(String url) {
         int questionMark = url.indexOf("?");
-        if (questionMark >= 0) {
+        if (questionMark >= 0 && !url.contains("?databaseName=")) {
             url = url.substring(0, questionMark);
         }
         url = url.replaceAll("://.*:.*@", "://");
