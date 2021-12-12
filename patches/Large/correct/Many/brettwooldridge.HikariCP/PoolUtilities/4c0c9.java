diff --git a/hikaricp-java6/src/main/java/com/zaxxer/hikari/util/PoolUtilities.java b/hikaricp-java6/src/main/java/com/zaxxer/hikari/util/PoolUtilities.java
index 7a92155..7129393 100644
--- a/hikaricp-java6/src/main/java/com/zaxxer/hikari/util/PoolUtilities.java
+++ b/hikaricp-java6/src/main/java/com/zaxxer/hikari/util/PoolUtilities.java
@@ -326,7 +326,7 @@
    {
       if (connectionTimeout != Integer.MAX_VALUE) {
          try {
-            dataSource.setLoginTimeout((int) TimeUnit.MILLISECONDS.toSeconds(Math.min(1000L, connectionTimeout)));
+            dataSource.setLoginTimeout((int) TimeUnit.MILLISECONDS.toSeconds(Math.max(1000L, connectionTimeout)));
          }
          catch (SQLException e) {
             logger.warn("Unable to set DataSource login timeout", e);
