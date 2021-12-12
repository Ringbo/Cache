diff --git a/src/com/google/javascript/rhino/jstype/FunctionType.java b/src/com/google/javascript/rhino/jstype/FunctionType.java
index 3d07b27..c1f1a1d 100644
--- a/src/com/google/javascript/rhino/jstype/FunctionType.java
+++ b/src/com/google/javascript/rhino/jstype/FunctionType.java
@@ -1145,7 +1145,7 @@
    */
   @Override
   public ObjectType getInstanceType() {
-    Preconditions.checkState(hasInstanceType());
+    Preconditions.checkState(hasInstanceType(), "Expected a constructor; got %s", this);
     return typeOfThis.toObjectType();
   }
 
