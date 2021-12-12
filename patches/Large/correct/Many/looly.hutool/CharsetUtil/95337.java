diff --git a/src/main/java/com/xiaoleilu/hutool/util/CharsetUtil.java b/src/main/java/com/xiaoleilu/hutool/util/CharsetUtil.java
index 1b82cf9..c7b9679 100644
--- a/src/main/java/com/xiaoleilu/hutool/util/CharsetUtil.java
+++ b/src/main/java/com/xiaoleilu/hutool/util/CharsetUtil.java
@@ -61,7 +61,7 @@
 		}
 		
 		if(null == destCharset) {
-			srcCharset = StandardCharsets.UTF_8;
+			destCharset = StandardCharsets.UTF_8;
 		}
 		
 		if (StrUtil.isBlank(source) || srcCharset.equals(destCharset)) {
