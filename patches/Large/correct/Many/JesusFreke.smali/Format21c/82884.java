diff --git a/src/main/java/org/JesusFreke/dexlib/code/Format/Format21c.java b/src/main/java/org/JesusFreke/dexlib/code/Format/Format21c.java
index 10c7eed..37925c5 100644
--- a/src/main/java/org/JesusFreke/dexlib/code/Format/Format21c.java
+++ b/src/main/java/org/JesusFreke/dexlib/code/Format/Format21c.java
@@ -49,7 +49,7 @@
 
         checkOpcodeFormat(op);
 
-        if (regA >= 2<<8) {
+        if (regA >= 1<<8) {
             throw new RuntimeException("The register number must be less than v256");
         }
 
