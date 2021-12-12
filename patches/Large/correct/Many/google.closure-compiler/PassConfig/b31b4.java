diff --git a/src/com/google/javascript/jscomp/PassConfig.java b/src/com/google/javascript/jscomp/PassConfig.java
index 19ffdd7..95f04e0 100644
--- a/src/com/google/javascript/jscomp/PassConfig.java
+++ b/src/com/google/javascript/jscomp/PassConfig.java
@@ -224,13 +224,13 @@
    * Get intermediate state for a running pass config, so it can
    * be paused and started again later.
    */
-  abstract State getIntermediateState();
+  protected abstract State getIntermediateState();
 
   /**
    * Set the intermediate state for a pass config, to restart
    * a compilation process that had been previously paused.
    */
-  abstract void setIntermediateState(State state);
+  protected abstract void setIntermediateState(State state);
 
   /**
    * An implementation of PassConfig that just proxies all its method calls
@@ -261,11 +261,11 @@
       return delegate.getTopScope();
     }
 
-    @Override State getIntermediateState() {
+    @Override protected State getIntermediateState() {
       return delegate.getIntermediateState();
     }
 
-    @Override void setIntermediateState(State state) {
+    @Override protected void setIntermediateState(State state) {
       delegate.setIntermediateState(state);
     }
   }
@@ -273,7 +273,7 @@
   /**
    * Intermediate state for a running pass configuration.
    */
-  static class State implements Serializable {
+  public static class State implements Serializable {
     private static final long serialVersionUID = 1L;
 
     final Map<String, Integer> cssNames;
@@ -286,7 +286,7 @@
     final FunctionNames functionNames;
     final String idGeneratorMap;
 
-    State(Map<String, Integer> cssNames, Set<String> exportedNames,
+    public State(Map<String, Integer> cssNames, Set<String> exportedNames,
           CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator,
           VariableMap variableMap, VariableMap propertyMap,
           VariableMap anonymousFunctionNameMap,
