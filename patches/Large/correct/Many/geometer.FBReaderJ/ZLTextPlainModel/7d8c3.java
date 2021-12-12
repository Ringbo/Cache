diff --git a/src/org/geometerplus/zlibrary/text/model/ZLTextPlainModel.java b/src/org/geometerplus/zlibrary/text/model/ZLTextPlainModel.java
index ffd55ff..0d2fc7e 100644
--- a/src/org/geometerplus/zlibrary/text/model/ZLTextPlainModel.java
+++ b/src/org/geometerplus/zlibrary/text/model/ZLTextPlainModel.java
@@ -139,7 +139,7 @@
 		public void next() {
 			int dataOffset = myDataOffset;
 			char[] data = myStorage.block(myDataIndex);
-			if (dataOffset == data.length) {
+			if (dataOffset >= data.length) {
 				data = myStorage.block(++myDataIndex);
 				dataOffset = 0;
 			}
