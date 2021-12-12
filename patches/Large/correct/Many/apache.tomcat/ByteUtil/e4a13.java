diff --git a/java/org/apache/coyote/http2/ByteUtil.java b/java/org/apache/coyote/http2/ByteUtil.java
index c940ce2..d1e3060 100644
--- a/java/org/apache/coyote/http2/ByteUtil.java
+++ b/java/org/apache/coyote/http2/ByteUtil.java
@@ -27,7 +27,7 @@
 
 
     static boolean isBit7Set(byte input) {
-        return (input & 0x80) > 0;
+        return (input & 0x80) != 0;
     }
 
 
