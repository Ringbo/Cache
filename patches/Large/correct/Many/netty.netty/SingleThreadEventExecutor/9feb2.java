diff --git a/common/src/main/java/io/netty/util/concurrent/SingleThreadEventExecutor.java b/common/src/main/java/io/netty/util/concurrent/SingleThreadEventExecutor.java
index e962296..ccb88a9 100644
--- a/common/src/main/java/io/netty/util/concurrent/SingleThreadEventExecutor.java
+++ b/common/src/main/java/io/netty/util/concurrent/SingleThreadEventExecutor.java
@@ -282,7 +282,7 @@
 
             // Check timeout every 64 tasks because System.nanoTime() is relatively expensive.
             // XXX: Hard-coded value - will make it configurable if it is really a problem.
-            if ((runTasks & 0x40) == 0) {
+            if ((runTasks & 0x3F) == 0) {
                 if (System.nanoTime() >= deadline) {
                     break;
                 }
