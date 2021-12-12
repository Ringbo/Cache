diff --git a/angel-ps/core/src/main/java/com/tencent/angel/ml/math2/ufuncs/OptFuncs.java b/angel-ps/core/src/main/java/com/tencent/angel/ml/math2/ufuncs/OptFuncs.java
index 35573cf..d326ec2 100644
--- a/angel-ps/core/src/main/java/com/tencent/angel/ml/math2/ufuncs/OptFuncs.java
+++ b/angel-ps/core/src/main/java/com/tencent/angel/ml/math2/ufuncs/OptFuncs.java
@@ -83,7 +83,7 @@
   }
 
   public static Matrix ftrldelta(Matrix m1, Matrix m2, double alpha) {
-    return BinaryMatrixExecutor.apply(m1, false, m2, false, new FtrlDelta(true, alpha));
+    return BinaryMatrixExecutor.apply(m1, false, m2, false, new FtrlDelta(false, alpha));
   }
 
   public static Vector iftrldelta(Vector v1, Vector v2, double alpha) {
@@ -91,6 +91,6 @@
   }
 
   public static Vector ftrldelta(Vector v1, Vector v2, double alpha) {
-    return BinaryExecutor.apply(v1, v2, new FtrlDelta(true, alpha));
+    return BinaryExecutor.apply(v1, v2, new FtrlDelta(false, alpha));
   }
 }
\ No newline at end of file
