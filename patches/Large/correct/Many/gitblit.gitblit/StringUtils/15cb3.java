diff --git a/src/main/java/com/gitblit/utils/StringUtils.java b/src/main/java/com/gitblit/utils/StringUtils.java
index 86823db..cff3577 100644
--- a/src/main/java/com/gitblit/utils/StringUtils.java
+++ b/src/main/java/com/gitblit/utils/StringUtils.java
@@ -331,7 +331,7 @@
 		String fp = fullPath.replace('\\', '/').toLowerCase();
 		if (fp.startsWith(bp)) {
 			String relativePath = fullPath.substring(basePath.length()).replace('\\', '/');
-			if (relativePath.charAt(0) == '/') {
+			if (relativePath.length() > 0 && relativePath.charAt(0) == '/') {
 				relativePath = relativePath.substring(1);
 			}
 			return relativePath;
