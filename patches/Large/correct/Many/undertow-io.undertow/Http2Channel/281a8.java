diff --git a/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java b/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java
index 6c969ba..b5e74ca 100644
--- a/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java
+++ b/core/src/main/java/io/undertow/protocols/http2/Http2Channel.java
@@ -349,10 +349,10 @@
                 //the peer is going away
                 //everything is broken
                 for(Http2StreamSourceChannel stream : incomingStreams.values()) {
-                    stream.close();
+                    stream.rstStream();
                 }
                 for(Http2StreamSinkChannel stream : outgoingStreams.values()) {
-                    stream.close();
+                    stream.rstStream();
                 }
                 break;
             }
