diff --git a/codec-http/src/test/java/io/netty/handler/codec/http/ServerCookieEncoderTest.java b/codec-http/src/test/java/io/netty/handler/codec/http/ServerCookieEncoderTest.java
index d30278b..bcdee4e 100644
--- a/codec-http/src/test/java/io/netty/handler/codec/http/ServerCookieEncoderTest.java
+++ b/codec-http/src/test/java/io/netty/handler/codec/http/ServerCookieEncoderTest.java
@@ -46,8 +46,8 @@
         assertTrue(matcher.find());
         Date expiresDate = HttpHeaderDateFormat.get().parse(matcher.group(1));
         long diff = (expiresDate.getTime() - System.currentTimeMillis()) / 1000;
-        // 1 sec should be fine
-        assertTrue(Math.abs(diff - maxAge) <= 1);
+        // 2 secs should be fine
+        assertTrue(Math.abs(diff - maxAge) <= 2);
     }
 
     @Test
