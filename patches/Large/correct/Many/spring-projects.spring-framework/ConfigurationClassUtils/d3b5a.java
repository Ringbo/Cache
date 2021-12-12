diff --git a/spring-context/src/main/java/org/springframework/context/annotation/ConfigurationClassUtils.java b/spring-context/src/main/java/org/springframework/context/annotation/ConfigurationClassUtils.java
index e2d4e7c..ca56adf 100644
--- a/spring-context/src/main/java/org/springframework/context/annotation/ConfigurationClassUtils.java
+++ b/spring-context/src/main/java/org/springframework/context/annotation/ConfigurationClassUtils.java
@@ -175,7 +175,7 @@
 		}
 		catch (Throwable ex) {
 			if (logger.isDebugEnabled()) {
-				logger.debug("Failed to introspect @Bean methods on class [" + metadata.getClass() + "]: " + ex);
+				logger.debug("Failed to introspect @Bean methods on class [" + metadata.getClassName() + "]: " + ex);
 			}
 			return false;
 		}
