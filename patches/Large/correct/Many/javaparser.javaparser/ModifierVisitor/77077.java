diff --git a/javaparser-core/src/main/java/com/github/javaparser/ast/visitor/ModifierVisitor.java b/javaparser-core/src/main/java/com/github/javaparser/ast/visitor/ModifierVisitor.java
index 0a5ddbe..9fc8481 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/ast/visitor/ModifierVisitor.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/ast/visitor/ModifierVisitor.java
@@ -1095,7 +1095,7 @@
     }
 
     private <N extends Node> NodeList<N> modifyList(Optional<NodeList<N>> list, A arg) {
-        return list.map( ns -> modifyList(list, arg)).orElse(null);
+        return list.map(ns -> modifyList(ns, arg)).orElse(null);
     }
 }
 
