diff --git a/plugins/InspectionGadgets/testsrc/com/intellij/codeInspection/BooleanMethodInvertedTest.java b/plugins/InspectionGadgets/testsrc/com/intellij/codeInspection/BooleanMethodInvertedTest.java
index d60e417..b0fced9 100644
--- a/plugins/InspectionGadgets/testsrc/com/intellij/codeInspection/BooleanMethodInvertedTest.java
+++ b/plugins/InspectionGadgets/testsrc/com/intellij/codeInspection/BooleanMethodInvertedTest.java
@@ -49,6 +49,6 @@
   }
 
   private void doTest() throws Exception {
-    doTest("invertedBoolean/" + getTestName(false), new BooleanMethodIsAlwaysInvertedInspection());
+    doTest("invertedBoolean/" + getTestName(true), new BooleanMethodIsAlwaysInvertedInspection());
   }
 }
