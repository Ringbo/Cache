diff --git a/platform/lang-impl/src/com/intellij/refactoring/rename/RenameViewDescriptor.java b/platform/lang-impl/src/com/intellij/refactoring/rename/RenameViewDescriptor.java
index 065edb7..6203216 100644
--- a/platform/lang-impl/src/com/intellij/refactoring/rename/RenameViewDescriptor.java
+++ b/platform/lang-impl/src/com/intellij/refactoring/rename/RenameViewDescriptor.java
@@ -53,7 +53,8 @@
       if (element instanceof PsiDirectory/* || element instanceof PsiClass*/) {
         String fullName = UsageViewUtil.getLongName(element);
         int lastDot = fullName.lastIndexOf('.');
-        if (lastDot >= 0) {
+        if (lastDot >= 0 && 
+            lastDot + 1 < fullName.length() && ((PsiDirectory)element).getName().equals(fullName.substring(lastDot + 1))) {
           prefix = fullName.substring(0, lastDot + 1);
         }
       }
