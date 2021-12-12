diff --git a/app/src/processing/app/Editor.java b/app/src/processing/app/Editor.java
index 24d3c3b..918022a 100644
--- a/app/src/processing/app/Editor.java
+++ b/app/src/processing/app/Editor.java
@@ -2882,7 +2882,7 @@
    */
   public void statusNotice(String msg) {
     if (msg == null) {
-      new Exception("This code called statusNotice(null)").printStackTrace();
+      new IllegalArgumentException("This code called statusNotice(null)").printStackTrace();
       msg = "";
     }
     status.notice(msg);
