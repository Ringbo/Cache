diff --git a/src/java/voldemort/serialization/json/JsonTypeSerializer.java b/src/java/voldemort/serialization/json/JsonTypeSerializer.java
index deff3b3..7eeb561 100644
--- a/src/java/voldemort/serialization/json/JsonTypeSerializer.java
+++ b/src/java/voldemort/serialization/json/JsonTypeSerializer.java
@@ -45,8 +45,7 @@
  */
 public class JsonTypeSerializer implements Serializer<Object> {
 
-    // TODO: not correct, should be less than this
-    private static final int MAX_SEQ_LENGTH = Integer.MAX_VALUE;
+    private static final int MAX_SEQ_LENGTH = 0x3FFFFFFF;
 
     private final boolean hasVersion;
     private final SortedMap<Integer, JsonTypeDefinition> typeDefVersions;
@@ -551,7 +550,7 @@
     private void writeLength(DataOutputStream stream, int size) throws IOException {
         if(size < Short.MAX_VALUE) {
             stream.writeShort(size);
-        } else if(size < MAX_SEQ_LENGTH) {
+        } else if(size <= MAX_SEQ_LENGTH) {
             stream.writeInt(size | 0xC0000000);
         } else {
             throw new SerializationException("Invalid length: maximum is " + MAX_SEQ_LENGTH);
