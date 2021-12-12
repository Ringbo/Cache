diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/blas/CpuLapack.java b/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/blas/CpuLapack.java
index e92d541..8659f27 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/blas/CpuLapack.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-native/src/main/java/org/nd4j/linalg/cpu/nativecpu/blas/CpuLapack.java
@@ -31,7 +31,7 @@
             (FloatPointer)A.data().addressPointer(), 
             getLda(A), (IntPointer)IPIV.data().addressPointer()
             );
-        if( status != 0 ) {
+        if( status < 0 ) {
             throw new BlasException( "Failed to execute sgetrf", status ) ;
         }
     }
@@ -41,7 +41,7 @@
         int status = LAPACKE_dgetrf(getColumnOrder(A), M, N, (DoublePointer)A.data().addressPointer(), 
             getLda(A), (IntPointer)IPIV.data().addressPointer()
             );
-        if( status != 0 ) {
+        if( status < 0 ) {
             throw new BlasException( "Failed to execute dgetrf", status ) ;
         }
     }
