diff --git a/src/main/java/com/fasterxml/jackson/databind/node/TextNode.java b/src/main/java/com/fasterxml/jackson/databind/node/TextNode.java
index 9c0cd54..5e92a4d 100644
--- a/src/main/java/com/fasterxml/jackson/databind/node/TextNode.java
+++ b/src/main/java/com/fasterxml/jackson/databind/node/TextNode.java
@@ -63,7 +63,7 @@
     public byte[] getBinaryValue(Base64Variant b64variant) throws IOException
     {
         final String str = _value.trim();
-        ByteArrayBuilder builder = new ByteArrayBuilder(4 + ((str.length() * 3) << 2));
+        ByteArrayBuilder builder = new ByteArrayBuilder(4 + ((str.length() * 3) >> 2));
         try {
             b64variant.decode(str, builder);
         } catch (IllegalArgumentException e) {
