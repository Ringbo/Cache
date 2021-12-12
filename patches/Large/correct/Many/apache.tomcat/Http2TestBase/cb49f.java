diff --git a/test/org/apache/coyote/http2/Http2TestBase.java b/test/org/apache/coyote/http2/Http2TestBase.java
index c840d06..08cd08e 100644
--- a/test/org/apache/coyote/http2/Http2TestBase.java
+++ b/test/org/apache/coyote/http2/Http2TestBase.java
@@ -499,7 +499,7 @@
 
 
         @Override
-        public void setting(int identifier, long value) throws ConnectionError {
+        public void setting(int identifier, long value) throws ConnectionException {
             trace.append("0-Settings-[" + identifier + "]-[" + value + "]\n");
             remoteSettings.set(identifier, value);
         }
