diff --git a/deeplearning4j-core/src/main/java/org/deeplearning4j/util/MathUtils.java b/deeplearning4j-core/src/main/java/org/deeplearning4j/util/MathUtils.java
index 0233ad0..e3e9057 100755
--- a/deeplearning4j-core/src/main/java/org/deeplearning4j/util/MathUtils.java
+++ b/deeplearning4j-core/src/main/java/org/deeplearning4j/util/MathUtils.java
@@ -729,11 +729,11 @@
      * @return the root means squared error for two data sets
      */
     public static double rootMeansSquaredError(double[] real,double[] predicted) {
-        double ret=1/real.length;
+        double ret= 0.0;
         for(int i=0;i<real.length;i++) {
             ret+=Math.pow((real[i]-predicted[i]), 2);
         }
-        return Math.sqrt(ret);
+        return Math.sqrt(ret / real.length);
     }//end rootMeansSquaredError
     /**
      * This returns the entropy (information gain, or uncertainty of a random variable).
@@ -771,7 +771,7 @@
      * @return an adjusted r^2 for degrees of freedom
      */
     public static double adjustedrSquared(double rSquared,int numRegressors,int numDataPoints) {
-        double divide=(numDataPoints -1)/(numDataPoints - numRegressors -1);
+        double divide = (numDataPoints - 1.0) / (numDataPoints - numRegressors - 1.0);
         double rSquaredDiff=1-rSquared;
         return 1-(rSquaredDiff *divide );
     }
