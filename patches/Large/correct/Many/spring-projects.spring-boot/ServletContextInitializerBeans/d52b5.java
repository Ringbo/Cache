diff --git a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/servlet/ServletContextInitializerBeans.java b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/servlet/ServletContextInitializerBeans.java
index c136525..fd070da 100644
--- a/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/servlet/ServletContextInitializerBeans.java
+++ b/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/servlet/ServletContextInitializerBeans.java
@@ -256,8 +256,8 @@
 			filterRegistrations.addAll(
 					initializers.getOrDefault(Filter.class, Collections.emptyList()));
 			String filtersInfo = filterRegistrations.stream()
-					.map(FilterRegistrationBean.class::cast)
-					.map(FilterRegistrationBean::toString)
+					.map(AbstractFilterRegistrationBean.class::cast)
+					.map(AbstractFilterRegistrationBean::toString)
 					.collect(Collectors.joining(", "));
 			ServletContextInitializerBeans.logger
 					.debug("Mapping filters: " + filtersInfo);
