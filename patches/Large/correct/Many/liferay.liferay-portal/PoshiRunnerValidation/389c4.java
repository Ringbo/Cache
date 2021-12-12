diff --git a/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerValidation.java b/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerValidation.java
index f61cfc0..4b9a747 100644
--- a/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerValidation.java
+++ b/modules/test/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerValidation.java
@@ -227,7 +227,7 @@
 			PoshiRunnerGetterUtil.getAllChildElements(element, "return");
 
 		if (returns == null) {
-			if (returnElements.isEmpty()) {
+			if (!returnElements.isEmpty()) {
 				_exceptions.add(
 					new Exception(
 						element.attributeValue("name") +
