diff --git a/src/java/org/apache/lucene/search/BooleanScorer2.java b/src/java/org/apache/lucene/search/BooleanScorer2.java
index c8983cb..a981cd6 100644
--- a/src/java/org/apache/lucene/search/BooleanScorer2.java
+++ b/src/java/org/apache/lucene/search/BooleanScorer2.java
@@ -25,7 +25,7 @@
  * <br>Uses ConjunctionScorer, DisjunctionScorer, ReqOptScorer and ReqExclScorer.
  * <br>Implements skipTo(), and has no limitations on the numbers of added scorers.
  */
-public class BooleanScorer2 extends Scorer {
+class BooleanScorer2 extends Scorer {
   private ArrayList requiredScorers = new ArrayList();
   private ArrayList optionalScorers = new ArrayList();
   private ArrayList prohibitedScorers = new ArrayList();
@@ -292,6 +292,14 @@
     return sum * coordinator.coordFactor();
   }
 
+  /** Skips to the first match beyond the current whose document number is
+   * greater than or equal to a given target.
+   * 
+   * <p>When this method is used the {@link #explain(int)} method should not be used.
+   * 
+   * @param target The target document number.
+   * @return true iff there is such a match.
+   */
   public boolean skipTo(int target) throws IOException {
     if (countingSumScorer == null) {
       initCountingSumScorer();
@@ -299,7 +307,12 @@
     return countingSumScorer.skipTo(target);
   }
 
-  public Explanation explain(int doc) throws IOException {
+  /** Throws an UnsupportedOperationException.
+   * TODO: Implement an explanation of the coordination factor.
+   * @param doc The document number for the explanation.
+   * @throws UnsupportedOperationException
+   */
+  public Explanation explain(int doc) {
     throw new UnsupportedOperationException();
  /* How to explain the coordination factor?
     initCountingSumScorer();
