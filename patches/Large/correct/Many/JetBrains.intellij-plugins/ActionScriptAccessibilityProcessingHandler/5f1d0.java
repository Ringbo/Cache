diff --git a/flex/src/com/intellij/javascript/flex/resolve/ActionScriptAccessibilityProcessingHandler.java b/flex/src/com/intellij/javascript/flex/resolve/ActionScriptAccessibilityProcessingHandler.java
index 788dc05..8a36865 100644
--- a/flex/src/com/intellij/javascript/flex/resolve/ActionScriptAccessibilityProcessingHandler.java
+++ b/flex/src/com/intellij/javascript/flex/resolve/ActionScriptAccessibilityProcessingHandler.java
@@ -66,7 +66,7 @@
             attributeList.getAccessType() == JSAttributeList.AccessType.PROTECTED
           ) {
           // we are resolving in context of the class or element within context of the class
-          if ((myClassScopeTypeName != null || isParentClassContext(element))) {
+          if ((myClassScopeTypeNames != null || isParentClassContext(element))) {
             resolveProcessor.addPossibleCandidateResult(element, JSResolveResult.PROTECTED_MEMBER_IS_NOT_ACCESSIBLE);
             return false;
           } // if element / context out of class then protected element is ok due to includes
