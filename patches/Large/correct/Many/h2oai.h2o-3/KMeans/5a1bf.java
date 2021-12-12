diff --git a/h2o-algos/src/main/java/hex/kmeans/KMeans.java b/h2o-algos/src/main/java/hex/kmeans/KMeans.java
index 14be2da..76b9e83 100644
--- a/h2o-algos/src/main/java/hex/kmeans/KMeans.java
+++ b/h2o-algos/src/main/java/hex/kmeans/KMeans.java
@@ -508,7 +508,7 @@
       System.arraycopy(clusters[clu],0,value[clu],0,N);
       if( mults!=null )         // Reverse normalization
         for( int col = ncats; col < N; col++ )
-          value[clu][col] = value[clu][col] * mults[col] + means[col];
+          value[clu][col] = value[clu][col] / mults[col] + means[col];
     }
     return value;
   }
