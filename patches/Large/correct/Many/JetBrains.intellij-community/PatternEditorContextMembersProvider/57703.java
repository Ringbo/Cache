diff --git a/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java b/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java
index 0c925f6..04e21e9 100644
--- a/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java
+++ b/plugins/groovy/src/org/intellij/plugins/intelliLang/inject/groovy/PatternEditorContextMembersProvider.java
@@ -124,7 +124,7 @@
   }
 
   private static List<PsiElement> getRootsByClassNames(PsiFile file, String type) {
-    final ArrayList<PsiElement> roots = new ArrayList<PsiElement>(1);
+    final List<PsiElement> roots = ContainerUtil.createEmptyCOWList();
 
     final Project project = file.getProject();
     final JavaPsiFacade psiFacade = JavaPsiFacade.getInstance(project);
