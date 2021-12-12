diff --git a/src/share/classes/com/sun/btrace/compiler/Compiler.java b/src/share/classes/com/sun/btrace/compiler/Compiler.java
index f2c91cf..eac4581 100644
--- a/src/share/classes/com/sun/btrace/compiler/Compiler.java
+++ b/src/share/classes/com/sun/btrace/compiler/Compiler.java
@@ -155,7 +155,7 @@
             usage();
         }
 
-        if (generatePack && packExtension != null) {
+        if (!generatePack && packExtension != null) {
             usage("Can not specify pack extension if not using packs (-nopack)");
         }
 
