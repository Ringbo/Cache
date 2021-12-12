diff --git a/src/com/sun/jna/Structure.java b/src/com/sun/jna/Structure.java
index 3dfe9c7..a545847 100644
--- a/src/com/sun/jna/Structure.java
+++ b/src/com/sun/jna/Structure.java
@@ -1303,7 +1303,7 @@
         else if (actualAlignType == ALIGN_GNUC) {
             // NOTE this is published ABI for 32-bit gcc/linux/x86, osx/x86,
             // and osx/ppc.  osx/ppc special-cases the first element
-            if (!isFirstElement || !(Platform.isMac() && Platfomr.isPPC())) {
+            if (!isFirstElement || !(Platform.isMac() && Platform.isPPC())) {
                 alignment = Math.min(MAX_GNUC_ALIGNMENT, alignment);
             }
             if (!isFirstElement && Platform.isAIX() && (type == double.class || type == Double.class)) {
