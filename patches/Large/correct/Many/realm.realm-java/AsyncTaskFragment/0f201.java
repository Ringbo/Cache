diff --git a/examples/threadExample/src/main/java/io/realm/examples/threads/AsyncTaskFragment.java b/examples/threadExample/src/main/java/io/realm/examples/threads/AsyncTaskFragment.java
index 8ef12c8..50f95d1 100644
--- a/examples/threadExample/src/main/java/io/realm/examples/threads/AsyncTaskFragment.java
+++ b/examples/threadExample/src/main/java/io/realm/examples/threads/AsyncTaskFragment.java
@@ -96,7 +96,7 @@
 
                 // Slow down import so seekBar doesn't move too fast
                 try {
-                    Thread.sleep(50);
+                    Thread.sleep(25);
                 } catch (InterruptedException e) {
                     // Ignore. Task is cancelled and will be aborted.
                 }
