diff --git a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
index feca951..d2adca0 100644
--- a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
+++ b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
@@ -1013,7 +1013,7 @@
             }
         } else {
             if (A != null) {
-                if (TransA != NO_TRANSPOSE) {
+                if (TransA == TRANSPOSE || TransA == CONJ_TRANSPOSE) {
                     aN = A.getType().getY();
                     aM = A.getType().getX();
                 } else {
@@ -1022,7 +1022,7 @@
                 }
             }
             if (B != null) {
-                if (TransB != NO_TRANSPOSE) {
+                if (TransB == TRANSPOSE || TransB == CONJ_TRANSPOSE) {
                     bN = B.getType().getY();
                     bM = B.getType().getX();
                 } else {
@@ -1273,7 +1273,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F32(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
@@ -1284,7 +1284,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F64(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
@@ -1295,7 +1295,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F32_2(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
@@ -1306,7 +1306,7 @@
         validateUplo(Uplo);
         validateSYR2K(Element.F64_2(mRS), Trans, A, B, C);
         int K = -1;
-        if (Trans == TRANSPOSE) {
+        if (Trans != NO_TRANSPOSE) {
             K = A.getType().getY();
         } else {
             K = A.getType().getX();
