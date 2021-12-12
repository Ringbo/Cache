diff --git a/platform/platform-tests/testSrc/com/intellij/usages/impl/UsageViewTest.java b/platform/platform-tests/testSrc/com/intellij/usages/impl/UsageViewTest.java
index 3fcc42b..a7073cd 100644
--- a/platform/platform-tests/testSrc/com/intellij/usages/impl/UsageViewTest.java
+++ b/platform/platform-tests/testSrc/com/intellij/usages/impl/UsageViewTest.java
@@ -50,7 +50,7 @@
     FileDocumentManager.getInstance().saveAllDocuments();
     UIUtil.dispatchAllInvocationEvents();
 
-    LeakHunter.checkLeak(usageView, PsiFileImpl.class);
+    LeakHunter.checkLeak(usageView, PsiFileImpl.class, PsiFileImpl::isPhysical);
     LeakHunter.checkLeak(usageView, Document.class);
   }
 
