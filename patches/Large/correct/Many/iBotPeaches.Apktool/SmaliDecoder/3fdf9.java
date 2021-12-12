diff --git a/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliDecoder.java b/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliDecoder.java
index 134fb88..98ed63e 100644
--- a/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliDecoder.java
+++ b/brut.apktool/apktool-lib/src/main/java/brut/androlib/src/SmaliDecoder.java
@@ -49,7 +49,7 @@
             baksmali.disassembleDexFile(mApkFile.getAbsolutePath(),
                 new DexFile(mApkFile), false, mOutDir.getAbsolutePath(), null,
                 null, null, false, true, true, mBakDeb, false, false, 
-                mDebug ? main.DIFFPRE: 0, false, false, null);
+                mDebug ? main.DIFFPRE: 0, false, false, null, false);
         } catch (IOException ex) {
             throw new AndrolibException(ex);
         }
