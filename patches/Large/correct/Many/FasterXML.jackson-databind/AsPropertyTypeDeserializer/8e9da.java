diff --git a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsPropertyTypeDeserializer.java b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsPropertyTypeDeserializer.java
index 484cb0b..ae8b539 100644
--- a/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsPropertyTypeDeserializer.java
+++ b/src/main/java/com/fasterxml/jackson/databind/jsontype/impl/AsPropertyTypeDeserializer.java
@@ -17,8 +17,6 @@
  * when typed object is expressed as JSON Object; otherwise behaves similar to how
  * {@link As#WRAPPER_ARRAY} works.
  * Latter is used if JSON representation is polymorphic
- * 
- * @author tatu
  */
 public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer
 {
@@ -104,7 +102,7 @@
     }
 
     @SuppressWarnings("resource")
-    protected final Object _deserializeTypedForId(JsonParser jp, DeserializationContext ctxt, TokenBuffer tb) throws IOException
+    protected Object _deserializeTypedForId(JsonParser jp, DeserializationContext ctxt, TokenBuffer tb) throws IOException
     {
         String typeId = jp.getText();
         JsonDeserializer<Object> deser = _findDeserializer(ctxt, typeId);
