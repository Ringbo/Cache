diff --git a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsWrapperTypeDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsWrapperTypeDeserializer.java
index 6569b05..e148da1 100644
--- a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsWrapperTypeDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsWrapperTypeDeserializer.java
@@ -21,7 +21,7 @@
     extends TypeDeserializerBase
     implements java.io.Serializable
 {
-    private static final long serialVersionUID = 5345570420394408290L;
+    private static final long serialVersionUID = 1L;
 
     public AsWrapperTypeDeserializer(JavaType bt, TypeIdResolver idRes,
             String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl)
@@ -76,7 +76,7 @@
      * deserialization.
      */
     @SuppressWarnings("resource")
-    private final Object _deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
+    protected Object _deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
     {
         // 02-Aug-2013, tatu: May need to use native type ids
         if (jp.canReadTypeId()) {
