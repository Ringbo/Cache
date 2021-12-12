diff --git a/codec-http/src/test/java/io/netty/handler/codec/http/HttpInvalidMessageTest.java b/codec-http/src/test/java/io/netty/handler/codec/http/HttpInvalidMessageTest.java
index a99efa5..bae6eee 100644
--- a/codec-http/src/test/java/io/netty/handler/codec/http/HttpInvalidMessageTest.java
+++ b/codec-http/src/test/java/io/netty/handler/codec/http/HttpInvalidMessageTest.java
@@ -37,7 +37,7 @@
         HttpRequest req = (HttpRequest) ch.readInbound();
         DecoderResult dr = req.getDecoderResult();
         assertFalse(dr.isSuccess());
-        assertFalse(dr.isFailure());
+        assertTrue(dr.isFailure());
         ensureInboundTrafficDiscarded(ch);
     }
 
@@ -64,7 +64,7 @@
         HttpResponse res = (HttpResponse) ch.readInbound();
         DecoderResult dr = res.getDecoderResult();
         assertFalse(dr.isSuccess());
-        assertFalse(dr.isFailure());
+        assertTrue(dr.isFailure());
         ensureInboundTrafficDiscarded(ch);
     }
 
@@ -97,7 +97,7 @@
         HttpContent chunk = (HttpContent) ch.readInbound();
         DecoderResult dr = chunk.getDecoderResult();
         assertFalse(dr.isSuccess());
-        assertFalse(dr.isFailure());
+        assertTrue(dr.isFailure());
         ensureInboundTrafficDiscarded(ch);
     }
 
