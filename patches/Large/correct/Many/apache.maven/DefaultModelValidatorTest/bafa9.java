diff --git a/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java b/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java
index 7866a52..ecd5d03 100644
--- a/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java
+++ b/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java
@@ -327,11 +327,11 @@
     {
         SimpleProblemCollector result = validate( "bad-dependency-scope.xml" );
 
-        assertViolations( result, 2, 0 );
+        assertViolations( result, 0, 2 );
 
-        assertTrue( result.getErrors().get( 0 ).contains( "test:f" ) );
+        assertTrue( result.getWarnings().get( 0 ).contains( "test:f" ) );
 
-        assertTrue( result.getErrors().get( 1 ).contains( "test:g" ) );
+        assertTrue( result.getWarnings().get( 1 ).contains( "test:g" ) );
     }
 
 }
