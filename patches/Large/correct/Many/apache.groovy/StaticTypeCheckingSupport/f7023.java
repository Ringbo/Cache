diff --git a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
index 2955bdd..c82bcba 100644
--- a/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
+++ b/src/main/org/codehaus/groovy/transform/stc/StaticTypeCheckingSupport.java
@@ -1599,7 +1599,7 @@
      */
     static void extractGenericsConnections(Map<String, GenericsType> connections, ClassNode type, ClassNode target) {
         if (target==null || type==target || !isUsingGenericsOrIsArrayUsingGenerics(target)) return;
-        if (type==UNKNOWN_PARAMETER_TYPE) return;
+        if (type == null || type==UNKNOWN_PARAMETER_TYPE) return;
         if (type.isArray() && target.isArray()) {
             extractGenericsConnections(connections, type.getComponentType(), target.getComponentType());
         } else if (target.isGenericsPlaceHolder() || type.equals(target) || !implementsInterfaceOrIsSubclassOf(type, target)) {
