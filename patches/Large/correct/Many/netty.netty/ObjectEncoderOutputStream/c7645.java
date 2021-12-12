diff --git a/src/main/java/org/jboss/netty/handler/codec/serialization/ObjectEncoderOutputStream.java b/src/main/java/org/jboss/netty/handler/codec/serialization/ObjectEncoderOutputStream.java
index 1fcbd59..30c2904 100644
--- a/src/main/java/org/jboss/netty/handler/codec/serialization/ObjectEncoderOutputStream.java
+++ b/src/main/java/org/jboss/netty/handler/codec/serialization/ObjectEncoderOutputStream.java
@@ -49,7 +49,7 @@
         if (out == null) {
             throw new NullPointerException("out");
         }
-        if (estimatedLength < 8) {
+        if (estimatedLength < 0) {
             throw new IllegalArgumentException("estimatedLength: " + estimatedLength);
         }
 
