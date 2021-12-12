diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/env/EnvironmentEndpoint.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/env/EnvironmentEndpoint.java
index 0c95198..42b7a65 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/env/EnvironmentEndpoint.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/env/EnvironmentEndpoint.java
@@ -167,7 +167,7 @@
 
 		private final Sanitizer sanitizer;
 
-		public PropertySourcesPlaceholdersSanitizingResolver(
+		PropertySourcesPlaceholdersSanitizingResolver(
 				Iterable<PropertySource<?>> sources, Sanitizer sanitizer) {
 			super(sources, new PropertyPlaceholderHelper(
 					SystemPropertyUtils.PLACEHOLDER_PREFIX,
