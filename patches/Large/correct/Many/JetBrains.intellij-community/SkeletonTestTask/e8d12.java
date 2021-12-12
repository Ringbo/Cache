diff --git a/python/testSrc/com/jetbrains/env/python/dotNet/SkeletonTestTask.java b/python/testSrc/com/jetbrains/env/python/dotNet/SkeletonTestTask.java
index 1cc70ae..ea00031 100644
--- a/python/testSrc/com/jetbrains/env/python/dotNet/SkeletonTestTask.java
+++ b/python/testSrc/com/jetbrains/env/python/dotNet/SkeletonTestTask.java
@@ -116,7 +116,7 @@
     myFixture.enableInspections(PyUnresolvedReferencesInspection.class); // This inspection should suggest us to generate stubs
 
 
-    UIUtil.invokeAndWaitIfNeeded((Runnable)() -> {
+    ApplicationManager.getApplication().invokeAndWait(() -> {
       PsiDocumentManager.getInstance(myFixture.getProject()).commitAllDocuments();
       final String intentionName = PyBundle.message("sdk.gen.stubs.for.binary.modules", myUseQuickFixWithThisModuleOnly);
       IntentionAction intention = myFixture.findSingleIntention(intentionName);
@@ -132,7 +132,7 @@
                         Matchers.instanceOf(GenerateBinaryStubsFix.class));
       final Task fixTask = ((GenerateBinaryStubsFix)quickFix).getFixTask(myFixture.getFile());
       fixTask.run(new AbstractProgressIndicatorBase());
-    });
+    }, ModalityState.defaultModalityState());
 
     FileUtil.copy(skeletonFile, new File(myFixture.getTempDirPath(), skeletonFile.getName()));
     if (myExpectedSkeletonFile != null) {
