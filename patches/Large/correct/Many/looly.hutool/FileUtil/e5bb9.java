diff --git a/hutool-core/src/main/java/com/xiaoleilu/hutool/io/FileUtil.java b/hutool-core/src/main/java/com/xiaoleilu/hutool/io/FileUtil.java
index 4a763fa..4029435 100644
--- a/hutool-core/src/main/java/com/xiaoleilu/hutool/io/FileUtil.java
+++ b/hutool-core/src/main/java/com/xiaoleilu/hutool/io/FileUtil.java
@@ -796,7 +796,7 @@
 			File srcFile = new File(src, file);
 			File destFile = new File(dest, file);
 			// 递归复制
-			if (src.isDirectory()) {
+			if (srcFile.isDirectory()) {
 				internalCopyDir(srcFile, destFile, isOverride);
 			} else {
 				internalCopyFile(srcFile, destFile, isOverride);
