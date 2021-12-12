diff --git a/jaxrs/resteasy-guice/src/main/java/org/jboss/resteasy/plugins/guice/ModuleProcessor.java b/jaxrs/resteasy-guice/src/main/java/org/jboss/resteasy/plugins/guice/ModuleProcessor.java
index bf07cff..25cf82f 100644
--- a/jaxrs/resteasy-guice/src/main/java/org/jboss/resteasy/plugins/guice/ModuleProcessor.java
+++ b/jaxrs/resteasy-guice/src/main/java/org/jboss/resteasy/plugins/guice/ModuleProcessor.java
@@ -33,7 +33,7 @@
       List<Binding<?>> rootResourceBindings = new ArrayList<Binding<?>>();
       for (final Binding<?> binding : injector.getBindings().values())
       {
-         final Type type = binding.getKey().getTypeLiteral().getType();
+         final Type type = binding.getKey().getTypeLiteral().getRawType();
          if (type instanceof Class)
          {
             final Class<?> beanClass = (Class) type;
