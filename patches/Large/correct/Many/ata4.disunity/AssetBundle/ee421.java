diff --git a/src/info/ata4/unity/asset/AssetBundle.java b/src/info/ata4/unity/asset/AssetBundle.java
index ef011cc..01bec78 100644
--- a/src/info/ata4/unity/asset/AssetBundle.java
+++ b/src/info/ata4/unity/asset/AssetBundle.java
@@ -50,7 +50,7 @@
     public static boolean isAssetBundle(File file) {
         try (FileInputStream fis = new FileInputStream(file)) {
             DataInputReader in = new DataInputReader(new DataInputStream(fis));
-            String signature = in.readStringNull(8);
+            String signature = in.readStringFixed(8);
             return signature.equals(SIGNATURE_WEB) || signature.equals(SIGNATURE_RAW);
         } catch (IOException ex) {
             return false;
