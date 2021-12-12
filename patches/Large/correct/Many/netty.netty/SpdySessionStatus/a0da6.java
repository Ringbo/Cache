diff --git a/codec-http/src/main/java/io/netty/handler/codec/spdy/SpdySessionStatus.java b/codec-http/src/main/java/io/netty/handler/codec/spdy/SpdySessionStatus.java
index d530be2..72ebffa 100644
--- a/codec-http/src/main/java/io/netty/handler/codec/spdy/SpdySessionStatus.java
+++ b/codec-http/src/main/java/io/netty/handler/codec/spdy/SpdySessionStatus.java
@@ -34,10 +34,10 @@
         new SpdySessionStatus(1, "PROTOCOL_ERROR");
 
     /**
-     * 11 Internal Error
+     * 2 Internal Error
      */
     public static final SpdySessionStatus INTERNAL_ERROR =
-        new SpdySessionStatus(11, "INTERNAL_ERROR");
+        new SpdySessionStatus(2, "INTERNAL_ERROR");
 
     /**
      * Returns the {@link SpdySessionStatus} represented by the specified code.
@@ -50,7 +50,7 @@
             return OK;
         case 1:
             return PROTOCOL_ERROR;
-        case 11:
+        case 2:
             return INTERNAL_ERROR;
         }
 
