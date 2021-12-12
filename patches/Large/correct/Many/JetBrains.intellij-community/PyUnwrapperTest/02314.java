diff --git a/python/testSrc/com/jetbrains/python/refactoring/PyUnwrapperTest.java b/python/testSrc/com/jetbrains/python/refactoring/PyUnwrapperTest.java
index a45d465..b2670c4 100644
--- a/python/testSrc/com/jetbrains/python/refactoring/PyUnwrapperTest.java
+++ b/python/testSrc/com/jetbrains/python/refactoring/PyUnwrapperTest.java
@@ -70,7 +70,7 @@
       @Override
       protected void selectOption(List<UnwrapHandler.MyUnwrapAction> options, Editor editor, PsiFile file) {
         assertTrue("No available options to unwrap", !options.isEmpty());
-        options.get(option).actionPerformed(null);
+        options.get(option).perform();
       }
     };
     h.invoke(myFixture.getProject(), myFixture.getEditor(), myFixture.getFile());
