diff --git a/hutool-core/src/main/java/cn/hutool/core/io/FileUtil.java b/hutool-core/src/main/java/cn/hutool/core/io/FileUtil.java
index 0ba3052..6a094e5 100644
--- a/hutool-core/src/main/java/cn/hutool/core/io/FileUtil.java
+++ b/hutool-core/src/main/java/cn/hutool/core/io/FileUtil.java
@@ -558,7 +558,7 @@
 	 * @return 是否晚于给定时间
 	 */
 	public static boolean newerThan(File file, File reference) {
-		if (null == file || false == reference.exists()) {
+		if (null == reference || false == reference.exists()) {
 			return true;// 文件一定比一个不存在的文件新
 		}
 		return newerThan(file, reference.lastModified());
