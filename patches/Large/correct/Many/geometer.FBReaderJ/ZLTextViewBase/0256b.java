diff --git a/src/org/geometerplus/zlibrary/text/view/ZLTextViewBase.java b/src/org/geometerplus/zlibrary/text/view/ZLTextViewBase.java
index 549d02d..51c3712 100644
--- a/src/org/geometerplus/zlibrary/text/view/ZLTextViewBase.java
+++ b/src/org/geometerplus/zlibrary/text/view/ZLTextViewBase.java
@@ -212,7 +212,8 @@
 	}
 
 	final int getElementHeight(ZLTextElement element) {
-		if (element instanceof ZLTextWord) {
+		if (element instanceof ZLTextWord ||
+			element instanceof ZLTextFixedHSpaceElement) {
 			return getWordHeight();
 		} else if (element instanceof ZLTextImageElement) {
 			final ZLTextImageElement imageElement = (ZLTextImageElement)element;
