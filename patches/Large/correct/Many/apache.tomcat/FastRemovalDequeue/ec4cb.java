diff --git a/java/org/apache/jasper/util/FastRemovalDequeue.java b/java/org/apache/jasper/util/FastRemovalDequeue.java
index 0c11803..3a7cc22 100644
--- a/java/org/apache/jasper/util/FastRemovalDequeue.java
+++ b/java/org/apache/jasper/util/FastRemovalDequeue.java
@@ -174,7 +174,7 @@
      * Removes any element of the list and returns its content.
      **/
     public synchronized void remove(final Entry element) {
-        if (!element.getValid()) {
+        if (element == null || !element.getValid()) {
             return;
         }
         Entry next = element.getNext();
