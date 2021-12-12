diff --git a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
index 6b3785d..14a0659 100644
--- a/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
+++ b/flex/src/com/intellij/lang/javascript/inspections/actionscript/ActionScriptAnnotatingVisitor.java
@@ -1142,7 +1142,7 @@
           if (setterParameters.length == 1 &&
               !((setterType = setterParameters[0].getType()) instanceof JSAnyType) &&
               !(type instanceof JSAnyType) &&
-              !JSTypeUtils.areTypesCompatible(setterType, type,  null)) {
+              !JSTypeUtils.areTypesCompatible(setterType, type,  null, function)) {
             PsiElement typeElement = function.getReturnTypeElement();
 
             myHolder.createErrorAnnotation(
