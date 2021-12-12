diff --git a/src/com/google/javascript/jscomp/CleanupPasses.java b/src/com/google/javascript/jscomp/CleanupPasses.java
index f283e6c..0c4ab7f 100644
--- a/src/com/google/javascript/jscomp/CleanupPasses.java
+++ b/src/com/google/javascript/jscomp/CleanupPasses.java
@@ -51,7 +51,7 @@
   }
 
   @Override
-  State getIntermediateState() {
+  protected State getIntermediateState() {
     return state;
   }
 
@@ -61,7 +61,7 @@
   }
 
   @Override
-  void setIntermediateState(State state) {
+  protected void setIntermediateState(State state) {
     this.state = state;
   }
 
