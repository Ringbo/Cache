diff --git a/hutool-core/src/main/java/cn/hutool/core/util/ZipUtil.java b/hutool-core/src/main/java/cn/hutool/core/util/ZipUtil.java
index 592ef60..fddab3d 100644
--- a/hutool-core/src/main/java/cn/hutool/core/util/ZipUtil.java
+++ b/hutool-core/src/main/java/cn/hutool/core/util/ZipUtil.java
@@ -81,7 +81,7 @@
 	 * @throws UtilException IO异常
 	 */
 	public static File zip(File srcFile, Charset charset) throws UtilException {
-		File zipFile = FileUtil.file(srcFile.getParentFile(), FileUtil.mainName(srcFile) + ".zip");
+		final File zipFile = FileUtil.file(srcFile.getParentFile(), FileUtil.mainName(srcFile) + ".zip");
 		zip(zipFile, charset, false, srcFile);
 		return zipFile;
 	}
