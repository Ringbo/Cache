diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/util/StreamCharBuffer.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/util/StreamCharBuffer.java
index d8b6dc4..9740198 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/util/StreamCharBuffer.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/util/StreamCharBuffer.java
@@ -719,7 +719,7 @@
             }
         }
         spaceLeft = allocBuffer.spaceLeft();
-        if (spaceLeft == 0) {
+        if (allocate && spaceLeft == 0) {
             totalChunkSize += allocBuffer.chunkSize();
             resizeChunkSizeAsProcentageOfTotalSize();
             allocBuffer = new AllocatedBuffer(chunkSize);
