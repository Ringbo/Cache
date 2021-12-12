diff --git a/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/renders/UpdateFilterIterationListener.java b/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/renders/UpdateFilterIterationListener.java
index 925992c..795ffe5 100644
--- a/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/renders/UpdateFilterIterationListener.java
+++ b/deeplearning4j-ui/src/main/java/org/deeplearning4j/ui/renders/UpdateFilterIterationListener.java
@@ -26,7 +26,7 @@
      * @param iterations the number of iterations to update on
      */
     public UpdateFilterIterationListener(List<String> variables,int iterations) {
-        listener = new PlotFiltersIterationListener(variables);
+        listener = new PlotFiltersIterationListener(null,variables,0);
         this.iterations = iterations;
     }
 
