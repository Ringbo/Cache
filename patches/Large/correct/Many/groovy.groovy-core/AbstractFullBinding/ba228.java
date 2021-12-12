diff --git a/src/main/org/codehaus/groovy/binding/AbstractFullBinding.java b/src/main/org/codehaus/groovy/binding/AbstractFullBinding.java
index 5a7c53c..472bbaa 100644
--- a/src/main/org/codehaus/groovy/binding/AbstractFullBinding.java
+++ b/src/main/org/codehaus/groovy/binding/AbstractFullBinding.java
@@ -37,9 +37,9 @@
         }
         Object result = sourceBinding.getSourceValue();
         if (getValidator() != null) {
-            Object validation = getValidator().call();
+            Object validation = getValidator().call(result);
             if ((validation == null)
-                || ((validation instanceof Boolean) && !((Boolean)validation).booleanValue()))
+                || ((validation instanceof Boolean) && !(Boolean) validation))
             {
                 // should we throw a validation failed exception?  or fail quietly?
                 return;
