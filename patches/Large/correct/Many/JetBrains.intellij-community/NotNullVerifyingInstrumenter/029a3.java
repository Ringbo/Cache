diff --git a/NotNull/src/com/intellij/compiler/notNullVerification/NotNullVerifyingInstrumenter.java b/NotNull/src/com/intellij/compiler/notNullVerification/NotNullVerifyingInstrumenter.java
index 767fd0a..d9fee67 100644
--- a/NotNull/src/com/intellij/compiler/notNullVerification/NotNullVerifyingInstrumenter.java
+++ b/NotNull/src/com/intellij/compiler/notNullVerification/NotNullVerifyingInstrumenter.java
@@ -87,7 +87,7 @@
       }
 
       public void visitCode() {
-        if (myNotNullParams.size() > 0) {
+        if (myIsNotNull || myNotNullParams.size() > 0) {
           myStartGeneratedCodeLabel = new Label();
           mv.visitLabel(myStartGeneratedCodeLabel);
         }
