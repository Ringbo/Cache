diff --git a/src/main/java/org/JesusFreke/dexlib/code/Format/Format3rc.java b/src/main/java/org/JesusFreke/dexlib/code/Format/Format3rc.java
index b4f64d6..4d92d15 100644
--- a/src/main/java/org/JesusFreke/dexlib/code/Format/Format3rc.java
+++ b/src/main/java/org/JesusFreke/dexlib/code/Format/Format3rc.java
@@ -47,14 +47,14 @@
 
         checkOpcodeFormat(op);
 
-        if (regCount >= 2<<8) {
+        if (regCount >= 1<<8) {
             throw new RuntimeException("regCount must be less than 256");
         }
         if (regCount < 0) {
             throw new RuntimeException("regCount cannot be negative");
         }
 
-        if (startReg >= 2<<16) {
+        if (startReg >= 1<<16) {
             throw new RuntimeException("The beginning register of the range must be less than 65536");
         }
         if (startReg < 0) {
