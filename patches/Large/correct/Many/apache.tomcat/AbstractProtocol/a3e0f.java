diff --git a/java/org/apache/coyote/AbstractProtocol.java b/java/org/apache/coyote/AbstractProtocol.java
index cb7c03f..716ed5f 100644
--- a/java/org/apache/coyote/AbstractProtocol.java
+++ b/java/org/apache/coyote/AbstractProtocol.java
@@ -785,7 +785,7 @@
         }
 
         @Override
-        public void clear() {
+        public synchronized void clear() {
             Processor<S> next = pop();
             while (next != null) {
                 handler.unregister(next);
