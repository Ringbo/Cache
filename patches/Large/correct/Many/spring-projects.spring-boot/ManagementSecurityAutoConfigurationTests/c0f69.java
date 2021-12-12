diff --git a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementSecurityAutoConfigurationTests.java b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementSecurityAutoConfigurationTests.java
index 9aa403b..5874b0a 100644
--- a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementSecurityAutoConfigurationTests.java
+++ b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementSecurityAutoConfigurationTests.java
@@ -74,7 +74,7 @@
 		this.context.refresh();
 		assertNotNull(this.context.getBean(AuthenticationManagerBuilder.class));
 		// 6 for static resources, one for management endpoints and one for the rest
-		assertEquals(9, this.context.getBean(FilterChainProxy.class).getFilterChains()
+		assertEquals(8, this.context.getBean(FilterChainProxy.class).getFilterChains()
 				.size());
 	}
 
@@ -144,7 +144,7 @@
 		this.context.refresh();
 		// Just the management endpoints (one filter) and ignores now plus the backup
 		// filter on app endpoints
-		assertEquals(9, this.context.getBean(FilterChainProxy.class).getFilterChains()
+		assertEquals(8, this.context.getBean(FilterChainProxy.class).getFilterChains()
 				.size());
 	}
 
