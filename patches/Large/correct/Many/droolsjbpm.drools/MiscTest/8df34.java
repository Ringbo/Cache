diff --git a/drools-compiler/src/test/java/org/drools/integrationtests/MiscTest.java b/drools-compiler/src/test/java/org/drools/integrationtests/MiscTest.java
index c17db1d..2c939d4 100644
--- a/drools-compiler/src/test/java/org/drools/integrationtests/MiscTest.java
+++ b/drools-compiler/src/test/java/org/drools/integrationtests/MiscTest.java
@@ -2586,7 +2586,7 @@
 
         final DroolsError errs[] = builder.getErrors().getErrors();
 
-        assertEquals( 3,
+        assertEquals( 4,
                       builder.getErrors().getErrors().length );
 
         // check that its getting it from the ruleDescr
@@ -2598,7 +2598,7 @@
 
         // now check the RHS, not being too specific yet, as long as it has the
         // rules line number, not zero
-        final DescrBuildError rhs = (DescrBuildError) builder.getErrors().getErrors()[2];
+        final DescrBuildError rhs = (DescrBuildError) builder.getErrors().getErrors()[3];
         assertTrue( rhs.getLine() > 7 ); // not being too specific - may need to
         // change this when we rework the error
         // reporting
@@ -2858,8 +2858,7 @@
             workingMemory.fireAllRules();
             fail( "Should throw an Exception from the Predicate" );
         } catch ( final Exception e ) {
-            assertEquals( "this should throw an exception",
-                          e.getCause().getMessage() );
+            assertTrue( e.getCause().getMessage().startsWith( "[Error: throwException( type1 ): this should throw an exception]" ) );
         }
     }
 
