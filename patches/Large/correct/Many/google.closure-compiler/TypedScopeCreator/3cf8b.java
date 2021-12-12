diff --git a/src/com/google/javascript/jscomp/TypedScopeCreator.java b/src/com/google/javascript/jscomp/TypedScopeCreator.java
index c87a3a5..31ff271 100644
--- a/src/com/google/javascript/jscomp/TypedScopeCreator.java
+++ b/src/com/google/javascript/jscomp/TypedScopeCreator.java
@@ -215,7 +215,7 @@
   }
 
   @Override
-  public Iterable<TypedVar> getReferences(TypedVar var) {
+  public ImmutableList<TypedVar> getReferences(TypedVar var) {
     return ImmutableList.of(var);
   }
 
