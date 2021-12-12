diff --git a/config/src/main/java/org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.java b/config/src/main/java/org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.java
index c48803c..f3caec0 100644
--- a/config/src/main/java/org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.java
+++ b/config/src/main/java/org/springframework/security/config/annotation/web/configuration/WebSecurityConfiguration.java
@@ -160,7 +160,7 @@
 	}
 
 	@Bean
-	public AutowiredWebSecurityConfigurersIgnoreParents autowiredWebSecurityConfigurersIgnoreParents(
+	public static AutowiredWebSecurityConfigurersIgnoreParents autowiredWebSecurityConfigurersIgnoreParents(
 			ConfigurableListableBeanFactory beanFactory) {
 		return new AutowiredWebSecurityConfigurersIgnoreParents(beanFactory);
 	}
