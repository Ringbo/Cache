diff --git a/codec-http/src/main/java/io/netty/handler/codec/http/HttpObjectEncoder.java b/codec-http/src/main/java/io/netty/handler/codec/http/HttpObjectEncoder.java
index 7ef528f..878a264 100755
--- a/codec-http/src/main/java/io/netty/handler/codec/http/HttpObjectEncoder.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/http/HttpObjectEncoder.java
@@ -195,7 +195,14 @@
         }
     }
 
-    boolean isContentAlwaysEmpty(@SuppressWarnings("unused") H msg) {
+    /**
+     * Determine whether a message has a content or not. Some message may have headers indicating
+     * a content without having an actual content, e.g the response to an HEAD or CONNECT request.
+     *
+     * @param msg the message to test
+     * @return {@code true} to signal the message has no content
+     */
+    protected boolean isContentAlwaysEmpty(@SuppressWarnings("unused") H msg) {
         return false;
     }
 
