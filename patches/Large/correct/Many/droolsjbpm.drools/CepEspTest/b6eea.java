diff --git a/drools-compiler/src/test/java/org/drools/integrationtests/CepEspTest.java b/drools-compiler/src/test/java/org/drools/integrationtests/CepEspTest.java
index 140381d..7fcc3e3 100644
--- a/drools-compiler/src/test/java/org/drools/integrationtests/CepEspTest.java
+++ b/drools-compiler/src/test/java/org/drools/integrationtests/CepEspTest.java
@@ -451,7 +451,7 @@
 
         assertEquals( 1,
                       results_overlapped_by.size() );
-        assertEquals( tick7,
+        assertEquals( tick8,
                       results_overlapped_by.get( 0 ) );
 
         assertEquals( 1,
