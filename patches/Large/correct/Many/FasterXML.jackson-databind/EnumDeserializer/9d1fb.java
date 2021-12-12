diff --git a/src/main/java/com/fasterxml/jackson/databind/deser/std/EnumDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/deser/std/EnumDeserializer.java
index 5b42f6a..9387a6d 100644
--- a/src/main/java/com/fasterxml/jackson/databind/deser/std/EnumDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/deser/std/EnumDeserializer.java
@@ -56,7 +56,7 @@
     @Deprecated
     public static JsonDeserializer<?> deserializerForCreator(DeserializationConfig config,
             Class<?> enumClass, AnnotatedMethod factory) {
-        return deserializerForCreator(config, enumClass, factory);
+        return deserializerForCreator(config, enumClass, factory, null, null);
     }
 
     /**
