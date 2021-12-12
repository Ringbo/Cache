diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/AndrolibResources.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/AndrolibResources.java
index 75e73b8..4e8fd10 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/AndrolibResources.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/res/AndrolibResources.java
@@ -627,7 +627,7 @@
             byte[] manifest = createAndroidManifestFileData();
             entry = createAndroidManifestEntry(manifest);
             out.putNextEntry(entry);
-            out.write(data);
+            out.write(manifest);
             out.closeEntry();
 
             zip.close();
