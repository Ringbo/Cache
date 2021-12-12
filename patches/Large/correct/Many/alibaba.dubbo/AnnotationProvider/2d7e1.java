diff --git a/dubbo-test/dubbo-test-examples/src/main/java/com/alibaba/dubbo/examples/annotation/AnnotationProvider.java b/dubbo-test/dubbo-test-examples/src/main/java/com/alibaba/dubbo/examples/annotation/AnnotationProvider.java
index 4f5d520..e705925 100644
--- a/dubbo-test/dubbo-test-examples/src/main/java/com/alibaba/dubbo/examples/annotation/AnnotationProvider.java
+++ b/dubbo-test/dubbo-test-examples/src/main/java/com/alibaba/dubbo/examples/annotation/AnnotationProvider.java
@@ -36,14 +36,13 @@
     }
 
     @Configuration
-    @EnableDubbo(scanBasePackages = "com.alibaba.dubbo.examples.annotation.impl", multipleConfig = true)
+    @EnableDubbo(scanBasePackages = "com.alibaba.dubbo.examples.annotation.impl")
     @PropertySource("classpath:/com/alibaba/dubbo/examples/annotation/dubbo-provider.properties")
-//    @ComponentScan(value = {"com.alibaba.dubbo.examples.annotation.impl"})
     static public class ProviderConfiguration {
         @Bean
         public ProviderConfig providerConfig() {
             ProviderConfig providerConfig = new ProviderConfig();
-            providerConfig.setTimeout(1000);
+            providerConfig.setTimeout(5000);
             return providerConfig;
         }
     }
