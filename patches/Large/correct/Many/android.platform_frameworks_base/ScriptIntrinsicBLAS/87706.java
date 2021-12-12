diff --git a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
index a387aab..149c0be 100644
--- a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
+++ b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
@@ -1012,7 +1012,7 @@
             }
         } else {
             if (A != null) {
-                if (TransA != NO_TRANSPOSE) {
+                if (TransA == TRANSPOSE || TransA == CONJ_TRANSPOSE) {
                     aN = A.getType().getY();
                     aM = A.getType().getX();
                 } else {
@@ -1021,7 +1021,7 @@
                 }
             }
             if (B != null) {
-                if (TransB != NO_TRANSPOSE) {
+                if (TransB == TRANSPOSE || TransB == CONJ_TRANSPOSE) {
                     bN = B.getType().getY();
                     bM = B.getType().getX();
                 } else {
@@ -1272,7 +1272,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F32(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
@@ -1283,7 +1283,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F64(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
@@ -1294,7 +1294,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F32_2(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
@@ -1305,7 +1305,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F64_2(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
