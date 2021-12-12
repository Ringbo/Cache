diff --git a/compiler/tests/org/jetbrains/jet/checkers/CheckerTestUtilTest.java b/compiler/tests/org/jetbrains/jet/checkers/CheckerTestUtilTest.java
index 06ffed7..cdf385d 100644
--- a/compiler/tests/org/jetbrains/jet/checkers/CheckerTestUtilTest.java
+++ b/compiler/tests/org/jetbrains/jet/checkers/CheckerTestUtilTest.java
@@ -67,7 +67,7 @@
         doTest(new TheTest("Unexpected NONE_APPLICABLE at 122 to 123", "Missing TYPE_MISMATCH at 161 to 169") {
             @Override
             protected void makeTestData(List<Diagnostic> diagnostics, List<CheckerTestUtil.DiagnosedRange> diagnosedRanges) {
-                diagnosedRanges.remove(2);
+                diagnosedRanges.remove(3);
                 diagnostics.remove(diagnostics.size() - 3);
             }
         });
