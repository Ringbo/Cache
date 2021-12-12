diff --git a/components/camel-dozer/src/main/java/org/apache/camel/component/dozer/DozerProducer.java b/components/camel-dozer/src/main/java/org/apache/camel/component/dozer/DozerProducer.java
index b316197..7050225 100644
--- a/components/camel-dozer/src/main/java/org/apache/camel/component/dozer/DozerProducer.java
+++ b/components/camel-dozer/src/main/java/org/apache/camel/component/dozer/DozerProducer.java
@@ -59,7 +59,7 @@
         }
         
         // Load the target model class
-        Class<?> targetModel = endpoint.getCamelContext().getClassResolver().resolveClass(
+        Class<?> targetModel = endpoint.getCamelContext().getClassResolver().resolveMandatoryClass(
                 endpoint.getConfiguration().getTargetModel());
         
         // If an unmarshaller was used, the unmarshalled message is the OUT message.
