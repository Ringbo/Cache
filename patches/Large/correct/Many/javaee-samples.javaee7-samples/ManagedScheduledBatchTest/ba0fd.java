diff --git a/batch/scheduling/src/test/java/org/javaee7/batch/samples/scheduling/ManagedScheduledBatchTest.java b/batch/scheduling/src/test/java/org/javaee7/batch/samples/scheduling/ManagedScheduledBatchTest.java
index 275b057..5dc046b 100644
--- a/batch/scheduling/src/test/java/org/javaee7/batch/samples/scheduling/ManagedScheduledBatchTest.java
+++ b/batch/scheduling/src/test/java/org/javaee7/batch/samples/scheduling/ManagedScheduledBatchTest.java
@@ -61,7 +61,7 @@
                 MyManagedScheduledBatchBean.class,
                 MyManagedScheduledBatchAlternative.class)
             .addAsWebInfResource(
-                new StringAsset(beansXml.createAlternatives().clazz(
+                new StringAsset(beansXml.getOrCreateAlternatives().clazz(
                     MyManagedScheduledBatchAlternative.class.getName()).up().exportAsString()),
                 beansXml.getDescriptorName())
             .addAsResource("META-INF/batch-jobs/myJob.xml");
