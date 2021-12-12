diff --git a/java/org/apache/coyote/http11/AbstractHttp11Processor.java b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
index bb18678..b208e3e 100644
--- a/java/org/apache/coyote/http11/AbstractHttp11Processor.java
+++ b/java/org/apache/coyote/http11/AbstractHttp11Processor.java
@@ -1586,7 +1586,7 @@
                 request.getReadListener() != null) {
             try {
                 try {
-                    if (inputBuffer.nbRead() > 0) {
+                    if (inputBuffer.available() > 0 ||  inputBuffer.nbRead() > 0) {
                         asyncStateMachine.asyncOperation();
                     }
                 } catch (IOException x) {
