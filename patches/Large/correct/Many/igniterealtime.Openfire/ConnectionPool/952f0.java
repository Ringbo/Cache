diff --git a/src/java/org/jivesoftware/database/ConnectionPool.java b/src/java/org/jivesoftware/database/ConnectionPool.java
index 9960a75..bf0fba1 100644
--- a/src/java/org/jivesoftware/database/ConnectionPool.java
+++ b/src/java/org/jivesoftware/database/ConnectionPool.java
@@ -196,7 +196,7 @@
         }
 
         // check to see if there's any currently open connections to close
-        for (int i = 0; i <= conCount; i++) {
+        for (int i = 0; i < conCount; i++) {
             ConnectionWrapper wrapper = wrappers[i];
 
             // null means that the connection hasn't been initialized, which will only occur
