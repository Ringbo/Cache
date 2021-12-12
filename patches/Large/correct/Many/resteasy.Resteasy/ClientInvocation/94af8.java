diff --git a/jaxrs/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java b/jaxrs/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java
index 2520235..ec07088 100755
--- a/jaxrs/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java
+++ b/jaxrs/resteasy-client/src/main/java/org/jboss/resteasy/client/jaxrs/internal/ClientInvocation.java
@@ -389,7 +389,7 @@
          response.setProperties(configuration.getMutableProperties());
 
          ClientResponseFilter[] responseFilters = getResponseFilters();
-         if (requestFilters != null && requestFilters.length > 0)
+         if (responseFilters != null && responseFilters.length > 0)
          {
             ClientResponseContextImpl responseContext = new ClientResponseContextImpl(response);
             for (ClientResponseFilter filter : responseFilters)
