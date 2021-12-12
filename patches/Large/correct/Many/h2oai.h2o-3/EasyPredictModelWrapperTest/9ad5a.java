diff --git a/h2o-genmodel/src/test/java/hex/genmodel/easy/EasyPredictModelWrapperTest.java b/h2o-genmodel/src/test/java/hex/genmodel/easy/EasyPredictModelWrapperTest.java
index 97844c3..c031517 100644
--- a/h2o-genmodel/src/test/java/hex/genmodel/easy/EasyPredictModelWrapperTest.java
+++ b/h2o-genmodel/src/test/java/hex/genmodel/easy/EasyPredictModelWrapperTest.java
@@ -159,7 +159,7 @@
 
   @Test
   public void testSerializeWrapper() throws Exception {
-    MyModel rawModel = makeModel();
+    SupervisedModel rawModel = makeSupervisedModel();
     EasyPredictModelWrapper m = new EasyPredictModelWrapper(rawModel);
 
     Assert.assertTrue(m instanceof Serializable);
@@ -170,7 +170,7 @@
 
   @Test
   public void testSerializeWrapperWithCountingConsumer() throws Exception {
-    MyModel rawModel = makeModel();
+    SupervisedModel rawModel = makeSupervisedModel();
     CountingErrorConsumer countingErrorConsumer = new CountingErrorConsumer(rawModel);
     EasyPredictModelWrapper m = new EasyPredictModelWrapper(new EasyPredictModelWrapper.Config()
             .setModel(rawModel)
