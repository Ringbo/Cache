diff --git a/enterprise/ha/src/main/java/org/neo4j/kernel/ha/factory/HighlyAvailableEditionModule.java b/enterprise/ha/src/main/java/org/neo4j/kernel/ha/factory/HighlyAvailableEditionModule.java
index 5826d7b..cecb18d 100644
--- a/enterprise/ha/src/main/java/org/neo4j/kernel/ha/factory/HighlyAvailableEditionModule.java
+++ b/enterprise/ha/src/main/java/org/neo4j/kernel/ha/factory/HighlyAvailableEditionModule.java
@@ -187,7 +187,7 @@
     @Override
     public void registerEditionSpecificProcedures( Procedures procedures ) throws KernelException
     {
-        procedures.registerProcedure( org.neo4j.kernel.enterprise.builtinprocs.BuiltInProcedures.class );
+        procedures.registerProcedure( org.neo4j.kernel.enterprise.builtinprocs.BuiltInProcedures.class, true );
     }
 
     public HighlyAvailableEditionModule( final PlatformModule platformModule )
