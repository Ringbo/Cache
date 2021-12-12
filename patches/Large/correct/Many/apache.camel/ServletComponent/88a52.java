diff --git a/components/camel-servlet/src/main/java/org/apache/camel/component/servlet/ServletComponent.java b/components/camel-servlet/src/main/java/org/apache/camel/component/servlet/ServletComponent.java
index 4988564..6219e18 100644
--- a/components/camel-servlet/src/main/java/org/apache/camel/component/servlet/ServletComponent.java
+++ b/components/camel-servlet/src/main/java/org/apache/camel/component/servlet/ServletComponent.java
@@ -67,7 +67,7 @@
                 CastUtils.cast(parameters));
         uri = httpUri.toString();
 
-        ServletEndpoint result = createServletEndpoint(uri, this, httpUri, clientParams, getHttpConnectionManager(), httpClientConfigurer);
+        ServletEndpoint result = createServletEndpoint(uri, this, httpUri, clientParams, getClientConnectionManager(), httpClientConfigurer);
         if (httpBinding != null) {
             result.setBinding(httpBinding);
         }
