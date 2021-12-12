diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/SourceFormatter.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/SourceFormatter.java
index 8f11d19..7a17a0b 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/SourceFormatter.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/SourceFormatter.java
@@ -696,7 +696,7 @@
 		File baseDir = new File(baseDirAbsolutePath);
 
 		for (int i = 0; i < _SUBREPOSITORY_MAX_DIR_LEVEL; i++) {
-			if (!baseDir.exists()) {
+			if ((baseDir == null) || !baseDir.exists()) {
 				return false;
 			}
 
