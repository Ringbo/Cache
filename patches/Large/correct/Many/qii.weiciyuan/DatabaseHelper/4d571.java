diff --git a/src/org/qii/weiciyuan/support/database/DatabaseHelper.java b/src/org/qii/weiciyuan/support/database/DatabaseHelper.java
index ce11661..3622b64 100644
--- a/src/org/qii/weiciyuan/support/database/DatabaseHelper.java
+++ b/src/org/qii/weiciyuan/support/database/DatabaseHelper.java
@@ -178,7 +178,7 @@
 
     }
 
-    public static DatabaseHelper getInstance() {
+    public static synchronized DatabaseHelper getInstance() {
         if (singleton == null) {
             singleton = new DatabaseHelper(GlobalContext.getInstance());
         }
