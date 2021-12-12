diff --git a/drools-core/src/main/java/org/drools/reteoo/builder/PatternBuilder.java b/drools-core/src/main/java/org/drools/reteoo/builder/PatternBuilder.java
index ab7dee5..16b5705 100755
--- a/drools-core/src/main/java/org/drools/reteoo/builder/PatternBuilder.java
+++ b/drools-core/src/main/java/org/drools/reteoo/builder/PatternBuilder.java
@@ -118,7 +118,9 @@
                 context.setObjectSource( (ObjectSource) utils.attachNode( context,
                                                                           new AlphaNode( context.getNextId(),
                                                                                          (AlphaNodeFieldConstraint) constraint,
-                                                                                         context.getObjectSource() ) ) );
+                                                                                         context.getObjectSource(),
+                                                                                         context.getRuleBase().getConfiguration().isAlphaMemory(),
+                                                                                         context.getRuleBase().getConfiguration().getAlphaNodeHashingThreshold()) ) );
             } else {
                 utils.checkUnboundDeclarations( context,
                                                 constraint.getRequiredDeclarations() );
