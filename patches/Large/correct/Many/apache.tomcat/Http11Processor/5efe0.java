diff --git a/java/org/apache/coyote/http11/Http11Processor.java b/java/org/apache/coyote/http11/Http11Processor.java
index b919259..ed45861 100644
--- a/java/org/apache/coyote/http11/Http11Processor.java
+++ b/java/org/apache/coyote/http11/Http11Processor.java
@@ -308,7 +308,7 @@
             // will reset it
             // thrA.setParam(null);
             // Next request
-            if (!async) {
+            if (!async || error) {
                 inputBuffer.nextRequest();
                 outputBuffer.nextRequest();
             }
