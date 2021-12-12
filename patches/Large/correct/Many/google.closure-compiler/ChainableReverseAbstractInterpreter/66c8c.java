diff --git a/src/com/google/javascript/jscomp/type/ChainableReverseAbstractInterpreter.java b/src/com/google/javascript/jscomp/type/ChainableReverseAbstractInterpreter.java
index 0aea44c..8894e90 100644
--- a/src/com/google/javascript/jscomp/type/ChainableReverseAbstractInterpreter.java
+++ b/src/com/google/javascript/jscomp/type/ChainableReverseAbstractInterpreter.java
@@ -113,7 +113,7 @@
    * name whose type is capable of being refined.
    * @return The current type of the node if it can be refined, null otherwise.
    */
-  JSType getTypeIfRefinable(Node node, FlowScope scope) {
+  protected JSType getTypeIfRefinable(Node node, FlowScope scope) {
     switch (node.getType()) {
       case Token.NAME:
         StaticSlot<JSType> nameVar = scope.getSlot(node.getString());
@@ -590,14 +590,14 @@
   /**
    * Returns a version of type where undefined is not present.
    */
-  final JSType getRestrictedWithoutUndefined(JSType type) {
+  protected final JSType getRestrictedWithoutUndefined(JSType type) {
     return type == null ? null : type.visit(restrictUndefinedVisitor);
   }
 
   /**
    * Returns a version of type where null is not present.
    */
-  final JSType getRestrictedWithoutNull(JSType type) {
+  protected final JSType getRestrictedWithoutNull(JSType type) {
     return type == null ? null : type.visit(restrictNullVisitor);
   }
 
