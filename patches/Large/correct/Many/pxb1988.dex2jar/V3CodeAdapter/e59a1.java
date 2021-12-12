diff --git a/src/main/java/pxb/android/dex2jar/v3/V3CodeAdapter.java b/src/main/java/pxb/android/dex2jar/v3/V3CodeAdapter.java
index 2a7780b..f7dca84 100644
--- a/src/main/java/pxb/android/dex2jar/v3/V3CodeAdapter.java
+++ b/src/main/java/pxb/android/dex2jar/v3/V3CodeAdapter.java
@@ -1069,7 +1069,7 @@
 
 	private void checkResult() {
 		if (typeInStack != null) {
-			if (Type.LONG_TYPE.equals(typeInStack)) {
+			if (Type.LONG_TYPE.equals(typeInStack) || Type.DOUBLE_TYPE.equals(typeInStack)) {
 				mv.visitInsn(POP2);
 			} else {
 				mv.visitInsn(POP);
