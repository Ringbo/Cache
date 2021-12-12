diff --git a/src/main/java/com/xiaoleilu/hutool/ZipUtil.java b/src/main/java/com/xiaoleilu/hutool/ZipUtil.java
index 778d87c..0482a33 100644
--- a/src/main/java/com/xiaoleilu/hutool/ZipUtil.java
+++ b/src/main/java/com/xiaoleilu/hutool/ZipUtil.java
@@ -42,20 +42,20 @@
 	 */
 	public static File zip(File srcFile) throws IOException{
 		File zipFile = FileUtil.file(srcFile.getParentFile(), FileUtil.mainName(srcFile) + ".zip");
-		zip(srcFile, zipFile, true);
+		zip(srcFile, zipFile, false);
 		return zipFile;
 	}
 	
 	/**
 	 * 对文件或文件目录进行压缩<br>
-	 * 包含被打包目录
+	 * 不包含被打包目录
 	 * @param srcPath 要压缩的源文件路径。如果压缩一个文件，则为该文件的全路径；如果压缩一个目录，则为该目录的顶层目录路径
 	 * @param zipPath 压缩文件保存的路径，包括文件名。注意：zipPath不能是srcPath路径下的子文件夹
 	 * @return 压缩好的Zip文件
 	 * @throws IOException 
 	 */
 	public static File zip(String srcPath, String zipPath) throws IOException {
-		return zip(srcPath, zipPath, true);
+		return zip(srcPath, zipPath, false);
 	}
 	
 	/**
