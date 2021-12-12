diff --git a/platform/util/src/com/intellij/openapi/util/DefaultJDOMExternalizer.java b/platform/util/src/com/intellij/openapi/util/DefaultJDOMExternalizer.java
index a5beb43..47e6847 100644
--- a/platform/util/src/com/intellij/openapi/util/DefaultJDOMExternalizer.java
+++ b/platform/util/src/com/intellij/openapi/util/DefaultJDOMExternalizer.java
@@ -61,7 +61,7 @@
 
       field.setAccessible(true); // class might be non-public
       Class type = field.getType();
-      if (filter != null && !filter.isAccept(field)) {
+      if (filter != null && !filter.isAccept(field) || field.getDeclaringClass().getAnnotation(Transient.class) != null) {
         continue;
       }
       String value = null;
