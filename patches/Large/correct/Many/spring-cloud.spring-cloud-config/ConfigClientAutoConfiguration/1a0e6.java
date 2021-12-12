diff --git a/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigClientAutoConfiguration.java b/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigClientAutoConfiguration.java
index 8ac84b7..73ff3d2 100644
--- a/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigClientAutoConfiguration.java
+++ b/spring-cloud-config-client/src/main/java/org/springframework/cloud/config/client/ConfigClientAutoConfiguration.java
@@ -44,7 +44,7 @@
 		if (context.getParent() != null
 				&& BeanFactoryUtils.beanNamesForTypeIncludingAncestors(
 						context.getParent(), ConfigClientProperties.class).length > 0) {
-			return BeanFactoryUtils.beanOfType(context.getParent(),
+			return BeanFactoryUtils.beanOfTypeIncludingAncestors(context.getParent(),
 					ConfigClientProperties.class);
 		}
 		ConfigClientProperties client = new ConfigClientProperties(environment);
