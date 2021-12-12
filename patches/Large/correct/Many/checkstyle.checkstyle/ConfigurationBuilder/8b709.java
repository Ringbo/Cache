diff --git a/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java b/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
index a7892a9..a194c0d 100644
--- a/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
+++ b/src/it/java/com/google/checkstyle/test/base/ConfigurationBuilder.java
@@ -31,8 +31,7 @@
 
 	private URL url;
 
-	public ConfigurationBuilder(File aROOT)
-			throws CheckstyleException {
+	public ConfigurationBuilder(File aROOT) {
 		root = aROOT;
 		configuration = getConfigurationFromXML(XML_NAME, System.getProperties());
 		listFiles(files, root, "java");
