diff --git a/src/org/qii/weiciyuan/support/database/GroupDBManager.java b/src/org/qii/weiciyuan/support/database/GroupDBManager.java
index 2d3c846..a09243b 100644
--- a/src/org/qii/weiciyuan/support/database/GroupDBManager.java
+++ b/src/org/qii/weiciyuan/support/database/GroupDBManager.java
@@ -22,7 +22,7 @@
 
     }
 
-    public synchronized static GroupDBManager getInstance() {
+    public static GroupDBManager getInstance() {
 
         if (singleton == null) {
             DatabaseHelper databaseHelper = DatabaseHelper.getInstance();
