diff --git a/src/main/java/com/fasterxml/jackson/databind/DeserializationContext.java b/src/main/java/com/fasterxml/jackson/databind/DeserializationContext.java
index b7fcb3b..439cbf8 100644
--- a/src/main/java/com/fasterxml/jackson/databind/DeserializationContext.java
+++ b/src/main/java/com/fasterxml/jackson/databind/DeserializationContext.java
@@ -906,7 +906,7 @@
     public JsonMappingException weirdStringException(String value, Class<?> instClass, String msg) {
         return InvalidFormatException.from(_parser,
                 String.format("Can not construct instance of %s from String value '%s': %s",
-                        instClass.getName(), _valueDesc(), msg),
+                        instClass.getName(), _desc(value), msg),
                 value, instClass);
     }
 
@@ -917,7 +917,7 @@
     public JsonMappingException weirdNumberException(Number value, Class<?> instClass, String msg) {
         return InvalidFormatException.from(_parser,
                 String.format("Can not construct instance of %s from number value (%s): %s",
-                        instClass.getName(), _valueDesc(), msg),
+                        instClass.getName(), String.valueOf(value), msg),
                 null, instClass);
     }
     
