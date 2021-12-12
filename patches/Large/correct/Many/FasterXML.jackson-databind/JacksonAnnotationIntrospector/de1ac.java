diff --git a/src/main/java/com/fasterxml/jackson/databind/introspect/JacksonAnnotationIntrospector.java b/src/main/java/com/fasterxml/jackson/databind/introspect/JacksonAnnotationIntrospector.java
index cd84c3f..53c840e 100644
--- a/src/main/java/com/fasterxml/jackson/databind/introspect/JacksonAnnotationIntrospector.java
+++ b/src/main/java/com/fasterxml/jackson/databind/introspect/JacksonAnnotationIntrospector.java
@@ -631,7 +631,9 @@
             JsonProperty pann = _findAnnotation(a, JsonProperty.class);
             if (pann != null) {
                 name = pann.value();
-            } else if (_hasAnnotation(a, JsonSerialize.class) || _hasAnnotation(a, JsonView.class)) {
+            } else if (_hasAnnotation(a, JsonSerialize.class)
+                    || _hasAnnotation(a, JsonView.class)
+                    || _hasAnnotation(a, JsonRawValue.class)) {
                 name = "";
             } else {
                 return null;
