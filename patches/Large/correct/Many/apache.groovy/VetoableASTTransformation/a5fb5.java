diff --git a/src/main/groovy/beans/VetoableASTTransformation.java b/src/main/groovy/beans/VetoableASTTransformation.java
index 1487b23..d3d3507 100644
--- a/src/main/groovy/beans/VetoableASTTransformation.java
+++ b/src/main/groovy/beans/VetoableASTTransformation.java
@@ -358,7 +358,7 @@
                         ClassHelper.VOID_TYPE,
                         params(param(vclClassNode, "listener")),
                         ClassNode.EMPTY_ARRAY,
-                        stmt(callX(fieldX(vcsField), "addVetoableChangeListener", args(varX("listener"))))));
+                        stmt(callX(fieldX(vcsField), "addVetoableChangeListener", args(varX("listener", vclClassNode))))));
 
         // add method:
         // void addVetoableChangeListener(name, listener) {
@@ -371,7 +371,7 @@
                         ClassHelper.VOID_TYPE,
                         params(param(ClassHelper.STRING_TYPE, "name"), param(vclClassNode, "listener")),
                         ClassNode.EMPTY_ARRAY,
-                        stmt(callX(fieldX(vcsField), "addVetoableChangeListener", args(varX("name"), varX("listener"))))));
+                        stmt(callX(fieldX(vcsField), "addVetoableChangeListener", args(varX("name", ClassHelper.STRING_TYPE), varX("listener", vclClassNode))))));
 
         // add method:
         // boolean removeVetoableChangeListener(listener) {
@@ -384,7 +384,7 @@
                         ClassHelper.VOID_TYPE,
                         params(param(vclClassNode, "listener")),
                         ClassNode.EMPTY_ARRAY,
-                        stmt(callX(fieldX(vcsField), "removeVetoableChangeListener", args(varX("listener"))))));
+                        stmt(callX(fieldX(vcsField), "removeVetoableChangeListener", args(varX("listener", vclClassNode))))));
 
         // add method: void removeVetoableChangeListener(name, listener)
         declaringClass.addMethod(
@@ -394,7 +394,7 @@
                         ClassHelper.VOID_TYPE,
                         params(param(ClassHelper.STRING_TYPE, "name"), param(vclClassNode, "listener")),
                         ClassNode.EMPTY_ARRAY,
-                        stmt(callX(fieldX(vcsField), "removeVetoableChangeListener", args(varX("name"), varX("listener"))))));
+                        stmt(callX(fieldX(vcsField), "removeVetoableChangeListener", args(varX("name", ClassHelper.STRING_TYPE), varX("listener", vclClassNode))))));
 
         // add method:
         // void fireVetoableChange(String name, Object oldValue, Object newValue)
@@ -409,7 +409,7 @@
                         ClassHelper.VOID_TYPE,
                         params(param(ClassHelper.STRING_TYPE, "name"), param(ClassHelper.OBJECT_TYPE, "oldValue"), param(ClassHelper.OBJECT_TYPE, "newValue")),
                         new ClassNode[] {ClassHelper.make(PropertyVetoException.class)},
-                        stmt(callX(fieldX(vcsField), "fireVetoableChange", args(varX("name"), varX("oldValue"), varX("newValue"))))));
+                        stmt(callX(fieldX(vcsField), "fireVetoableChange", args(varX("name", ClassHelper.STRING_TYPE), varX("oldValue"), varX("newValue"))))));
 
         // add method:
         // VetoableChangeListener[] getVetoableChangeListeners() {
@@ -435,7 +435,7 @@
                         vclClassNode.makeArray(),
                         params(param(ClassHelper.STRING_TYPE, "name")),
                         ClassNode.EMPTY_ARRAY,
-                        returnS(callX(fieldX(vcsField), "getVetoableChangeListeners", args(varX("name"))))));
+                        returnS(callX(fieldX(vcsField), "getVetoableChangeListeners", args(varX("name", ClassHelper.STRING_TYPE))))));
     }
 
 }
