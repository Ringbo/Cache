diff --git a/src/main/java/org/jboss/netty/handler/codec/http/HttpContentDecoder.java b/src/main/java/org/jboss/netty/handler/codec/http/HttpContentDecoder.java
index 3a5f019..a322a71 100644
--- a/src/main/java/org/jboss/netty/handler/codec/http/HttpContentDecoder.java
+++ b/src/main/java/org/jboss/netty/handler/codec/http/HttpContentDecoder.java
@@ -62,7 +62,7 @@
         Object msg = e.getMessage();
         if (msg instanceof HttpResponse && ((HttpResponse) msg).getStatus().getCode() == 100) {
             // 100-continue response must be passed through.
-            ctx.sendDownstream(e);
+            ctx.sendUpstream(e);
         } else if (msg instanceof HttpMessage) {
             HttpMessage m = (HttpMessage) msg;
 
