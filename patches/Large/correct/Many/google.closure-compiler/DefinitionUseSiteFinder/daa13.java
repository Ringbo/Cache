diff --git a/src/com/google/javascript/jscomp/DefinitionUseSiteFinder.java b/src/com/google/javascript/jscomp/DefinitionUseSiteFinder.java
index fbadff3..6d294d8 100644
--- a/src/com/google/javascript/jscomp/DefinitionUseSiteFinder.java
+++ b/src/com/google/javascript/jscomp/DefinitionUseSiteFinder.java
@@ -169,7 +169,7 @@
         String name = getSimplifiedName(def.getLValue());
         if (name != null) {
           this.definitionNodeByDefinitionSite.remove(node);
-          this.nameDefinitionMultimap.remove(name, node);
+          this.nameDefinitionMultimap.remove(name, def);
         }
       }
     } else {
