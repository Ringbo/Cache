diff --git a/src/org/qii/weiciyuan/support/database/DatabaseManager.java b/src/org/qii/weiciyuan/support/database/DatabaseManager.java
index f7ffab6..0a2ff23 100644
--- a/src/org/qii/weiciyuan/support/database/DatabaseManager.java
+++ b/src/org/qii/weiciyuan/support/database/DatabaseManager.java
@@ -32,7 +32,7 @@
 
     }
 
-    public synchronized static DatabaseManager getInstance() {
+    public  static DatabaseManager getInstance() {
 
         if (singleton == null) {
             DatabaseHelper databaseHelper = DatabaseHelper.getInstance();
