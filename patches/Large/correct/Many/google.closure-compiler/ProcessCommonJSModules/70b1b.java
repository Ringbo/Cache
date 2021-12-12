diff --git a/src/com/google/javascript/jscomp/ProcessCommonJSModules.java b/src/com/google/javascript/jscomp/ProcessCommonJSModules.java
index 1105756..899a3cd 100644
--- a/src/com/google/javascript/jscomp/ProcessCommonJSModules.java
+++ b/src/com/google/javascript/jscomp/ProcessCommonJSModules.java
@@ -483,7 +483,7 @@
 
         Node rhsValue = ref.getNext();
         Node newName = IR.name(moduleName).srcref(ref);
-        newName.putProp(Node.ORIGINALNAME_PROP, rhsValue);
+        newName.putProp(Node.ORIGINALNAME_PROP, qName);
 
         Node parent = ref.getParent();
         parent.replaceChild(ref, newName);
