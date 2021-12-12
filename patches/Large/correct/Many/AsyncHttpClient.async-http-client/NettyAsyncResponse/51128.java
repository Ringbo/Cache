diff --git a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncResponse.java b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncResponse.java
index 2ed40bb..ebe3f03 100644
--- a/src/main/java/com/ning/http/client/providers/netty/NettyAsyncResponse.java
+++ b/src/main/java/com/ning/http/client/providers/netty/NettyAsyncResponse.java
@@ -230,7 +230,7 @@
      */
     /* @Override */
     public boolean hasResponseStatus() {
-        return (bodyParts != null ? true : false);
+        return (status != null ? true : false);
     }
 
     /**
