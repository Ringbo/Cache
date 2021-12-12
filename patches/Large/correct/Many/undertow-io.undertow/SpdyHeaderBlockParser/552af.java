diff --git a/core/src/main/java/io/undertow/spdy/SpdyHeaderBlockParser.java b/core/src/main/java/io/undertow/spdy/SpdyHeaderBlockParser.java
index 58e991a..ca0fa77 100644
--- a/core/src/main/java/io/undertow/spdy/SpdyHeaderBlockParser.java
+++ b/core/src/main/java/io/undertow/spdy/SpdyHeaderBlockParser.java
@@ -145,7 +145,7 @@
                     this.partialValue = null;
                 } else {
                     remainingData = remainingData - data.remaining();
-                    partialValue.write(data.array(), data.arrayOffset() + data.remaining(), data.remaining());
+                    partialValue.write(data.array(), data.arrayOffset() + data.position(), data.remaining());
                     data.clear();
                     return;
                 }
@@ -211,7 +211,7 @@
                 } else {
                     remainingData = remainingData - data.remaining();
                     partialValue = new ByteArrayOutputStream();
-                    partialValue.write(data.array(), data.arrayOffset() + data.remaining(), data.remaining());
+                    partialValue.write(data.array(), data.arrayOffset() + data.position(), data.remaining());
                     data.clear();
                     return;
                 }
