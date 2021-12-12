diff --git a/src/com/google/javascript/jscomp/PeepholeFoldConstants.java b/src/com/google/javascript/jscomp/PeepholeFoldConstants.java
index bd6bf7f..2439cc2 100644
--- a/src/com/google/javascript/jscomp/PeepholeFoldConstants.java
+++ b/src/com/google/javascript/jscomp/PeepholeFoldConstants.java
@@ -54,7 +54,7 @@
   static final DiagnosticType SHIFT_AMOUNT_OUT_OF_BOUNDS =
       DiagnosticType.warning(
           "JSC_SHIFT_AMOUNT_OUT_OF_BOUNDS",
-          "Shift amount out of bounds: {0}");
+          "Shift amount out of bounds (see right operand): {0}");
 
   static final DiagnosticType FRACTIONAL_BITWISE_OPERAND =
       DiagnosticType.warning(
@@ -879,7 +879,7 @@
       // only the lower 5 bits are used when shifting, so don't do anything
       // if the shift amount is outside [0,32)
       if (!(rval >= 0 && rval < 32)) {
-        report(SHIFT_AMOUNT_OUT_OF_BOUNDS, right);
+        report(SHIFT_AMOUNT_OUT_OF_BOUNDS, n);
         return n;
       }
 
