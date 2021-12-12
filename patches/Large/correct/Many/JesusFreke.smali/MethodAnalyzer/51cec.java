diff --git a/dexlib/src/main/java/org/jf/dexlib/Code/Analysis/MethodAnalyzer.java b/dexlib/src/main/java/org/jf/dexlib/Code/Analysis/MethodAnalyzer.java
index 2b8d0ad..cede191 100644
--- a/dexlib/src/main/java/org/jf/dexlib/Code/Analysis/MethodAnalyzer.java
+++ b/dexlib/src/main/java/org/jf/dexlib/Code/Analysis/MethodAnalyzer.java
@@ -1717,6 +1717,7 @@
         if (sourceRegisterType.category == RegisterType.Category.Unknown) {
             return false;
         }
+        //TODO: ensure sourceRegisterType is a Reference type?
 
         RegisterType arrayRegisterType = analyzedInstruction.getPreInstructionRegisterType(instruction.getRegisterB());
         assert arrayRegisterType != null;
@@ -1972,7 +1973,7 @@
         if (sourceRegisterType.category == RegisterType.Category.Unknown) {
             return false;
         }
-        checkRegister(objectRegisterType, ReferenceCategories);
+        checkRegister(sourceRegisterType, ReferenceCategories);
 
         //TODO: check access
         //TODO: allow an uninitialized "this" reference, if the current method is an <init> method
