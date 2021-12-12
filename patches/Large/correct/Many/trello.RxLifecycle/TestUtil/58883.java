diff --git a/rxlifecycle-navi/src/test/java/com/trello/rxlifecycle/components/TestUtil.java b/rxlifecycle-navi/src/test/java/com/trello/rxlifecycle/components/TestUtil.java
index ff76ff5..acdc57a 100644
--- a/rxlifecycle-navi/src/test/java/com/trello/rxlifecycle/components/TestUtil.java
+++ b/rxlifecycle-navi/src/test/java/com/trello/rxlifecycle/components/TestUtil.java
@@ -5,7 +5,7 @@
     /**
      * Used for testing whether references are cleared.
      */
-    static final void cleanGarbage() {
+    static void cleanGarbage() {
         System.gc();
         try {
             Thread.sleep(100);
