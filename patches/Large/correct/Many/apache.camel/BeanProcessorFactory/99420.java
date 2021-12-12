diff --git a/core/camel-api/src/main/java/org/apache/camel/spi/BeanProcessorFactory.java b/core/camel-api/src/main/java/org/apache/camel/spi/BeanProcessorFactory.java
index 9ba6237..aa6e7f0 100644
--- a/core/camel-api/src/main/java/org/apache/camel/spi/BeanProcessorFactory.java
+++ b/core/camel-api/src/main/java/org/apache/camel/spi/BeanProcessorFactory.java
@@ -54,6 +54,6 @@
      * @return the created processor
      * @throws Exception is thrown if error creating the processor
      */
-    public Processor createBeanProcessor(CamelContext camelContext, Object bean, String beanType, Class<?> beanClass, String ref,
+    Processor createBeanProcessor(CamelContext camelContext, Object bean, String beanType, Class<?> beanClass, String ref,
                                          String method, boolean cacheBean) throws Exception;
 }
