diff --git a/core/src/main/java/org/elasticsearch/tribe/TribeService.java b/core/src/main/java/org/elasticsearch/tribe/TribeService.java
index 2bd4053..b037f70 100644
--- a/core/src/main/java/org/elasticsearch/tribe/TribeService.java
+++ b/core/src/main/java/org/elasticsearch/tribe/TribeService.java
@@ -262,7 +262,7 @@
                     try {
                         otherNode.close();
                     } catch (Throwable t) {
-                        logger.warn("failed to close node {} on failed start", otherNode, t);
+                        logger.warn("failed to close node {} on failed start", t, otherNode);
                     }
                 }
                 if (e instanceof RuntimeException) {
