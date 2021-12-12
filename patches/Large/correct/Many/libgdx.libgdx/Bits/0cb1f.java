diff --git a/gdx/src/com/badlogic/gdx/utils/Bits.java b/gdx/src/com/badlogic/gdx/utils/Bits.java
index a15bfc4..2f53487 100755
--- a/gdx/src/com/badlogic/gdx/utils/Bits.java
+++ b/gdx/src/com/badlogic/gdx/utils/Bits.java
@@ -39,7 +39,7 @@
 	}
 	
 	private void checkCapacity(int len) {
-		if(len> bits.length) {
+		if(len>=bits.length) {
 			long[] newBits = new long[len+1];
 			System.arraycopy(bits, 0, newBits, 0, bits.length);
 			bits = newBits;
