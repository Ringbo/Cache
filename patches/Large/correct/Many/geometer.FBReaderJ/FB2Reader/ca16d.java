diff --git a/src/org/fbreader/formats/fb2/FB2Reader.java b/src/org/fbreader/formats/fb2/FB2Reader.java
index 700b917..5c014f4 100644
--- a/src/org/fbreader/formats/fb2/FB2Reader.java
+++ b/src/org/fbreader/formats/fb2/FB2Reader.java
@@ -294,7 +294,7 @@
 			
 			case A:
 				String ref = reference(attributes);
-				if (!ref.equals("")) {
+				if ((ref != null) && !ref.isEmpty()) {
 					if (ref.charAt(0) == '#') {
 						myHyperlinkType = FBTextKind.FOOTNOTE;
 						ref = ref.substring(1);
@@ -323,7 +323,7 @@
 					offset = Short.valueOf(vOffset);
 				} catch (NumberFormatException e) {
 				}
-				if ((imgRef != null) && (imgRef.charAt(0) == '#')) {
+				if ((imgRef != null) && !imgRef.isEmpty() && (imgRef.charAt(0) == '#')) {
 					imgRef = imgRef.substring(1);
 					if (!imgRef.equals(myCoverImageReference) ||
 							myParagraphsBeforeBodyNumber != myModelReader.getModel().getBookModel().getParagraphsNumber()) {
