diff --git a/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedWithParams.java b/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedWithParams.java
index 14e40a4..4277ba1 100644
--- a/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedWithParams.java
+++ b/src/main/java/com/fasterxml/jackson/databind/introspect/AnnotatedWithParams.java
@@ -107,7 +107,7 @@
     public final AnnotationMap getParameterAnnotations(int index)
     {
         if (_paramAnnotations != null) {
-            if (index >= 0 && index <= _paramAnnotations.length) {
+            if (index >= 0 && index < _paramAnnotations.length) {
                 return _paramAnnotations[index];
             }
         }
