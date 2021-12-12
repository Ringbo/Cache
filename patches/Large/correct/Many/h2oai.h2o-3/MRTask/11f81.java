diff --git a/h2o-core/src/main/java/water/MRTask.java b/h2o-core/src/main/java/water/MRTask.java
index 290f131..05f348e 100644
--- a/h2o-core/src/main/java/water/MRTask.java
+++ b/h2o-core/src/main/java/water/MRTask.java
@@ -227,7 +227,7 @@
     if( _output_types == null ) return null;
     final int noutputs = _output_types.length;
     Vec[] vecs = new Vec[noutputs];
-    if( _appendables==null )  // Zero rows?
+    if( _appendables==null || _appendables.length == 0)  // Zero rows?
       for( int i = 0; i < noutputs; i++ )
         vecs[i] = _fr.anyVec().makeZero();
     else {
