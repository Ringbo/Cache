diff --git a/python/testSrc/com/jetbrains/python/PySurroundWithTest.java b/python/testSrc/com/jetbrains/python/PySurroundWithTest.java
index 3d06bb6..4d30773 100644
--- a/python/testSrc/com/jetbrains/python/PySurroundWithTest.java
+++ b/python/testSrc/com/jetbrains/python/PySurroundWithTest.java
@@ -33,7 +33,7 @@
         SurroundWithHandler.invoke(myFixture.getProject(), myFixture.getEditor(), myFixture.getFile(), surrounder);
       }
     }.execute();
-    myFixture.checkResultByFile(baseName + "_after.py");
+    myFixture.checkResultByFile(baseName + "_after.py", true);
   }
 
   protected String getTestDataPath() {
