diff --git a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
index b823ca6..cab0b2d 100644
--- a/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
+++ b/caffeine/src/main/java/com/github/benmanes/caffeine/cache/BoundedLocalCache.java
@@ -2654,20 +2654,20 @@
     }
   }
 
-  /** A reusable task that performs the maintenance work used to avoid wrapping by ForkJoinPool. */
+  /** A reusable task that performs the maintenance work; used to avoid wrapping by ForkJoinPool. */
   final class PerformCleanupTask extends ForkJoinTask<Void> implements Runnable {
     private static final long serialVersionUID = 1L;
 
     @Override
-    public final Void getRawResult() {
+    public Void getRawResult() {
       return null;
     }
 
     @Override
-    public final void setRawResult(Void v) {}
+    public void setRawResult(Void v) {}
 
     @Override
-    public final boolean exec() {
+    public boolean exec() {
       performCleanUp();
       return true;
     }
