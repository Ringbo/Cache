diff --git a/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java b/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java
index 08f326e..63b0ce4 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/Pipeline.java
@@ -120,7 +120,7 @@
                         break;
                     }
 
-                    nextExchange = createNextExchange(processor, exchange);
+                    nextExchange = createNextExchange(processor, nextExchange);
                     sync = process(original, nextExchange, callback, processors, processor);
                     if (!sync) {
                         return;
