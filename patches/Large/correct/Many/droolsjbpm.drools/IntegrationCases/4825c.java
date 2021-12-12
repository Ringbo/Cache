diff --git a/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java b/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java
index e23f1f2..f4cef4b 100644
--- a/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java
+++ b/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java
@@ -2170,7 +2170,7 @@
         workingMemory.setGlobal( "list",
                                  new ArrayList() );
 
-        workingMemory.assertObject( new Integer( 5 ) );
+        workingMemory.assertObject( new  Person( "bob" ) );
 
         final byte[] wm = serializeOut( workingMemory );
 
