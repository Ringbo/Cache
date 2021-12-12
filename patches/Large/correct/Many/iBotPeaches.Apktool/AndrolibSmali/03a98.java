diff --git a/src/brut/androlib/AndrolibSmali.java b/src/brut/androlib/AndrolibSmali.java
index 736cdf9..836f1c9 100644
--- a/src/brut/androlib/AndrolibSmali.java
+++ b/src/brut/androlib/AndrolibSmali.java
@@ -26,7 +26,7 @@
 /**
  * @author Ryszard Wiśniewski <brut.alll@gmail.com>
  */
-class AndrolibSmali {
+public class AndrolibSmali {
     public void baksmali(File apkFile, File dir) throws AndrolibException {
         baksmali(apkFile.getAbsolutePath(), dir.getAbsolutePath());
     }
@@ -45,6 +45,6 @@
     }
 
     public void smali(String dir, String dexFile) throws AndrolibException {
-        main.main(new String[]{"smali", dir, "-o", dexFile});
+        main.main(new String[]{dir, "-o", dexFile});
     }
 }
