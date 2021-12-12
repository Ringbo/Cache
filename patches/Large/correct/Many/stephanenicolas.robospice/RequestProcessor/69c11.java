diff --git a/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java b/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java
index 5896773..f0bf256 100644
--- a/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java
+++ b/robospice-core-parent/robospice/src/main/java/com/octo/android/robospice/request/RequestProcessor.java
@@ -560,7 +560,7 @@
     }
 
     public void removeSpiceServiceListener(final SpiceServiceServiceListener spiceServiceServiceListener) {
-        this.spiceServiceListenerSet.add(spiceServiceServiceListener);
+        this.spiceServiceListenerSet.remove(spiceServiceServiceListener);
     }
 
     protected void notifyOfRequestProcessed(final CachedSpiceRequest<?> request) {
