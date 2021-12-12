diff --git a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementWebSecurityAutoConfigurationTests.java b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementWebSecurityAutoConfigurationTests.java
index d0be9cc..907e1a2 100644
--- a/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementWebSecurityAutoConfigurationTests.java
+++ b/spring-boot-actuator/src/test/java/org/springframework/boot/actuate/autoconfigure/ManagementWebSecurityAutoConfigurationTests.java
@@ -144,7 +144,7 @@
 		EnvironmentTestUtils.addEnvironment(this.context, "security.ignored:none");
 		this.context.refresh();
 		// Just the application and management endpoints now
-		assertEquals(2,
+		assertEquals(3,
 				this.context.getBean(FilterChainProxy.class).getFilterChains().size());
 	}
 
