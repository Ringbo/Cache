diff --git a/platforms/commands/commands-core/src/main/java/org/apache/camel/commands/AbstractLocalCamelController.java b/platforms/commands/commands-core/src/main/java/org/apache/camel/commands/AbstractLocalCamelController.java
index d183e9b..cadb52b 100644
--- a/platforms/commands/commands-core/src/main/java/org/apache/camel/commands/AbstractLocalCamelController.java
+++ b/platforms/commands/commands-core/src/main/java/org/apache/camel/commands/AbstractLocalCamelController.java
@@ -132,7 +132,7 @@
             if (context.getStreamCachingStrategy().isEnabled()) {
                 answer.put("streamCachingEnabled", true);
                 answer.put("streamCaching.spoolDirectory", context.getStreamCachingStrategy().getSpoolDirectory());
-                answer.put("streamCaching.spoolChiper", context.getStreamCachingStrategy().getSpoolChiper());
+                answer.put("streamCaching.spoolChiper", context.getStreamCachingStrategy().getSpoolCipher());
                 answer.put("streamCaching.spoolThreshold", context.getStreamCachingStrategy().getSpoolThreshold());
                 answer.put("streamCaching.spoolUsedHeapMemoryThreshold", context.getStreamCachingStrategy().getSpoolUsedHeapMemoryThreshold());
                 answer.put("streamCaching.spoolUsedHeapMemoryLimit", context.getStreamCachingStrategy().getSpoolUsedHeapMemoryLimit());
