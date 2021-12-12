diff --git a/test/org/apache/coyote/http2/TestHttp2Section_5_1.java b/test/org/apache/coyote/http2/TestHttp2Section_5_1.java
index 7b31b7e..0d66f08 100644
--- a/test/org/apache/coyote/http2/TestHttp2Section_5_1.java
+++ b/test/org/apache/coyote/http2/TestHttp2Section_5_1.java
@@ -212,10 +212,13 @@
 
         sendSimpleRequest(5);
 
+        // Default connection window size is 64k - 1. Initial request will have
+        // used 8k (56k -1).
+        // Expecting
         // 1 * headers
-        // 64k of body (8 * 8k)
+        // 56k-1 of body (7 * ~8k)
         // 1 * error (could be in any order)
-        for (int i = 0; i < 9; i++) {
+        for (int i = 0; i < 8; i++) {
             parser.readFrame(true);
         }
         parser.readFrame(true);
