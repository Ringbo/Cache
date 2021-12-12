diff --git a/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
index ccb6e23..5a2e9b6 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
@@ -240,7 +240,7 @@
         if (isParallelProcessing()) {
             executorService.submit(() -> ReactiveHelper.schedule(runnable));
         } else {
-            ReactiveHelper.scheduleLast(runnable, "Multicast next step");
+            ReactiveHelper.schedule(runnable, "Multicast next step");
         }
     }
 
