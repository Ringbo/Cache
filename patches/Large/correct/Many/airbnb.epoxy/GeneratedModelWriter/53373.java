diff --git a/epoxy-processor/src/main/java/com/airbnb/epoxy/GeneratedModelWriter.java b/epoxy-processor/src/main/java/com/airbnb/epoxy/GeneratedModelWriter.java
index 23b1adc..beff70e 100644
--- a/epoxy-processor/src/main/java/com/airbnb/epoxy/GeneratedModelWriter.java
+++ b/epoxy-processor/src/main/java/com/airbnb/epoxy/GeneratedModelWriter.java
@@ -830,7 +830,7 @@
 
   private MethodSpec generateSetClickModelListener(GeneratedModelInfo classInfo,
       AttributeInfo attribute) {
-    String attributeName = attribute.getFieldName();
+    String attributeName = attribute.generatedSetterName();
 
     ParameterizedTypeName clickListenerType =
         isViewLongClickListenerType(attribute.getTypeMirror())
