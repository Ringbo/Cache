diff --git a/presto-main/src/main/java/com/facebook/presto/execution/SharedBuffer.java b/presto-main/src/main/java/com/facebook/presto/execution/SharedBuffer.java
index 414ef09..446e929 100644
--- a/presto-main/src/main/java/com/facebook/presto/execution/SharedBuffer.java
+++ b/presto-main/src/main/java/com/facebook/presto/execution/SharedBuffer.java
@@ -343,7 +343,7 @@
             }
 
             // refill buffer from queued pages
-            while (!queuedPages.isEmpty() && bufferedBytes >= maxBufferedBytes) {
+            while (!queuedPages.isEmpty() && bufferedBytes < maxBufferedBytes) {
                 QueuedPage queuedPage = queuedPages.removeFirst();
                 addInternal(queuedPage.getPage());
                 queuedPage.getFuture().set(null);
