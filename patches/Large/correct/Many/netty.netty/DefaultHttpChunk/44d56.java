diff --git a/src/main/java/org/jboss/netty/handler/codec/http/DefaultHttpChunk.java b/src/main/java/org/jboss/netty/handler/codec/http/DefaultHttpChunk.java
index 5f71625..7011d06 100644
--- a/src/main/java/org/jboss/netty/handler/codec/http/DefaultHttpChunk.java
+++ b/src/main/java/org/jboss/netty/handler/codec/http/DefaultHttpChunk.java
@@ -38,7 +38,7 @@
         if (content == null) {
             throw new NullPointerException("content");
         }
-        last = content.readable();
+        last = !content.readable();
         this.content = content;
     }
 
