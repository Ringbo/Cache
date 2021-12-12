diff --git a/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java b/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java
index 453c44a..c50e0e5 100644
--- a/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java
+++ b/common/src/main/java/io/netty/util/concurrent/DefaultPromise.java
@@ -60,7 +60,7 @@
      *
      * Threading - synchronized(this). We must support adding listeners when there is no EventExecutor.
      */
-    private Object listeners;
+    private volatile Object listeners;
     /**
      * Threading - synchronized(this). We are required to hold the monitor to use Java's underlying wait()/notifyAll().
      */
@@ -417,7 +417,6 @@
     }
 
     private void notifyListeners() {
-        // Modifications to listeners should be done in a synchronized block before this, and should be visible here.
         if (listeners == null) {
             return;
         }
