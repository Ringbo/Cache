diff --git a/engine/test-src/org/pentaho/di/trans/steps/metainject/MetaInjectTest.java b/engine/test-src/org/pentaho/di/trans/steps/metainject/MetaInjectTest.java
index 4edb06a..f51e70e 100644
--- a/engine/test-src/org/pentaho/di/trans/steps/metainject/MetaInjectTest.java
+++ b/engine/test-src/org/pentaho/di/trans/steps/metainject/MetaInjectTest.java
@@ -188,18 +188,18 @@
   }
 
   @Test
-  public void initReturnsFalseOnInaccessibleSourceStep() {
+  public void initReturnsTrueOnInaccessibleSourceStep() {
     Map<TargetStepAttribute, SourceStepField> targetMap =
         Collections.singletonMap( new TargetStepAttribute( INJECTOR_STEP_NAME, TEST_ATTR_VALUE, false ),
             new SourceStepField( TEST_SOURCE_STEP_NAME, TEST_FIELD ) );
     MetaInjectMeta spyMeta = spy( meta );
     doReturn( targetMap ).when( spyMeta ).getTargetSourceMapping();
 
-    assertFalse( metaInject.init( spyMeta, data ) );
+    assertTrue( metaInject.init( spyMeta, data ) );
   }
 
   @Test
-  public void initReturnsFalseOnInaccessibleTargetStep() {
+  public void initReturnsTrueOnInaccessibleTargetStep() {
     doReturn( new String[] { TEST_SOURCE_STEP_NAME } ).when( transMeta ).getPrevStepNames( any( StepMeta.class ) );
 
     Map<TargetStepAttribute, SourceStepField> targetMap =
@@ -208,7 +208,7 @@
     MetaInjectMeta spyMeta = spy( meta );
     doReturn( targetMap ).when( spyMeta ).getTargetSourceMapping();
 
-    assertFalse( metaInject.init( spyMeta, data ) );
+    assertTrue( metaInject.init( spyMeta, data ) );
   }
 
   @Test
