diff --git a/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java b/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java
index 8523a93..871739a 100644
--- a/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java
+++ b/src/edu/stanford/nlp/ie/crf/CRFLogConditionalObjectiveFunction.java
@@ -83,7 +83,7 @@
   }
   public double[] initial(boolean useRandomSeed) {
     Random randToUse = useRandomSeed ? new Random() : rand;
-    return initial(rand);
+    return initial(randToUse);
   }
 
   public double[] initial(Random randGen) {
@@ -223,7 +223,7 @@
       featureVal3DArr = featureVal[docIndex];
     }
     // make a clique tree for this document
-    CRFCliqueTree cliqueTree = CRFCliqueTree.getCalibratedCliqueTree(docData, labelIndices, numClasses, classIndex, backgroundSymbol, cliquePotentialFunc, featureVal3DArr);
+    CRFCliqueTree<String> cliqueTree = CRFCliqueTree.getCalibratedCliqueTree(docData, labelIndices, numClasses, classIndex, backgroundSymbol, cliquePotentialFunc, featureVal3DArr);
 
     double prob = 0.0;
     if (doValueCalc) {
@@ -238,7 +238,7 @@
   }
 
   /** Compute the expected counts for this document, which we will need to compute the derivative. */
-  protected void documentExpectedCounts(double[][] E, int[][][] docData, double[][][] featureVal3DArr, CRFCliqueTree cliqueTree) {
+  protected void documentExpectedCounts(double[][] E, int[][][] docData, double[][][] featureVal3DArr, CRFCliqueTree<String> cliqueTree) {
     // iterate over the positions in this document
     for (int i = 0; i < docData.length; i++) {
       // for each possible clique at this position
@@ -261,7 +261,7 @@
   }
 
   /** Compute the log probability of the document given the model with the parameters x. */
-  private double documentLogProbability(int[][][] docData, int docIndex, CRFCliqueTree cliqueTree) {
+  private double documentLogProbability(int[][][] docData, int docIndex, CRFCliqueTree<String> cliqueTree) {
     int[] docLabels = labels[docIndex];
     int[] given = new int[window - 1];
     Arrays.fill(given, classIndex.indexOf(backgroundSymbol));
@@ -671,7 +671,7 @@
   }
 
 
-  protected Pair<double[][][], double[][][]> getCondProbs(CRFCliqueTree cTree, int[][][] docData) {
+  protected Pair<double[][][], double[][][]> getCondProbs(CRFCliqueTree<String> cTree, int[][][] docData) {
     // first index position is curr index, second index curr-class, third index prev-class
     // e.g. [1][2][3] means curr is at position 1 with class 2, prev is at position 0 with class 3
     double[][][] prevGivenCurr = new double[docData.length][][];
