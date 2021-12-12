diff --git a/tests/src/roboguice/test/SafeAsyncTest.java b/tests/src/roboguice/test/SafeAsyncTest.java
index 3b9c969..73fc4b7 100644
--- a/tests/src/roboguice/test/SafeAsyncTest.java
+++ b/tests/src/roboguice/test/SafeAsyncTest.java
@@ -204,7 +204,7 @@
                     }
 
                     @Override
-                    protected void onInterrupted(InterruptedException e) {
+                    protected void onInterrupted(Exception e) {
                         state[0] = null; // expected
                     }
 
