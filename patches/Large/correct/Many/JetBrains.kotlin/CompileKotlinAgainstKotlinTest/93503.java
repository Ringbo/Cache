diff --git a/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java b/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java
index df22d40..ecd3103 100644
--- a/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java
+++ b/compiler/tests/org/jetbrains/jet/jvm/compiler/CompileKotlinAgainstKotlinTest.java
@@ -104,7 +104,7 @@
 
         String text = FileUtil.loadFile(ktBFile);
 
-        LightVirtualFile virtualFile = new LightVirtualFile(ktAFile.getName(), JetLanguage.INSTANCE, text);
+        LightVirtualFile virtualFile = new LightVirtualFile(ktBFile.getName(), JetLanguage.INSTANCE, text);
         virtualFile.setCharset(CharsetToolkit.UTF8_CHARSET);
         JetFile psiFile = (JetFile) ((PsiFileFactoryImpl) PsiFileFactory.getInstance(jetCoreEnvironment.getProject())).trySetupPsiForFile(virtualFile, JetLanguage.INSTANCE, true, false);
 
