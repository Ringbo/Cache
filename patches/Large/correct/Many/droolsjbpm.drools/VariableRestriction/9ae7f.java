diff --git a/drools-core/src/main/java/org/drools/rule/VariableRestriction.java b/drools-core/src/main/java/org/drools/rule/VariableRestriction.java
index 076834d..a69c7bd 100644
--- a/drools-core/src/main/java/org/drools/rule/VariableRestriction.java
+++ b/drools-core/src/main/java/org/drools/rule/VariableRestriction.java
@@ -101,7 +101,7 @@
                                         this.readAccessor,
                                         this.evaluator.prepareLeftObject( handle ),
                                         this.declaration.getExtractor(),
-                                        this.evaluator.prepareLeftObject( handle ) );
+                                        this.evaluator.prepareRightObject( handle ) );
     }
 
     public boolean isAllowedCachedLeft(final ContextEntry context,
