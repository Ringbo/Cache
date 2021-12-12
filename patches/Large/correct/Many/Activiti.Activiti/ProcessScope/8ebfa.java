diff --git a/modules/activiti-spring/src/main/java/org/activiti/spring/components/scope/ProcessScope.java b/modules/activiti-spring/src/main/java/org/activiti/spring/components/scope/ProcessScope.java
index ebd99bd..00dfa05 100644
--- a/modules/activiti-spring/src/main/java/org/activiti/spring/components/scope/ProcessScope.java
+++ b/modules/activiti-spring/src/main/java/org/activiti/spring/components/scope/ProcessScope.java
@@ -104,7 +104,7 @@
 			}
 			return createDirtyCheckingProxy(name, scopedObject);
 		} catch (Throwable th) {
-			logger.warn("couldn't return value from process scope! {}",ExceptionUtils.getFullStackTrace(th));
+			logger.warn("couldn't return value from process scope! {}", ExceptionUtils.getStackTrace(th));
 		} finally {
 			if (executionEntity != null) {
 				logger.debug("set variable '{}' on executionEntity#{}", name, executionEntity.getId());
