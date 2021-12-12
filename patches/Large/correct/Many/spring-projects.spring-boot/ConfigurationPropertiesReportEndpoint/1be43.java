diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpoint.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpoint.java
index 0a53cb1..29c98bb 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpoint.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/endpoint/ConfigurationPropertiesReportEndpoint.java
@@ -192,7 +192,7 @@
 	 */
 	private void applyCglibFilters(ObjectMapper mapper) {
 		mapper.setAnnotationIntrospector(new CglibAnnotationIntrospector());
-		mapper.setFilters(new SimpleFilterProvider().addFilter(CGLIB_FILTER_ID,
+		mapper.setFilterProvider(new SimpleFilterProvider().addFilter(CGLIB_FILTER_ID,
 				new CglibBeanPropertyFilter()));
 	}
 
