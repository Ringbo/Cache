diff --git a/transport/src/main/java/io/netty/channel/DefaultFileRegion.java b/transport/src/main/java/io/netty/channel/DefaultFileRegion.java
index b3d47f8..9abb9be 100644
--- a/transport/src/main/java/io/netty/channel/DefaultFileRegion.java
+++ b/transport/src/main/java/io/netty/channel/DefaultFileRegion.java
@@ -49,7 +49,7 @@
         if (position < 0) {
             throw new IllegalArgumentException("position must be >= 0 but was " + position);
         }
-        if (count <= 0) {
+        if (count < 0) {
             throw new IllegalArgumentException("count must be >= 0 but was " + count);
         }
         this.file = file;
