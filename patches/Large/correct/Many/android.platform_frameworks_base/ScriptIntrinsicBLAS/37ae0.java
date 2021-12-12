diff --git a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
index d503699..a387aab 100644
--- a/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
+++ b/rs/java/android/renderscript/ScriptIntrinsicBLAS.java
@@ -960,7 +960,7 @@
     }
     public void ZHER(@Uplo int Uplo, double alpha, Allocation X, int incX, Allocation A) {
         // same as SYR
-        int N = validateSYR(Element.F64(mRS), Uplo, X, incX, A);
+        int N = validateSYR(Element.F64_2(mRS), Uplo, X, incX, A);
         mRS.nScriptIntrinsicBLAS_Z(getID(mRS), RsBlas_zher, 0, 0, 0, Uplo, 0, 0, N, 0, alpha, 0, X.getID(mRS), 0, 0, 0, A.getID(mRS), incX, 0, 0, 0);
     }
     public void ZHPR(@Uplo int Uplo, double alpha, Allocation X, int incX, Allocation Ap) {
