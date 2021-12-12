diff --git a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/condition/ConditionalOnMissingBeanTests.java b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/condition/ConditionalOnMissingBeanTests.java
index 797bbc4..ef48fa8 100644
--- a/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/condition/ConditionalOnMissingBeanTests.java
+++ b/spring-boot-autoconfigure/src/test/java/org/springframework/boot/autoconfigure/condition/ConditionalOnMissingBeanTests.java
@@ -282,7 +282,7 @@
 				OnBeanInParentsConfiguration.class);
 		child.setParent(this.context);
 		child.refresh();
-		assertThat(child.getBeansOfType(ExampleBean.class)).hasSize(1);
+		assertThat(child.getBeansOfType(ExampleBean.class)).hasSize(2);
 	}
 
 	@Configuration
