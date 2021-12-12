diff --git a/src/org/geometerplus/zlibrary/core/language/ZLLanguageUtil.java b/src/org/geometerplus/zlibrary/core/language/ZLLanguageUtil.java
index 5c2600c..64e63fc 100644
--- a/src/org/geometerplus/zlibrary/core/language/ZLLanguageUtil.java
+++ b/src/org/geometerplus/zlibrary/core/language/ZLLanguageUtil.java
@@ -45,10 +45,10 @@
 				return 0;
 			}
 			if (MULTI_LANGUAGE_CODE.equals(code0)) {
-				return -1;
+				return 1;
 			}
 			if (MULTI_LANGUAGE_CODE.equals(code1)) {
-				return 1;
+				return -1;
 			}
 			if (OTHER_LANGUAGE_CODE.equals(code0)) {
 				return 1;
