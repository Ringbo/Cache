diff --git a/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java b/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
index 3597ce3..6696d95 100644
--- a/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
+++ b/portal-impl/src/com/liferay/portal/tools/SourceFormatter.java
@@ -562,7 +562,7 @@
 	private static void _formatJSP() throws IOException {
 		String basedir = "./";
 
-		List<File> list = new ArrayList<File>();
+		List<String> list = new ArrayList<String>();
 
 		DirectoryScanner ds = new DirectoryScanner();
 
@@ -765,7 +765,7 @@
 	private static String[] _getPluginJavaFiles() {
 		String basedir = "./";
 
-		List<File> list = new ArrayList<File>();
+		List<String> list = new ArrayList<String>();
 
 		DirectoryScanner ds = new DirectoryScanner();
 
@@ -801,7 +801,7 @@
 	private static String[] _getPortalJavaFiles() {
 		String basedir = "./";
 
-		List<File> list = new ArrayList<File>();
+		List<String> list = new ArrayList<String>();
 
 		DirectoryScanner ds = new DirectoryScanner();
 
