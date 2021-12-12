diff --git a/dex-translator/src/test/java/com/googlecode/dex2jar/test/TestUtils.java b/dex-translator/src/test/java/com/googlecode/dex2jar/test/TestUtils.java
index 01916af..9d57241 100644
--- a/dex-translator/src/test/java/com/googlecode/dex2jar/test/TestUtils.java
+++ b/dex-translator/src/test/java/com/googlecode/dex2jar/test/TestUtils.java
@@ -335,7 +335,7 @@
         CfOptions cfOptions = new CfOptions();
         cfOptions.strictNameCheck = false;
         DexOptions dexOptions = new DexOptions();
-        if (fileNode.dexVersion >= DexConstants.DEX_037) {
+        if (fileNode != null && fileNode.dexVersion >= DexConstants.DEX_037) {
             dexOptions.minSdkVersion = 26;
         }
 
