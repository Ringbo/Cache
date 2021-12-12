diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPIndentationCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPIndentationCheck.java
index e450b5c..b2c6ab4 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPIndentationCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checks/JSPIndentationCheck.java
@@ -598,7 +598,9 @@
 		}
 
 		public boolean isOpenTag() {
-			if (!_javaSource && (_lineTabLevel == 1)) {
+			if (!_javaSource && (_lineTabLevel == 1) &&
+				_line.matches("^\\s*<.*")) {
+
 				return true;
 			}
 
