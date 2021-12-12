diff --git a/java/org/apache/juli/AsyncFileHandler.java b/java/org/apache/juli/AsyncFileHandler.java
index a2e416f..8c13e1d 100644
--- a/java/org/apache/juli/AsyncFileHandler.java
+++ b/java/org/apache/juli/AsyncFileHandler.java
@@ -152,7 +152,7 @@
                 try {
                     AsyncFileHandler.recordCounter.sleepUntilPositive();
                 } catch (InterruptedException x) {
-                    this.interrupted();
+                    Thread.interrupted();
                     continue;
                 }
                 AsyncFileHandler[] handlers = AsyncFileHandler.handlers.toArray(new AsyncFileHandler[0]);
