diff --git a/src/main/java/org/elasticsearch/common/io/stream/StreamOutput.java b/src/main/java/org/elasticsearch/common/io/stream/StreamOutput.java
index e909c46..e414c0d 100644
--- a/src/main/java/org/elasticsearch/common/io/stream/StreamOutput.java
+++ b/src/main/java/org/elasticsearch/common/io/stream/StreamOutput.java
@@ -369,7 +369,7 @@
         } else if (value instanceof Text) {
             writeByte((byte) 15);
             writeText((Text) value);
-        } else if (value == Short.class) {
+        } else if (type == Short.class) {
             writeByte((byte) 16);
             writeShort((Short) value);
         } else {
