diff --git a/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/spi/ResteasyProviderFactory.java b/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/spi/ResteasyProviderFactory.java
index 916a46d..aa41109 100755
--- a/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/spi/ResteasyProviderFactory.java
+++ b/jaxrs/resteasy-jaxrs/src/main/java/org/jboss/resteasy/spi/ResteasyProviderFactory.java
@@ -1806,7 +1806,7 @@
          try
          {
             addContextResolver((ContextResolver) provider);
-            int priority = getPriority(priorityOverride, contracts, ExceptionMapper.class, provider.getClass());
+            int priority = getPriority(priorityOverride, contracts, ContextResolver.class, provider.getClass());
             newContracts.put(ContextResolver.class, priority);
          }
          catch (Exception e)
