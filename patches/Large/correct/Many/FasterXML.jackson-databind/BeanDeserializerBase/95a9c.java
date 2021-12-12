diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializerBase.java b/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializerBase.java
index 93bfc70..c9a547e 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializerBase.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/BeanDeserializerBase.java
@@ -917,7 +917,7 @@
         throws IOException, JsonProcessingException;
 
     @Override
-    public final Object deserializeWithType(JsonParser jp, DeserializationContext ctxt,
+    public Object deserializeWithType(JsonParser jp, DeserializationContext ctxt,
             TypeDeserializer typeDeserializer)
         throws IOException, JsonProcessingException
     {
