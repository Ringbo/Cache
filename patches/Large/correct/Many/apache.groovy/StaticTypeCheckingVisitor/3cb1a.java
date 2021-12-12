diff --git a/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java b/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
index a80f27c..12fe2f2 100644
--- a/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
+++ b/src/main/java/org/codehaus/groovy/transform/stc/StaticTypeCheckingVisitor.java
@@ -503,7 +503,7 @@
                     getterNode = findValidGetter(enclosingClassNode, "is" + suffix);
                 }
                 if (getterNode != null) {
-                    source.setNodeMetaData(StaticTypesMarker.INFERRED_TYPE, getterNode.getReturnType());
+                    source.putNodeMetaData(StaticTypesMarker.INFERRED_TYPE, getterNode.getReturnType());
                     return;
                 }
             }
