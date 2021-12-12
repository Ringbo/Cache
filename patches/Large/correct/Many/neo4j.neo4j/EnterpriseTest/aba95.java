diff --git a/enterprise/procedure-compiler-enterprise-tests/src/test/java/org/neo4j/tooling/procedure/EnterpriseTest.java b/enterprise/procedure-compiler-enterprise-tests/src/test/java/org/neo4j/tooling/procedure/EnterpriseTest.java
index 6f92d9f..edf5768 100644
--- a/enterprise/procedure-compiler-enterprise-tests/src/test/java/org/neo4j/tooling/procedure/EnterpriseTest.java
+++ b/enterprise/procedure-compiler-enterprise-tests/src/test/java/org/neo4j/tooling/procedure/EnterpriseTest.java
@@ -58,12 +58,12 @@
                 "@org.neo4j.procedure.Context usage warning: found unsupported restricted type <org.neo4j.kernel.enterprise.api.security.EnterpriseAuthManager> on EnterpriseProcedure#enterpriseAuthManager.\n" +
                         "  The procedure will not load unless declared via the configuration option 'dbms.security.procedures.unrestricted'.\n" +
                         "  You can ignore this warning by passing the option -AIgnoreContextWarnings to the Java compiler" )
-                .in( sproc ).onLine( 36 );
+                .in( sproc ).onLine( 39 );
         warningCompilationClause.withWarningContaining(
                 "@org.neo4j.procedure.Context usage warning: found unsupported restricted type <org.neo4j.server.security.enterprise.log.SecurityLog> on EnterpriseProcedure#securityLog.\n" +
                         "  The procedure will not load unless declared via the configuration option 'dbms.security.procedures.unrestricted'.\n" +
                         "  You can ignore this warning by passing the option -AIgnoreContextWarnings to the Java compiler" )
-                .in( sproc ).onLine( 39 );
+                .in( sproc ).onLine( 42 );
     }
 
     @Test
