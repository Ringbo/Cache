diff --git a/src/share/classes/com/sun/btrace/BTraceRuntime.java b/src/share/classes/com/sun/btrace/BTraceRuntime.java
index 72782fb..132e667 100755
--- a/src/share/classes/com/sun/btrace/BTraceRuntime.java
+++ b/src/share/classes/com/sun/btrace/BTraceRuntime.java
@@ -919,7 +919,7 @@
 
     public static <V> V removeFirst(Deque<V> queue) {
         if (queue instanceof BTraceDeque || queue.getClass().getClassLoader() == null) {
-            return queue.removeLast();
+            return queue.removeFirst();
         } else {
             throw new IllegalArgumentException();
         }
