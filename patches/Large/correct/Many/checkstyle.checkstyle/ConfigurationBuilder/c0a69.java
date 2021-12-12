diff --git a/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java b/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
index e2b68fd..3d7c4b5 100644
--- a/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
+++ b/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
@@ -37,7 +37,7 @@
 		listFiles(files, ROOT, "java");
 	}
 
-	private Configuration getConfigurationFromXML(String aConfigName,
+	private static Configuration getConfigurationFromXML(String aConfigName,
 			Properties aProps) throws CheckstyleException {
 		try {
 			return ConfigurationLoader.loadConfiguration(aConfigName,
