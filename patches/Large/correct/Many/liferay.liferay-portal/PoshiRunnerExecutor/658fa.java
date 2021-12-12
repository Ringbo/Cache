diff --git a/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerExecutor.java b/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerExecutor.java
index d7d09eb..8fa5069 100644
--- a/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerExecutor.java
+++ b/modules/test/poshi-runner/src/com/liferay/poshi/runner/PoshiRunnerExecutor.java
@@ -141,7 +141,7 @@
 				}
 				else if ((childElement.attributeValue(
 							"macro-desktop") != null) &&
-						 Validator.isNotNull(PropsValues.MOBILE_DEVICE_TYPE)) {
+						 Validator.isNull(PropsValues.MOBILE_DEVICE_TYPE)) {
 
 					runMacroExecuteElement(childElement, "macro-desktop");
 				}
