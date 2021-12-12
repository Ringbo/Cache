diff --git a/dubbo-spring-boot-autoconfigure/src/main/java/com/alibaba/boot/dubbo/autoconfigure/DubboAutoConfiguration.java b/dubbo-spring-boot-autoconfigure/src/main/java/com/alibaba/boot/dubbo/autoconfigure/DubboAutoConfiguration.java
index 89dbefb..1add0c1 100644
--- a/dubbo-spring-boot-autoconfigure/src/main/java/com/alibaba/boot/dubbo/autoconfigure/DubboAutoConfiguration.java
+++ b/dubbo-spring-boot-autoconfigure/src/main/java/com/alibaba/boot/dubbo/autoconfigure/DubboAutoConfiguration.java
@@ -91,7 +91,7 @@
     @ConditionalOnProperty(name = BASE_PACKAGES_PROPERTY_NAME)
     @Autowired
     @Bean
-    public ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor(Environment environment) {
+    public static ServiceAnnotationBeanPostProcessor serviceAnnotationBeanPostProcessor(Environment environment) {
         RelaxedPropertyResolver resolver = new RelaxedPropertyResolver(environment);
         Set<String> packagesToScan = resolver.getProperty(BASE_PACKAGES_PROPERTY_NAME, Set.class, emptySet());
         return new ServiceAnnotationBeanPostProcessor(packagesToScan);
