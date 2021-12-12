diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java
index 3b2e3d0..5fc6d18 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/security/SecurityAutoConfigurationTests.java
@@ -165,7 +165,7 @@
 		EnvironmentTestUtils.addEnvironment(this.context, "security.ignored:none");
 		this.context.refresh();
 		// Just the application endpoints now
-		assertEquals(1,
+		assertEquals(2,
 				this.context.getBean(FilterChainProxy.class).getFilterChains().size());
 	}
 
