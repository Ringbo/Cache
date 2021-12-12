diff --git a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/wrapper/StreamChainImpl.java b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/wrapper/StreamChainImpl.java
index b87aca8..1b50f8b 100644
--- a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/wrapper/StreamChainImpl.java
+++ b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/wrapper/StreamChainImpl.java
@@ -90,7 +90,7 @@
       return myProducer;
     }
 
-    if (index < myIntermediateCalls.size()) {
+    if (index <= myIntermediateCalls.size()) {
       return myIntermediateCalls.get(index - 1);
     }
 
