diff --git a/src/org/geometerplus/fbreader/bookmodel/BookReader.java b/src/org/geometerplus/fbreader/bookmodel/BookReader.java
index 4264307..b7b986e 100644
--- a/src/org/geometerplus/fbreader/bookmodel/BookReader.java
+++ b/src/org/geometerplus/fbreader/bookmodel/BookReader.java
@@ -228,7 +228,7 @@
 	private int myUnderflowLength;
 
 	public final void addByteData(byte[] data, int start, int length) {
-		if (!myTextParagraphExists || (length == 0)) {
+		if (!myTextParagraphExists || length == 0) {
 			return;
 		}
 		myTextParagraphIsNonEmpty = true;
@@ -241,7 +241,7 @@
 
 		if (myUnderflowLength > 0) {
 			int l = myUnderflowLength;
-			while (length-- > 0) {
+			while (length-- > 0 && l < 4) {
 				myUnderflowByteBuffer[l++] = data[start++];
 				final ByteBuffer ubb = ByteBuffer.wrap(myUnderflowByteBuffer);
 				myByteDecoder.decode(ubb, cb, false);
