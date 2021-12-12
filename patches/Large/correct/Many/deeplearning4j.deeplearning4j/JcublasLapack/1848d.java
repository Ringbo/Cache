diff --git a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/blas/JcublasLapack.java b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/blas/JcublasLapack.java
index ad35c7d..18a2ac1 100644
--- a/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/blas/JcublasLapack.java
+++ b/nd4j-backends/nd4j-backend-impls/nd4j-cuda/src/main/java/org/nd4j/linalg/jcublas/blas/JcublasLapack.java
@@ -847,7 +847,7 @@
 		    DataBuffer worksizeBuffer = Nd4j.getDataBufferFactory().createInt(1);
 		    try {
 			    status = (Integer)this.cusolverDnSsyevd_bufferSize.invoke (
-					solverDn, jobz, uplo, M, 
+					null, solverDn, jobz, uplo, M, 
 					(FloatPointer) xAPointer.getDevicePointer(), M,
 					(FloatPointer) xRPointer.getDevicePointer(),
 					(IntPointer)worksizeBuffer.addressPointer() ) ;
@@ -863,7 +863,7 @@
 
 
 				    // Do the actual decomp
-				    status = (Integer)this.cusolverDnSsyevd.invoke(solverDn, jobz, uplo, M, 
+				    status = (Integer)this.cusolverDnSsyevd.invoke(null, solverDn, jobz, uplo, M, 
 							(FloatPointer) xAPointer.getDevicePointer(), M,
 							(FloatPointer) xRPointer.getDevicePointer(), 
 							new CudaPointer(workspace).asFloatPointer(), worksize,
@@ -932,7 +932,7 @@
 		    DataBuffer worksizeBuffer = Nd4j.getDataBufferFactory().createInt(1);
 		    try {
 			    status = (Integer)this.cusolverDnDsyevd_bufferSize.invoke(
-					solverDn, jobz, uplo, M, 
+					null, solverDn, jobz, uplo, M, 
 					(DoublePointer) xAPointer.getDevicePointer(), M,
 					(DoublePointer) xRPointer.getDevicePointer(),
 					(IntPointer)worksizeBuffer.addressPointer() ) ;
@@ -948,7 +948,7 @@
 
 
 				    // Do the actual decomp
-				    status = (Integer)this.cusolverDnDsyevd.invoke(solverDn, jobz, uplo, M, 
+				    status = (Integer)this.cusolverDnDsyevd.invoke( null, solverDn, jobz, uplo, M, 
 							(DoublePointer) xAPointer.getDevicePointer(), M,
 							(DoublePointer) xRPointer.getDevicePointer(), 
 							new CudaPointer(workspace).asDoublePointer(), worksize,
