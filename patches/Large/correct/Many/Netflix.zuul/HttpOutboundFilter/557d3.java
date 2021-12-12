diff --git a/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpOutboundFilter.java b/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpOutboundFilter.java
index 7f3f168..fd8f63a 100644
--- a/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpOutboundFilter.java
+++ b/zuul-core/src/main/java/com/netflix/zuul/filters/http/HttpOutboundFilter.java
@@ -33,7 +33,7 @@
     }
 
     @Override
-    public ZuulMessage getDefaultOutput(HttpResponseMessage input)
+    public HttpResponseMessage getDefaultOutput(HttpResponseMessage input)
     {
         return input;
     }
