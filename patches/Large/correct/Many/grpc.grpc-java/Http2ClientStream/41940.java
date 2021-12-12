diff --git a/core/src/main/java/io/grpc/transport/Http2ClientStream.java b/core/src/main/java/io/grpc/transport/Http2ClientStream.java
index badc7c0..85577cc 100644
--- a/core/src/main/java/io/grpc/transport/Http2ClientStream.java
+++ b/core/src/main/java/io/grpc/transport/Http2ClientStream.java
@@ -99,7 +99,7 @@
     if (transportError != null) {
       // Note we don't immediately report the transport error, instead we wait for more data on the
       // stream so we can accumulate more detail into the error before reporting it.
-      transportError = transportError.withDescription("\n" + headers.toString());
+      transportError = transportError.augmentDescription("\n" + headers.toString());
       errorCharset = extractCharset(headers);
     } else {
       stripTransportDetails(headers);
