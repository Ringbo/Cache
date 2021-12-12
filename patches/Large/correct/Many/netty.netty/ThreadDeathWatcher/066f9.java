diff --git a/common/src/main/java/io/netty/util/ThreadDeathWatcher.java b/common/src/main/java/io/netty/util/ThreadDeathWatcher.java
index f98870c..84dbd83 100644
--- a/common/src/main/java/io/netty/util/ThreadDeathWatcher.java
+++ b/common/src/main/java/io/netty/util/ThreadDeathWatcher.java
@@ -85,7 +85,7 @@
      *
      * @return {@code true} if and only if the watcher thread has been terminated
      */
-    public boolean awaitInactivity(long timeout, TimeUnit unit) throws InterruptedException {
+    public static boolean awaitInactivity(long timeout, TimeUnit unit) throws InterruptedException {
         if (unit == null) {
             throw new NullPointerException("unit");
         }
