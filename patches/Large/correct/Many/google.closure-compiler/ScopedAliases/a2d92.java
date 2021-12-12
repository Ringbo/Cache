diff --git a/src/com/google/javascript/jscomp/ScopedAliases.java b/src/com/google/javascript/jscomp/ScopedAliases.java
index 0b74104..13b7046 100644
--- a/src/com/google/javascript/jscomp/ScopedAliases.java
+++ b/src/com/google/javascript/jscomp/ScopedAliases.java
@@ -208,7 +208,7 @@
     public abstract void applyAlias();
   }
 
-  private class AliasedNode extends AliasUsage {
+  private static class AliasedNode extends AliasUsage {
     AliasedNode(Var aliasVar, Node aliasReference) {
       super(aliasVar, aliasReference);
     }
@@ -222,7 +222,7 @@
     }
   }
 
-  private class AliasedTypeNode extends AliasUsage {
+  private static class AliasedTypeNode extends AliasUsage {
     AliasedTypeNode(Var aliasVar, Node aliasReference) {
       super(aliasVar, aliasReference);
     }
@@ -459,7 +459,7 @@
         aliasVar.getInitialValue().getQualifiedName();
       transformation.addAlias(name, qualifiedName);
 
-      int rootIndex = qualifiedName.indexOf(".");
+      int rootIndex = qualifiedName.indexOf('.');
       if (rootIndex != -1) {
         String qNameRoot = qualifiedName.substring(0, rootIndex);
         if (!aliases.containsKey(qNameRoot)) {
