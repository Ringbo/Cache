diff --git a/src/main/java/com/xiaoleilu/hutool/util/FileUtil.java b/src/main/java/com/xiaoleilu/hutool/util/FileUtil.java
index 715afa8..490aa31 100644
--- a/src/main/java/com/xiaoleilu/hutool/util/FileUtil.java
+++ b/src/main/java/com/xiaoleilu/hutool/util/FileUtil.java
@@ -739,7 +739,7 @@
 	 * @return 如果为文件true
 	 */
 	public static boolean isFile(String path) {
-		return (path == null) ? false : file(path).isDirectory();
+		return (path == null) ? false : file(path).isFile();
 	}
 
 	/**
@@ -749,7 +749,7 @@
 	 * @return 如果为文件true
 	 */
 	public static boolean isFile(File file) {
-		return (file == null) ? false : file.isDirectory();
+		return (file == null) ? false : file.isFile();
 	}
 
 	/**
