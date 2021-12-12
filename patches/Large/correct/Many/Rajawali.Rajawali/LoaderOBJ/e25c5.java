diff --git a/src/rajawali/parser/LoaderOBJ.java b/src/rajawali/parser/LoaderOBJ.java
index aa6411f..fff9b94 100644
--- a/src/rajawali/parser/LoaderOBJ.java
+++ b/src/rajawali/parser/LoaderOBJ.java
@@ -601,7 +601,7 @@
 							fis = new FileInputStream(filePath);
 							mat.addTexture(new Texture(getOnlyFileName(matDef.diffuseTexture), new Etc1Texture(getOnlyFileName(matDef.diffuseTexture)+"etc1", fis, null)));
 						} catch (FileNotFoundException e) {
-							RajLog.e("LoaderOBJ", "File decode error", e);
+							RajLog.e("LoaderOBJ", "File decode error");
 						} finally {
 							try {
 								fis.close();
