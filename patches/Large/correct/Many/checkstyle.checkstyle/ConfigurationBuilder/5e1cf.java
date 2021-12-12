diff --git a/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java b/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
index a36aee0..3f264de 100644
--- a/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
+++ b/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
@@ -32,14 +32,14 @@
 	final Pattern warnPattern = Utils.createPattern(".*[ ]*//[ ]*warn[ ]*|/[*]warn[*]/");
 
 	public ConfigurationBuilder(File aROOT)
-			throws CheckstyleException, IOException {
+			throws CheckstyleException {
 		root = aROOT;
 		config = getConfigurationFromXML(XML_NAME, System.getProperties());
 		listFiles(files, root, "java");
 	}
 
 	private static Configuration getConfigurationFromXML(String aConfigName,
-			Properties aProps) throws CheckstyleException {
+			Properties aProps) {
 		try {
 			return ConfigurationLoader.loadConfiguration(aConfigName,
 					new PropertiesExpander(aProps));
