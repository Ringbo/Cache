diff --git a/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/Instruction21tMethodItem.java b/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/Instruction21tMethodItem.java
index 19f473b..9d437d7 100644
--- a/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/Instruction21tMethodItem.java
+++ b/baksmali/src/main/java/org/jf/baksmali/Adaptors/Format/Instruction21tMethodItem.java
@@ -36,7 +36,7 @@
     }
 
     public int getRegister() {
-        return instruction.getOffset();
+        return instruction.getRegister();
     }
 
     public String getTarget() {
