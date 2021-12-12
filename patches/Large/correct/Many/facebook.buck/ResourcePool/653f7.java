diff --git a/src/com/facebook/buck/util/concurrent/ResourcePool.java b/src/com/facebook/buck/util/concurrent/ResourcePool.java
index 4975fae..2ae89ad 100644
--- a/src/com/facebook/buck/util/concurrent/ResourcePool.java
+++ b/src/com/facebook/buck/util/concurrent/ResourcePool.java
@@ -230,7 +230,7 @@
   }
 
   @Nullable
-  public ListenableFuture<Void> getShutdownFullyCompleteFuture() {
+  public synchronized ListenableFuture<Void> getShutdownFullyCompleteFuture() {
     Preconditions.checkState(
         closing.get(),
         "This method should not be called before the .close() method is called.");
