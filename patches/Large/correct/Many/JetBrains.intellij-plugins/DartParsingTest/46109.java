diff --git a/Dart/testSrc/com/jetbrains/lang/dart/parser/DartParsingTest.java b/Dart/testSrc/com/jetbrains/lang/dart/parser/DartParsingTest.java
index ee522cd..f7dea74 100644
--- a/Dart/testSrc/com/jetbrains/lang/dart/parser/DartParsingTest.java
+++ b/Dart/testSrc/com/jetbrains/lang/dart/parser/DartParsingTest.java
@@ -40,9 +40,7 @@
     doTest();
   }
 
-  public void testDeferredImport() throws Throwable {
-    doTest();
-  }
+  public void testDeferredImport() { doTest(); }
 
   public void testErrors() throws Throwable {
     doTest();
