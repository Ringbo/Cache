diff --git a/src/com/google/javascript/jscomp/DefaultPassConfig.java b/src/com/google/javascript/jscomp/DefaultPassConfig.java
index 671e66b..1bb44bf 100644
--- a/src/com/google/javascript/jscomp/DefaultPassConfig.java
+++ b/src/com/google/javascript/jscomp/DefaultPassConfig.java
@@ -144,7 +144,7 @@
   }
 
   @Override
-  State getIntermediateState() {
+  protected State getIntermediateState() {
     return new State(
         cssNames == null ? null : Maps.newHashMap(cssNames),
         exportedNames == null ? null :
@@ -154,7 +154,7 @@
   }
 
   @Override
-  void setIntermediateState(State state) {
+  protected void setIntermediateState(State state) {
     this.cssNames = state.cssNames == null ? null :
         Maps.newHashMap(state.cssNames);
     this.exportedNames = state.exportedNames == null ? null :
