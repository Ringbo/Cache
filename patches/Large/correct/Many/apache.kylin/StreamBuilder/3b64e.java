diff --git a/streaming/src/main/java/org/apache/kylin/streaming/StreamBuilder.java b/streaming/src/main/java/org/apache/kylin/streaming/StreamBuilder.java
index 8f3ce36..07b8616 100644
--- a/streaming/src/main/java/org/apache/kylin/streaming/StreamBuilder.java
+++ b/streaming/src/main/java/org/apache/kylin/streaming/StreamBuilder.java
@@ -106,7 +106,7 @@
                 }
                 if (streamMessage.getOffset() < 0) {
                     onStop();
-                    logger.warn("streaming encountered EOF, stop building");
+                    logger.warn("streaming encountered EOF, stop building. The remaining {} filtered messages will be discarded", filteredMsgCount);
                     break;
                 }
 
@@ -114,7 +114,7 @@
 
                 if (getStreamFilter().filter(parsedStreamMessage)) {
 
-                    if (filteredMsgCount++ % 10000 == 1) {
+                    if (filteredMsgCount++ % 10000 == 0) {
                         logger.info("Total filtered stream message count: " + filteredMsgCount);
                     }
 
