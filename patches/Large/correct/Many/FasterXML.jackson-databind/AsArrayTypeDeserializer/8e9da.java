diff --git a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsArrayTypeDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsArrayTypeDeserializer.java
index 9a06915..249adec 100644
--- a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsArrayTypeDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsArrayTypeDeserializer.java
@@ -80,7 +80,7 @@
      * deserialization.
      */
     @SuppressWarnings("resource")
-    private final Object _deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
+    protected Object _deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
     {
         // 02-Aug-2013, tatu: May need to use native type ids
         if (jp.canReadTypeId()) {
@@ -116,7 +116,7 @@
         return value;
     }    
     
-    protected final String _locateTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException
+    protected String _locateTypeId(JsonParser jp, DeserializationContext ctxt) throws IOException
     {
         if (!jp.isExpectedStartArrayToken()) {
             // Need to allow even more customized handling, if something unexpected seen...
