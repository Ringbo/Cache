diff --git a/jodd-core/src/main/java/jodd/io/findfile/FindFile.java b/jodd-core/src/main/java/jodd/io/findfile/FindFile.java
index a04fb14..9d88879 100644
--- a/jodd-core/src/main/java/jodd/io/findfile/FindFile.java
+++ b/jodd-core/src/main/java/jodd/io/findfile/FindFile.java
@@ -250,7 +250,7 @@
 	 * Specifies the search path. Throws an exception if URL is invalid.
 	 */
 	public FindFile searchPath(final URL searchPath) {
-		File file = FileUtil.toFile(searchPath);
+		File file = FileUtil.toContainerFile(searchPath);
 		if (file == null) {
 			throw new FindFileException("URL error: " + searchPath);
 		}
