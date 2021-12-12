diff --git a/src/org/geometerplus/fbreader/fbreader/FBView.java b/src/org/geometerplus/fbreader/fbreader/FBView.java
index fb9f132..edf0966 100644
--- a/src/org/geometerplus/fbreader/fbreader/FBView.java
+++ b/src/org/geometerplus/fbreader/fbreader/FBView.java
@@ -502,12 +502,12 @@
 			return myReader.FooterHeightOption.getValue();
 		}
 
-		public void resetTOCMarks() {
+		public synchronized void resetTOCMarks() {
 			myTOCMarks = null;
 		}
 
 		private final int MAX_TOC_MARKS_NUMBER = 100;
-		private void updateTOCMarks(BookModel model) {
+		private synchronized void updateTOCMarks(BookModel model) {
 			myTOCMarks = new ArrayList<TOCTree>();
 			TOCTree toc = model.TOCTree;
 			if (toc == null) {
@@ -535,7 +535,7 @@
 			}
 		}
 
-		public void paint(ZLPaintContext context) {
+		public synchronized void paint(ZLPaintContext context) {
 			final FBReaderApp reader = myReader;
 			if (reader == null) {
 				return;
