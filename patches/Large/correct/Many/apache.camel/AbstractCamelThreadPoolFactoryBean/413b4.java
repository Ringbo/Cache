diff --git a/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelThreadPoolFactoryBean.java b/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelThreadPoolFactoryBean.java
index 5426590..d4200df 100644
--- a/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelThreadPoolFactoryBean.java
+++ b/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelThreadPoolFactoryBean.java
@@ -76,7 +76,7 @@
 
         int queueSize = -1;
         if (maxQueueSize != null) {
-            queueSize = CamelContextHelper.parseInteger(getCamelContext(), keepAliveTime);
+            queueSize = CamelContextHelper.parseInteger(getCamelContext(), maxQueueSize);
         }
 
         ExecutorService answer = getCamelContext().getExecutorServiceStrategy().newThreadPool(getId(), getThreadName(),
