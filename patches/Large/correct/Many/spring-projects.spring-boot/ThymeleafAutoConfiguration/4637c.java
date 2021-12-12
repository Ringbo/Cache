diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/thymeleaf/ThymeleafAutoConfiguration.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/thymeleaf/ThymeleafAutoConfiguration.java
index bf829a6..fbaa5c6 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/thymeleaf/ThymeleafAutoConfiguration.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/thymeleaf/ThymeleafAutoConfiguration.java
@@ -182,9 +182,9 @@
 					"excludedViewNames", String[].class));
 			resolver.setViewNames(this.environment.getProperty("viewNames",
 					String[].class));
-			// Needs to come before any fallback resolver (e.g. a
-			// InternalResourceViewResolver)
-			resolver.setOrder(Ordered.LOWEST_PRECEDENCE - 20);
+			// This resolver acts as a fallback resolver (e.g. like a
+			// InternalResourceViewResolver) so it needs to have low precedence
+			resolver.setOrder(Ordered.LOWEST_PRECEDENCE - 5);
 			return resolver;
 		}
 
