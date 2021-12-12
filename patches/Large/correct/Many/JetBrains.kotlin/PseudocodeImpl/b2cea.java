diff --git a/compiler/frontend/src/org/jetbrains/jet/lang/cfg/pseudocode/PseudocodeImpl.java b/compiler/frontend/src/org/jetbrains/jet/lang/cfg/pseudocode/PseudocodeImpl.java
index 74beb12..1106d56 100644
--- a/compiler/frontend/src/org/jetbrains/jet/lang/cfg/pseudocode/PseudocodeImpl.java
+++ b/compiler/frontend/src/org/jetbrains/jet/lang/cfg/pseudocode/PseudocodeImpl.java
@@ -115,7 +115,7 @@
 
     @NotNull
     private static Set<LocalDeclarationInstruction> getLocalDeclarations(@NotNull Pseudocode pseudocode) {
-        Set<LocalDeclarationInstruction> localDeclarations = Sets.newHashSet();
+        Set<LocalDeclarationInstruction> localDeclarations = Sets.newLinkedHashSet();
         for (Instruction instruction : pseudocode.getInstructions()) {
             if (instruction instanceof LocalDeclarationInstruction) {
                 localDeclarations.add((LocalDeclarationInstruction) instruction);
