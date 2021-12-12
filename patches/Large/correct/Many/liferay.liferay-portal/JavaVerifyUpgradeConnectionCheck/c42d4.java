diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaVerifyUpgradeConnectionCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaVerifyUpgradeConnectionCheck.java
index 43b7231..d71511f 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaVerifyUpgradeConnectionCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JavaVerifyUpgradeConnectionCheck.java
@@ -30,7 +30,9 @@
 	protected String doProcess(
 		String fileName, String absolutePath, String content) {
 
-		if (fileName.endsWith("Test.java") ||
+		if (absolutePath.contains("/test/") ||
+			fileName.endsWith("DBUpgrader.java") ||
+			fileName.endsWith("Test.java") ||
 			fileName.endsWith("UpgradeTableListener.java") ||
 			content.contains("Callable<Void>")) {
 
