diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/plot/BarnesHutTsne.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/plot/BarnesHutTsne.java
index a6efc18..0a1f328 100644
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/plot/BarnesHutTsne.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/plot/BarnesHutTsne.java
@@ -293,7 +293,7 @@
                 for(int m = rowP.getInt(colP.getInt(i)); m < rowP.getInt(colP.getInt(i)) + 1; m++) {
                     if(colP.getInt(m) == n) {
                         present = true;
-                        if(n <= colP.getInt(i)) {
+                        if(n < colP.getInt(i)) {
                             // make sure we do not add elements twice
                             symColP.putScalar(symRowP.getInt(n) + offset.getInt(n),colP.getInt(i));
                             symColP.putScalar(symRowP.getInt(colP.getInt(i)) + offset.getInt(colP.getInt(i)), n);
@@ -306,7 +306,7 @@
                 // If (colP[i], n) is not present, there is no addition involved
                 if(!present) {
                     int colPI = colP.getInt(i);
-                    if(n <= colPI) {
+                    if(n < colPI) {
                         symColP.putScalar(symRowP.getInt(n) + offset.getInt(n), colPI);
                         symColP.putScalar(symRowP.getInt(colP.getInt(i)) + offset.getInt(colPI),n);
                         symValP.putScalar(symRowP.getInt(n) + offset.getInt(n),valP.getDouble(i));
@@ -316,7 +316,7 @@
                 }
 
                 // Update offsets
-                if(!present || (present && n <= colP.getInt(i))) {
+                if(!present || (present && n < colP.getInt(i))) {
                     offset.putScalar(n,offset.getInt(n)+ 1);
                     int colPI = colP.getInt(i);
                     if(colPI != n)
