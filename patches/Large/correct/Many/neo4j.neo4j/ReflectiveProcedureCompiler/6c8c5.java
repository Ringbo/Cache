diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/proc/ReflectiveProcedureCompiler.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/proc/ReflectiveProcedureCompiler.java
index d58cd39..ede42e9 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/proc/ReflectiveProcedureCompiler.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/proc/ReflectiveProcedureCompiler.java
@@ -395,13 +395,13 @@
         if ( !Modifier.isPublic( update.getModifiers() ) )
         {
             throw new ProcedureException( Status.Procedure.ProcedureRegistrationFailed,
-                    "Aggregation update method '%s' in %s must be public.", method.getName(),
+                    "Aggregation update method '%s' in %s must be public.", update.getName(),
                     aggregator.getSimpleName() );
         }
         if ( !Modifier.isPublic( result.getModifiers() ) )
         {
             throw new ProcedureException( Status.Procedure.ProcedureRegistrationFailed,
-                    "Aggregation result method '%s' in %s must be public.", method.getName(),
+                    "Aggregation result method '%s' in %s must be public.", result.getName(),
                     aggregator.getSimpleName() );
         }
 
