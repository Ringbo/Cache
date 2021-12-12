diff --git a/src/java/org/jivesoftware/database/DbConnectionManager.java b/src/java/org/jivesoftware/database/DbConnectionManager.java
index 5dd4e15..baf671d 100644
--- a/src/java/org/jivesoftware/database/DbConnectionManager.java
+++ b/src/java/org/jivesoftware/database/DbConnectionManager.java
@@ -779,7 +779,7 @@
         //   "REM" is Oracle
         //   "/*" is SQLServer
         if (line.startsWith("//") || line.startsWith("--") || line.startsWith("#") ||
-                line.startsWith("REM") || line.startsWith("/*"))
+                line.startsWith("REM") || line.startsWith("/*") || line.startsWith("*"))
         {
             return false;
         }
