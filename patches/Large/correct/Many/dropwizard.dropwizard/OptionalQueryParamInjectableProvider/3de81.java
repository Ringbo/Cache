diff --git a/dropwizard/src/main/java/com/yammer/dropwizard/jersey/OptionalQueryParamInjectableProvider.java b/dropwizard/src/main/java/com/yammer/dropwizard/jersey/OptionalQueryParamInjectableProvider.java
index 220be7b..aed7312 100644
--- a/dropwizard/src/main/java/com/yammer/dropwizard/jersey/OptionalQueryParamInjectableProvider.java
+++ b/dropwizard/src/main/java/com/yammer/dropwizard/jersey/OptionalQueryParamInjectableProvider.java
@@ -29,7 +29,7 @@
                 c.getParameterClass().isAssignableFrom(Optional.class)) {
             return new MultivaluedParameterExtractorQueryParamInjectable(
                     new OptionalExtractor(parameterName, c.getDefaultValue()),
-                    c.isEncoded()
+                    !c.isEncoded()
             );
         }
         return null;
