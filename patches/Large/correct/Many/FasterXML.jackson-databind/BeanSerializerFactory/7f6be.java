diff --git a/src/main/java/com/fasterxml/jackson/databind/ser/BeanSerializerFactory.java b/src/main/java/com/fasterxml/jackson/databind/ser/BeanSerializerFactory.java
index 39cda5e..f064f50 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ser/BeanSerializerFactory.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ser/BeanSerializerFactory.java
@@ -93,7 +93,7 @@
          *    Instead, let's actually just throw an error if this method is called when subtype
          *    has not properly overridden this method; this to indicate problem as soon as possible.
          */
-        ClassUtil.verifyMustOverride(BeanSerializerFactory.class, config, "withConfig");
+        ClassUtil.verifyMustOverride(BeanSerializerFactory.class, this, "withConfig");
         return new BeanSerializerFactory(config);
     }
 
