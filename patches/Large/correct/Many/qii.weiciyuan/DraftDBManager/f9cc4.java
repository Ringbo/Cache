diff --git a/src/org/qii/weiciyuan/support/database/DraftDBManager.java b/src/org/qii/weiciyuan/support/database/DraftDBManager.java
index 07100f4..ee163c5 100644
--- a/src/org/qii/weiciyuan/support/database/DraftDBManager.java
+++ b/src/org/qii/weiciyuan/support/database/DraftDBManager.java
@@ -33,7 +33,7 @@
 
     }
 
-    public synchronized static DraftDBManager getInstance() {
+    public static DraftDBManager getInstance() {
 
         if (singleton == null) {
             DatabaseHelper databaseHelper = DatabaseHelper.getInstance();
