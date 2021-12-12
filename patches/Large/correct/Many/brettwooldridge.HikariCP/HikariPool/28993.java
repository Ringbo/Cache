diff --git a/src/main/java/com/zaxxer/hikari/HikariPool.java b/src/main/java/com/zaxxer/hikari/HikariPool.java
index 2d6070b..dd2dbe7 100644
--- a/src/main/java/com/zaxxer/hikari/HikariPool.java
+++ b/src/main/java/com/zaxxer/hikari/HikariPool.java
@@ -334,17 +334,17 @@
      */
     private boolean isConnectionAlive(final Connection connection, long timeoutMs)
     {
-        // Set a realistic minimum timeout
-        if (timeoutMs < 500)
+        // java.sql.Connection.isValid timeout is seconds, and can't be zero for timeout to work
+        if (timeoutMs < 1000)
         {
-            timeoutMs = 500;
+            timeoutMs = 1000;
         }
 
         try
         {
             if (jdbc4ConnectionTest)
             {
-                return connection.isValid((int) timeoutMs * 1000);
+                return connection.isValid((int) timeoutMs / 1000);
             }
 
             Statement statement = connection.createStatement();
