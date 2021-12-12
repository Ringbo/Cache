diff --git a/src/com/google/javascript/jscomp/IncrementalScopeCreator.java b/src/com/google/javascript/jscomp/IncrementalScopeCreator.java
index 6d0db7e..02139a2 100644
--- a/src/com/google/javascript/jscomp/IncrementalScopeCreator.java
+++ b/src/com/google/javascript/jscomp/IncrementalScopeCreator.java
@@ -240,7 +240,7 @@
     void expandInvalidatedScript(Node script) {
       Collection<Node> pairs = scriptDeclarationsPairs.get(script);
       for (Node n : pairs) {
-        if (!scriptsToUpdate.add(n)) {
+        if (scriptsToUpdate.add(n)) {
           expandInvalidatedScript(script);
         }
       }
