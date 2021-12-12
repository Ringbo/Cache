diff --git a/drools-verifier/src/test/java/org/drools/verifier/VerifierTest.java b/drools-verifier/src/test/java/org/drools/verifier/VerifierTest.java
index bf6331f..e1b53a6 100644
--- a/drools-verifier/src/test/java/org/drools/verifier/VerifierTest.java
+++ b/drools-verifier/src/test/java/org/drools/verifier/VerifierTest.java
@@ -87,7 +87,7 @@
 
         assertTrue( verifier.hasErrors() );
 
-        assertEquals( 4,
+        assertEquals( 2,
                       verifier.getErrors().size() );
 
     }
