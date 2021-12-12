diff --git a/core/src/main/java/io/undertow/channels/FixedLengthStreamSourceChannel.java b/core/src/main/java/io/undertow/channels/FixedLengthStreamSourceChannel.java
index 7083c15..a0683ef 100644
--- a/core/src/main/java/io/undertow/channels/FixedLengthStreamSourceChannel.java
+++ b/core/src/main/java/io/undertow/channels/FixedLengthStreamSourceChannel.java
@@ -214,7 +214,7 @@
             final int lim = dst.limit();
             final int pos = dst.position();
             if (lim - pos > remaining) {
-                dst.limit((int) (remaining - (long) pos));
+                dst.limit((int) (remaining + (long) pos));
                 try {
                     return res = delegate.read(dst);
                 } finally {
