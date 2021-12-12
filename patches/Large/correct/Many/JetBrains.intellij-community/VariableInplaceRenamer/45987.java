diff --git a/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java b/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java
index 4bf2299..a783606 100644
--- a/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java
+++ b/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java
@@ -219,7 +219,7 @@
 
             //move to old offset
             final LookupImpl lookup = (LookupImpl)LookupManager.getActiveLookup(myEditor);
-            final boolean lookupShown = lookup != null && lookup.getLookupStart() < offset;
+            final boolean lookupShown = lookup != null && lookup.getLookupStart() <= offset;
             if (lookupShown) {
               lookup.setAdditionalPrefix(myEditor.getDocument().getCharsSequence().subSequence(lookup.getLookupStart(), offset).toString());
               lookup.setFocused(false);
