diff --git a/drools-core/src/main/java/org/drools/rule/EvalCondition.java b/drools-core/src/main/java/org/drools/rule/EvalCondition.java
index d38a3af..cf41566 100644
--- a/drools-core/src/main/java/org/drools/rule/EvalCondition.java
+++ b/drools-core/src/main/java/org/drools/rule/EvalCondition.java
@@ -79,7 +79,7 @@
                                              workingMemory,
                                              context );
         } catch ( final Exception e ) {
-        	throw new RuntimeDroolsException( this.getEvalExpression() + " : " + e );
+        	throw new RuntimeDroolsException( this.getEvalExpression() + " : " + e, e );
         }
     }
 
