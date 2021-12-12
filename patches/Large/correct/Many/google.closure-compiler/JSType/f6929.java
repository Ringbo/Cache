diff --git a/src/com/google/javascript/jscomp/newtypes/JSType.java b/src/com/google/javascript/jscomp/newtypes/JSType.java
index d78095f..dd65a12 100644
--- a/src/com/google/javascript/jscomp/newtypes/JSType.java
+++ b/src/com/google/javascript/jscomp/newtypes/JSType.java
@@ -389,7 +389,8 @@
   }
 
   public JSType substituteGenerics(Map<String, JSType> concreteTypes) {
-    if (isTop() || isUnknown()) {
+    if (isTop() || isUnknown()
+        || objs == null && typeVar == null) {
       return this;
     }
     ImmutableSet<ObjectType> newObjs = null;
