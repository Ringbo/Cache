diff --git a/src/main/java/com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter.java b/src/main/java/com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter.java
index 507985e..157b426 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ser/impl/UnwrappingBeanPropertyWriter.java
@@ -40,7 +40,7 @@
     }
 
     private UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter base, NameTransformer transformer,
-            SerializableString name) {
+            SerializedString name) {
         super(base, name);
         _nameTransformer = transformer;
     }
