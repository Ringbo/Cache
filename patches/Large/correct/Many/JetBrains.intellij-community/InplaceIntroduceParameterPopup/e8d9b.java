diff --git a/java/java-impl/src/com/intellij/refactoring/introduceParameter/InplaceIntroduceParameterPopup.java b/java/java-impl/src/com/intellij/refactoring/introduceParameter/InplaceIntroduceParameterPopup.java
index 5788527..aa4065d 100644
--- a/java/java-impl/src/com/intellij/refactoring/introduceParameter/InplaceIntroduceParameterPopup.java
+++ b/java/java-impl/src/com/intellij/refactoring/introduceParameter/InplaceIntroduceParameterPopup.java
@@ -337,7 +337,7 @@
       parametersToRemove.forEach(new TIntProcedure() {
         @Override
         public boolean execute(int value) {
-          if (myParameterIndex > value) {
+          if (myParameterIndex >= value) {
             myParameterIndex--;
           }
           return true;
