diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
index bb8fbf5..1de6227 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/decoder/ARSCDecoder.java
@@ -264,7 +264,7 @@
     private ResConfigFlags readConfigFlags() throws IOException,
             AndrolibException {
         int size = mIn.readInt();
-        int read = 0;
+        int read = 28;
 
         if (size < 28) {
             throw new AndrolibException("Config size < 28");
