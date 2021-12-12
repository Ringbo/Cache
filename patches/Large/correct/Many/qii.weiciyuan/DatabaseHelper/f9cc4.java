diff --git a/src/org/qii/weiciyuan/support/database/DatabaseHelper.java b/src/org/qii/weiciyuan/support/database/DatabaseHelper.java
index 688026f..dcd7d93 100644
--- a/src/org/qii/weiciyuan/support/database/DatabaseHelper.java
+++ b/src/org/qii/weiciyuan/support/database/DatabaseHelper.java
@@ -162,7 +162,7 @@
 
     }
 
-    public synchronized static DatabaseHelper getInstance() {
+    public  static DatabaseHelper getInstance() {
         if (singleton == null) {
             singleton = new DatabaseHelper(GlobalContext.getInstance());
         }
