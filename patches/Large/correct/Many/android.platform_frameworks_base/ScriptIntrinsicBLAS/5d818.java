diff --git a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
index 149c0be..5e28d3f 100644
--- a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
+++ b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
@@ -1288,7 +1288,7 @@
         } else {
             K = A.getType().getX();
         }
-        mRS.nScriptIntrinsicBLAS_Double(getID(mRS), RsBlas_ssyr2k, Trans, 0, 0, Uplo, 0, 0, C.getType().getX(), K, alpha, A.getID(mRS), B.getID(mRS), beta, C.getID(mRS), 0, 0, 0, 0);
+        mRS.nScriptIntrinsicBLAS_Double(getID(mRS), RsBlas_dsyr2k, Trans, 0, 0, Uplo, 0, 0, C.getType().getX(), K, alpha, A.getID(mRS), B.getID(mRS), beta, C.getID(mRS), 0, 0, 0, 0);
     }
     public void CSYR2K(@Uplo int Uplo, @Transpose int Trans, Float2 alpha, Allocation A, Allocation B, Float2 beta, Allocation C) {
         validateUplo(Uplo);
@@ -1299,7 +1299,7 @@
         } else {
             K = A.getType().getX();
         }
-        mRS.nScriptIntrinsicBLAS_Complex(getID(mRS), RsBlas_ssyr2k, Trans, 0, 0, Uplo, 0, 0, C.getType().getX(), K, alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), beta.x, beta.y, C.getID(mRS), 0, 0, 0, 0);
+        mRS.nScriptIntrinsicBLAS_Complex(getID(mRS), RsBlas_csyr2k, Trans, 0, 0, Uplo, 0, 0, C.getType().getX(), K, alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), beta.x, beta.y, C.getID(mRS), 0, 0, 0, 0);
     }
     public void ZSYR2K(@Uplo int Uplo, @Transpose int Trans, Double2 alpha, Allocation A, Allocation B, Double2 beta, Allocation C) {
         validateUplo(Uplo);
@@ -1310,7 +1310,7 @@
         } else {
             K = A.getType().getX();
         }
-        mRS.nScriptIntrinsicBLAS_Z(getID(mRS), RsBlas_ssyr2k, Trans, 0, 0, Uplo, 0, 0, C.getType().getX(), K, alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), beta.x, beta.y, C.getID(mRS), 0, 0, 0, 0);
+        mRS.nScriptIntrinsicBLAS_Z(getID(mRS), RsBlas_zsyr2k, Trans, 0, 0, Uplo, 0, 0, C.getType().getX(), K, alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), beta.x, beta.y, C.getID(mRS), 0, 0, 0, 0);
     }
 
     static void validateTRMM(Element e, @Side int Side, @Transpose int TransA, Allocation A, Allocation B) {
@@ -1351,21 +1351,21 @@
         validateUplo(Uplo);
         validateDiag(Diag);
         validateTRMM(Element.F64(mRS), Side, TransA, A, B);
-        mRS.nScriptIntrinsicBLAS_Double(getID(mRS), RsBlas_strmm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
-                                        alpha, A.getID(mRS), B.getID(mRS), 0.f, 0, 0, 0, 0, 0);
+        mRS.nScriptIntrinsicBLAS_Double(getID(mRS), RsBlas_dtrmm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
+                                        alpha, A.getID(mRS), B.getID(mRS), 0, 0, 0, 0, 0, 0);
     }
     public void CTRMM(@Side int Side, @Uplo int Uplo, @Transpose int TransA, @Diag int Diag, Float2 alpha, Allocation A, Allocation B) {
         validateUplo(Uplo);
         validateDiag(Diag);
         validateTRMM(Element.F32_2(mRS), Side, TransA, A, B);
-        mRS.nScriptIntrinsicBLAS_Complex(getID(mRS), RsBlas_strmm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
+        mRS.nScriptIntrinsicBLAS_Complex(getID(mRS), RsBlas_ctrmm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
                                          alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), 0, 0, 0, 0, 0, 0, 0);
     }
     public void ZTRMM(@Side int Side, @Uplo int Uplo, @Transpose int TransA, @Diag int Diag, Double2 alpha, Allocation A, Allocation B) {
         validateUplo(Uplo);
         validateDiag(Diag);
         validateTRMM(Element.F64_2(mRS), Side, TransA, A, B);
-        mRS.nScriptIntrinsicBLAS_Z(getID(mRS), RsBlas_strmm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
+        mRS.nScriptIntrinsicBLAS_Z(getID(mRS), RsBlas_ztrmm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
                                    alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), 0, 0, 0, 0, 0, 0, 0);
     }
 
@@ -1409,21 +1409,21 @@
         validateUplo(Uplo);
         validateDiag(Diag);
         validateTRSM(Element.F64(mRS), Side, TransA, A, B);
-        mRS.nScriptIntrinsicBLAS_Double(getID(mRS), RsBlas_strsm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
+        mRS.nScriptIntrinsicBLAS_Double(getID(mRS), RsBlas_dtrsm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
                                         alpha, A.getID(mRS), B.getID(mRS), 0, 0, 0, 0, 0, 0);
     }
     public void CTRSM(@Side int Side, @Uplo int Uplo, @Transpose int TransA, @Diag int Diag, Float2 alpha, Allocation A, Allocation B) {
         validateUplo(Uplo);
         validateDiag(Diag);
         validateTRSM(Element.F32_2(mRS), Side, TransA, A, B);
-        mRS.nScriptIntrinsicBLAS_Complex(getID(mRS), RsBlas_strsm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
+        mRS.nScriptIntrinsicBLAS_Complex(getID(mRS), RsBlas_ctrsm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
                                          alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), 0, 0, 0, 0, 0, 0, 0);
     }
     public void ZTRSM(@Side int Side, @Uplo int Uplo, @Transpose int TransA, @Diag int Diag, Double2 alpha, Allocation A, Allocation B) {
         validateUplo(Uplo);
         validateDiag(Diag);
         validateTRSM(Element.F64_2(mRS), Side, TransA, A, B);
-        mRS.nScriptIntrinsicBLAS_Z(getID(mRS), RsBlas_strsm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
+        mRS.nScriptIntrinsicBLAS_Z(getID(mRS), RsBlas_ztrsm, TransA, 0, Side, Uplo, Diag, B.getType().getY(), B.getType().getX(), 0,
                                    alpha.x, alpha.y, A.getID(mRS), B.getID(mRS), 0, 0, 0, 0, 0, 0, 0);
     }
 
