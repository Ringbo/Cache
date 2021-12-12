diff --git a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java
index 7811c23..91d6ce2 100644
--- a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java
+++ b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerGetterUtil.java
@@ -157,7 +157,7 @@
 	public static String getClassTypeFromFileExtension(String fileExtension) {
 		String classType = fileExtension;
 
-		if (fileExtension.equals("testcase")) {
+		if (fileExtension.equals("testcase") || fileExtension.equals("prose")) {
 			classType = "test-case";
 		}
 
