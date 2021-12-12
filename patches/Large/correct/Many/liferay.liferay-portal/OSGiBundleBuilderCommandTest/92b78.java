diff --git a/modules/util/osgi-bundle-builder/src/test/java/com/liferay/osgi/bundle/builder/commands/OSGiBundleBuilderCommandTest.java b/modules/util/osgi-bundle-builder/src/test/java/com/liferay/osgi/bundle/builder/commands/OSGiBundleBuilderCommandTest.java
index 7139460..af48be6 100644
--- a/modules/util/osgi-bundle-builder/src/test/java/com/liferay/osgi/bundle/builder/commands/OSGiBundleBuilderCommandTest.java
+++ b/modules/util/osgi-bundle-builder/src/test/java/com/liferay/osgi/bundle/builder/commands/OSGiBundleBuilderCommandTest.java
@@ -156,7 +156,7 @@
 	}
 
 	private void _compareJarFiles(final Path expected, final Path actual)
-		throws Exception {
+		throws IOException {
 
 		Files.walkFileTree(
 			expected,
@@ -164,8 +164,7 @@
 
 				@Override
 				public FileVisitResult preVisitDirectory(
-						Path dir, BasicFileAttributes attrs)
-					throws IOException {
+					Path dir, BasicFileAttributes attrs) {
 
 					Path fileName = dir.getFileName();
 
@@ -178,8 +177,7 @@
 
 				@Override
 				public FileVisitResult visitFile(
-						Path file, BasicFileAttributes attrs)
-					throws IOException {
+					Path file, BasicFileAttributes attrs) {
 
 					Path relativize = expected.relativize(file);
 
@@ -194,7 +192,7 @@
 	}
 
 	private void _compareManifestFiles(File expected, File actual)
-		throws Exception {
+		throws IOException {
 
 		Manifest expectedManifest = new Manifest(new FileInputStream(expected));
 
