diff --git a/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/util/FileTestUtil.java b/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/util/FileTestUtil.java
index 3870bcf..e7c247f 100644
--- a/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/util/FileTestUtil.java
+++ b/modules/sdk/project-templates/src/test/java/com/liferay/project/templates/util/FileTestUtil.java
@@ -75,7 +75,7 @@
 	}
 
 	public static String getExtension(String fileName) {
-		int pos = fileName.indexOf('.');
+		int pos = fileName.lastIndexOf('.');
 
 		if (pos == -1) {
 			return "";
