diff --git a/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java b/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java
index 2f396d1..fcacd61 100644
--- a/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java
+++ b/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java
@@ -461,14 +461,14 @@
     public boolean setUncancellable() {
         Object result = this.result;
         if (isDone0(result)) {
-            return isCancelled0(result);
+            return !isCancelled0(result);
         }
 
         synchronized (this) {
             // Allow only once.
             result = this.result;
             if (isDone0(result)) {
-                return isCancelled0(result);
+                return !isCancelled0(result);
             }
 
             this.result = UNCANCELLABLE;
