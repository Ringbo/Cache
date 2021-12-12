diff --git a/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteQueueExample.java b/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteQueueExample.java
index f0131bf..6cdfd15 100644
--- a/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteQueueExample.java
+++ b/examples/src/main/java/org/apache/ignite/examples/datastructures/IgniteQueueExample.java
@@ -153,7 +153,7 @@
         try {
             queue.poll();
         }
-        catch (IgniteException expected) {
+        catch (IllegalStateException expected) {
             System.out.println("Expected exception - " + expected.getMessage());
         }
     }
