diff --git a/java/DBN/src/RBM.java b/java/DBN/src/RBM.java
index ed1b4c5..9ee3563 100644
--- a/java/DBN/src/RBM.java
+++ b/java/DBN/src/RBM.java
@@ -91,7 +91,8 @@
 		
 		for(int i=0; i<n_hidden; i++) {
 			for(int j=0; j<n_visible; j++) {
-				W[i][j] += lr *(ph_sample[i] * input[j] - nh_means[i] * nv_samples[j]) / N;
+				// W[i][j] += lr *(ph_sample[i] * input[j] - nh_means[i] * nv_samples[j]) / N;
+				W[i][j] += lr *(ph_mean[i] * input[j] - nh_means[i] * nv_samples[j]) / N;
 			}
 			hbias[i] += lr * (ph_sample[i] - nh_means[i]) / N;
 		}
