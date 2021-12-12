diff --git a/codec-socks/src/main/java/io/netty/handler/codec/socks/SocksCmdRequest.java b/codec-socks/src/main/java/io/netty/handler/codec/socks/SocksCmdRequest.java
index c73a5ca..6411cb7 100644
--- a/codec-socks/src/main/java/io/netty/handler/codec/socks/SocksCmdRequest.java
+++ b/codec-socks/src/main/java/io/netty/handler/codec/socks/SocksCmdRequest.java
@@ -63,7 +63,7 @@
             case UNKNOWN:
                 break;
         }
-        if (port < 0 && port >= 65535) {
+        if (port < 0 && port >= 65536) {
             throw new IllegalArgumentException(port + " is not in bounds 0 < x < 65536");
         }
         this.cmdType = cmdType;
