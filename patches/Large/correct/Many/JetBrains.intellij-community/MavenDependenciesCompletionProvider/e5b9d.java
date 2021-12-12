diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenDependenciesCompletionProvider.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenDependenciesCompletionProvider.java
index db035c8..985d406 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenDependenciesCompletionProvider.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/dom/model/completion/MavenDependenciesCompletionProvider.java
@@ -124,7 +124,7 @@
       }
 
       if (e != null) {
-        new ReformatCodeProcessor(psiFile.getProject(), psiFile, e.getTextRange(), true).run();
+        new ReformatCodeProcessor(psiFile.getProject(), psiFile, e.getTextRange(), false).run();
       }
 
       if (shouldInvokeCompletion) {
