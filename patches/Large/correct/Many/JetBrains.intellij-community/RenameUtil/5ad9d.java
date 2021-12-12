diff --git a/lang-impl/src/com/intellij/refactoring/rename/RenameUtil.java b/lang-impl/src/com/intellij/refactoring/rename/RenameUtil.java
index 2c353bb..e184b1f 100644
--- a/lang-impl/src/com/intellij/refactoring/rename/RenameUtil.java
+++ b/lang-impl/src/com/intellij/refactoring/rename/RenameUtil.java
@@ -57,7 +57,7 @@
 
     if (searchInStringsAndComments && !(element instanceof PsiDirectory)) {
       String stringToSearch = ElementDescriptionUtil.getElementDescription(element, NonCodeSearchDescriptionLocation.STRINGS_AND_COMMENTS);
-      if (stringToSearch != null) {
+      if (stringToSearch != null && stringToSearch.length() > 0) {
         final String stringToReplace = getStringToReplace(element, newName, false, processor);
         TextOccurrencesUtil.UsageInfoFactory factory = new NonCodeUsageInfoFactory(element, stringToReplace);
         TextOccurrencesUtil.addUsagesInStringsAndComments(element, stringToSearch, result, factory);
