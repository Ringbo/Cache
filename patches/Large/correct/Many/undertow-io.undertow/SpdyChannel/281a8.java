diff --git a/core/src/main/java/io/undertow/protocols/spdy/SpdyChannel.java b/core/src/main/java/io/undertow/protocols/spdy/SpdyChannel.java
index faf3ef8..20c059d 100644
--- a/core/src/main/java/io/undertow/protocols/spdy/SpdyChannel.java
+++ b/core/src/main/java/io/undertow/protocols/spdy/SpdyChannel.java
@@ -178,10 +178,10 @@
                 //the peer is going away
                 //everything is broken
                 for(SpdyStreamStreamSourceChannel stream : incomingStreams.values()) {
-                    stream.close();
+                    stream.rstStream();
                 }
                 for(SpdyStreamStreamSinkChannel stream : outgoingStreams.values()) {
-                    stream.close();
+                    stream.rstStream();
                 }
                 break;
             }
