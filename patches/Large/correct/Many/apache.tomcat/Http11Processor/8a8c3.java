diff --git a/java/org/apache/coyote/http11/Http11Processor.java b/java/org/apache/coyote/http11/Http11Processor.java
index 038d614..d97d06f 100644
--- a/java/org/apache/coyote/http11/Http11Processor.java
+++ b/java/org/apache/coyote/http11/Http11Processor.java
@@ -1730,7 +1730,8 @@
     @Override
     public SocketState asyncDispatch(SocketStatus status) {
 
-        if (status == SocketStatus.OPEN_WRITE) {
+        if (status == SocketStatus.OPEN_WRITE &&
+                response.getWriteListener() != null) {
             try {
                 asyncStateMachine.asyncOperation();
 
