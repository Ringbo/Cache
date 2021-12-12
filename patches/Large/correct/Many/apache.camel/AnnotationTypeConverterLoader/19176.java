diff --git a/camel-core/src/main/java/org/apache/camel/impl/converter/AnnotationTypeConverterLoader.java b/camel-core/src/main/java/org/apache/camel/impl/converter/AnnotationTypeConverterLoader.java
index 5fe4642..74e3f0e 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/converter/AnnotationTypeConverterLoader.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/converter/AnnotationTypeConverterLoader.java
@@ -165,7 +165,7 @@
                 Class<?> clazz = null;
                 for (ClassLoader loader : resolver.getClassLoaders()) {
                     try {
-                        clazz = loader.loadClass(name);
+                        clazz = ObjectHelper.loadClass(name, loader);
                         LOG.trace("Loaded {} as class {}", name, clazz);
                         classes.add(clazz);
                         // class founder, so no need to load it with another class loader
