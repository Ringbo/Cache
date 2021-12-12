diff --git a/hutool-core/src/main/java/cn/hutool/core/util/StrUtil.java b/hutool-core/src/main/java/cn/hutool/core/util/StrUtil.java
index 3525e57..cbc200b 100644
--- a/hutool-core/src/main/java/cn/hutool/core/util/StrUtil.java
+++ b/hutool-core/src/main/java/cn/hutool/core/util/StrUtil.java
@@ -3180,7 +3180,7 @@
 	 * @since 4.0.3
 	 */
 	public static String replaceIgnoreCase(CharSequence str, CharSequence searchStr, CharSequence replacement) {
-		return replace(searchStr, 0, searchStr, replacement, true);
+		return replace(str, 0, searchStr, replacement, true);
 	}
 
 	/**
@@ -3207,7 +3207,7 @@
 	 * @since 4.0.3
 	 */
 	public static String replace(CharSequence str, CharSequence searchStr, CharSequence replacement, boolean ignoreCase) {
-		return replace(searchStr, 0, searchStr, replacement, ignoreCase);
+		return replace(str, 0, searchStr, replacement, ignoreCase);
 	}
 
 	/**
