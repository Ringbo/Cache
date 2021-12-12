diff --git a/camel-core/src/main/java/org/apache/camel/processor/SharedCamelInternalProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/SharedCamelInternalProcessor.java
index 4f004ef..ab9c3da 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/SharedCamelInternalProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/SharedCamelInternalProcessor.java
@@ -191,7 +191,7 @@
             // CAMEL END USER - DEBUG ME HERE +++ END +++
             // ----------------------------------------------------------
 
-            ReactiveHelper.scheduleLast(() -> {
+            ReactiveHelper.schedule(() -> {
                 // execute any after processor work (in current thread, not in the callback)
                 if (uow != null) {
                     uow.afterProcess(processor, exchange, callback, sync);
