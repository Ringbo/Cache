diff --git a/core/camel-core/src/main/java/org/apache/camel/component/bean/AbstractCamelInvocationHandler.java b/core/camel-core/src/main/java/org/apache/camel/component/bean/AbstractCamelInvocationHandler.java
index c667971..6f9b178 100644
--- a/core/camel-core/src/main/java/org/apache/camel/component/bean/AbstractCamelInvocationHandler.java
+++ b/core/camel-core/src/main/java/org/apache/camel/component/bean/AbstractCamelInvocationHandler.java
@@ -167,7 +167,7 @@
         if (binding) {
             LOG.trace("Binding to service interface as @Body,@Header,@ExchangeProperty detected when calling proxy method: {}", method);
         } else {
-            LOG.trace("No binding to service interface as @Body,@Header,@ExchangeProperty not detected. Using BeanInvocation as message body when calling proxy method: {}");
+            LOG.trace("No binding to service interface as @Body,@Header,@ExchangeProperty not detected. Using BeanInvocation as message body when calling proxy method: {}", method);
         }
 
         return doInvoke(method, exchange);
