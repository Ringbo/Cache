diff --git a/plugins/InspectionGadgets/testsrc/com/siyeh/ig/fixes/performance/ToArrayCallWithZeroLengthArrayArgumentFixTest.java b/plugins/InspectionGadgets/testsrc/com/siyeh/ig/fixes/performance/ToArrayCallWithZeroLengthArrayArgumentFixTest.java
index fda4733..2373c08 100644
--- a/plugins/InspectionGadgets/testsrc/com/siyeh/ig/fixes/performance/ToArrayCallWithZeroLengthArrayArgumentFixTest.java
+++ b/plugins/InspectionGadgets/testsrc/com/siyeh/ig/fixes/performance/ToArrayCallWithZeroLengthArrayArgumentFixTest.java
@@ -32,7 +32,7 @@
   }
 
   private void doFixTest() {
-    doTest(getTestName(true), InspectionGadgetsBundle.message("to.array.call.with.zero.length.array.argument.quickfix"));
+    doTest(getTestName(false), InspectionGadgetsBundle.message("to.array.call.with.zero.length.array.argument.quickfix"));
   }
 
   @Override
