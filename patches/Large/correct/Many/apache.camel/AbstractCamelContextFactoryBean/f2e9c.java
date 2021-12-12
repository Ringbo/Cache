diff --git a/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java b/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java
index 8dcd5e3..dd42c1f 100644
--- a/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java
+++ b/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java
@@ -179,7 +179,7 @@
             getContext().addInterceptStrategy(delayer);
         }
         InflightRepository inflightRepository = getBeanForType(InflightRepository.class);
-        if (delayer != null) {
+        if (inflightRepository != null) {
             LOG.info("Using custom InflightRepository: " + inflightRepository);
             getContext().setInflightRepository(inflightRepository);
         }
