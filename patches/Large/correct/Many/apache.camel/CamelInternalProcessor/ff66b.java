diff --git a/camel-core/src/main/java/org/apache/camel/processor/CamelInternalProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/CamelInternalProcessor.java
index ce03628..f485440 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/CamelInternalProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/CamelInternalProcessor.java
@@ -222,7 +222,7 @@
             // CAMEL END USER - DEBUG ME HERE +++ END +++
             // ----------------------------------------------------------
 
-            ReactiveHelper.scheduleLast(() -> {
+            ReactiveHelper.schedule(() -> {
                 // execute any after processor work (in current thread, not in the callback)
                 if (uow != null) {
                     uow.afterProcess(processor, exchange, callback, false);
