diff --git a/src/com/google/javascript/rhino/jstype/FunctionType.java b/src/com/google/javascript/rhino/jstype/FunctionType.java
index d931378..64890f1 100644
--- a/src/com/google/javascript/rhino/jstype/FunctionType.java
+++ b/src/com/google/javascript/rhino/jstype/FunctionType.java
@@ -577,7 +577,7 @@
   }
 
   /** Returns interfaces implemented directly by a class or its superclass. */
-  public final Iterable<ObjectType> getImplementedInterfaces() {
+  public final ImmutableList<ObjectType> getImplementedInterfaces() {
     FunctionType superCtor = isConstructor() ? getSuperClassConstructor() : null;
     if (superCtor == null) {
       return implementedInterfaces;
@@ -592,7 +592,7 @@
   }
 
   /** Returns interfaces directly implemented by the class. */
-  public final Iterable<ObjectType> getOwnImplementedInterfaces() {
+  public final ImmutableList<ObjectType> getOwnImplementedInterfaces() {
     return implementedInterfaces;
   }
 
@@ -610,7 +610,7 @@
   }
 
   /** Returns interfaces directly extended by an interface */
-  public final Iterable<ObjectType> getExtendedInterfaces() {
+  public final ImmutableList<ObjectType> getExtendedInterfaces() {
     return extendedInterfaces;
   }
 
