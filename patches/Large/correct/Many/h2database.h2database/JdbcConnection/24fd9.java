diff --git a/h2/src/main/org/h2/jdbc/JdbcConnection.java b/h2/src/main/org/h2/jdbc/JdbcConnection.java
index 5402af0..b147e95 100644
--- a/h2/src/main/org/h2/jdbc/JdbcConnection.java
+++ b/h2/src/main/org/h2/jdbc/JdbcConnection.java
@@ -1286,7 +1286,7 @@
      * @throws SQLException if the connection or session is closed
      */
     private void checkClosedForWrite() throws SQLException {
-        checkClosed();
+        checkClosed(true);
     }
 
     /**
