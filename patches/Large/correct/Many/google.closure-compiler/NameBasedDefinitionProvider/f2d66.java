diff --git a/src/com/google/javascript/jscomp/NameBasedDefinitionProvider.java b/src/com/google/javascript/jscomp/NameBasedDefinitionProvider.java
index 5b5784d..56bb596 100644
--- a/src/com/google/javascript/jscomp/NameBasedDefinitionProvider.java
+++ b/src/com/google/javascript/jscomp/NameBasedDefinitionProvider.java
@@ -94,7 +94,7 @@
    * should not have to drop definitions itself.
    */
   private void dropUntypedExterns() {
-    for (String externName : nameDefinitionMultimap.keySet()) {
+    for (String externName : nameDefinitionMultimap.keys()) {
       for (Definition def : new ArrayList<Definition>(nameDefinitionMultimap.get(externName))) {
         if (def instanceof ExternalNameOnlyDefinition) {
           Node node = def.getLValue();
