diff --git a/drools-verifier/src/test/java/org/drools/verifier/VerifyingScopeTest.java b/drools-verifier/src/test/java/org/drools/verifier/VerifyingScopeTest.java
index f3e6b5a..5122bad 100644
--- a/drools-verifier/src/test/java/org/drools/verifier/VerifyingScopeTest.java
+++ b/drools-verifier/src/test/java/org/drools/verifier/VerifyingScopeTest.java
@@ -76,7 +76,7 @@
                       result.getBySeverity( Severity.ERROR ).size() );
         assertEquals( 0,
                       result.getBySeverity( Severity.WARNING ).size() );
-        assertEquals( 4,
+        assertEquals( 6,
                       result.getBySeverity( Severity.NOTE ).size() );
 
     }
