diff --git a/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java b/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java
index 791a318..dde532d 100644
--- a/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java
+++ b/maven-model-builder/src/test/java/org/apache/maven/model/validation/DefaultModelValidatorTest.java
@@ -430,9 +430,9 @@
     {
         SimpleProblemCollector result = validate( "empty-module.xml" );
 
-        assertViolations( result, 0, 0, 1 );
+        assertViolations( result, 0, 1, 0 );
 
-        assertTrue( result.getWarnings().get( 0 ).contains( "'modules.module[0]' has been specified without a path" ) );
+        assertTrue( result.getErrors().get( 0 ).contains( "'modules.module[0]' has been specified without a path" ) );
     }
 
     public void testDuplicatePlugin()
