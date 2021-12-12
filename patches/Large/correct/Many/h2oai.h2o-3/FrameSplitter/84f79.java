diff --git a/h2o-core/src/main/java/hex/FrameSplitter.java b/h2o-core/src/main/java/hex/FrameSplitter.java
index c846117..f02d25f 100644
--- a/h2o-core/src/main/java/hex/FrameSplitter.java
+++ b/h2o-core/src/main/java/hex/FrameSplitter.java
@@ -191,7 +191,7 @@
       long pnrows = 0;
       for (int p=0; p<_partIdx; p++) pnrows += partSizes[p];
       long[] espc = anyInVec._espc;
-      while (_pcidx < espc.length-1 && (pnrows -= (espc[_pcidx+1]-espc[_pcidx])) > 0 ) _pcidx++;
+      while (_pcidx < espc.length-1 && (pnrows -= (espc[_pcidx+1]-espc[_pcidx])) >= 0 ) _pcidx++;
       assert pnrows <= 0;
       _psrow = (int) (pnrows + espc[_pcidx+1]-espc[_pcidx]);
     }
