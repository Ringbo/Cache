diff --git a/src/main/java/com/blade/mvc/http/HttpResponse.java b/src/main/java/com/blade/mvc/http/HttpResponse.java
index d1c83cb..00a3556 100644
--- a/src/main/java/com/blade/mvc/http/HttpResponse.java
+++ b/src/main/java/com/blade/mvc/http/HttpResponse.java
@@ -202,7 +202,7 @@
         StringWriter sw = new StringWriter();
         try {
             templateEngine.render(modelAndView, sw);
-            ByteBuf          buffer   = Unpooled.wrappedBuffer(sw.toString().getBytes());
+            ByteBuf          buffer   = Unpooled.wrappedBuffer(sw.toString().getBytes("utf-8"));
             FullHttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.valueOf(statusCode), buffer);
             this.send(response);
         } catch (Exception e) {
