diff --git a/runtime/Java/src/org/antlr/v4/runtime/UnbufferedCharStream.java b/runtime/Java/src/org/antlr/v4/runtime/UnbufferedCharStream.java
index 3d233b1..5eee309 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/UnbufferedCharStream.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/UnbufferedCharStream.java
@@ -169,7 +169,7 @@
 	 */
 	protected int fill(int n) {
 		for (int i=0; i<n; i++) {
-			if (this.n > 0 && data[this.n - 1] == IntStream.EOF) {
+			if (this.n > 0 && data[this.n - 1] == (char)IntStream.EOF) {
 				return i;
 			}
 
@@ -206,7 +206,7 @@
         sync(i);
         int index = p + i - 1;
         if ( index < 0 ) throw new IndexOutOfBoundsException();
-		if ( index > n ) return IntStream.EOF;
+		if ( index >= n ) return IntStream.EOF;
         char c = data[index];
         if ( c==(char)IntStream.EOF ) return IntStream.EOF;
         return c;
@@ -315,7 +315,7 @@
 
 		if (interval.a < bufferStartIndex || interval.b >= bufferStartIndex + n) {
 			throw new UnsupportedOperationException("interval "+interval+" outside buffer: "+
-			                    bufferStartIndex+".."+(bufferStartIndex+n));
+			                    bufferStartIndex+".."+(bufferStartIndex+n-1));
 		}
 		// convert from absolute to local index
 		int i = interval.a - bufferStartIndex;
