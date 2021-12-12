diff --git a/batch/batchlet-simple/src/test/java/org/javaee7/batch/batchlet/simple/MyBatchletTest.java b/batch/batchlet-simple/src/test/java/org/javaee7/batch/batchlet/simple/MyBatchletTest.java
index 58f927f..4907dba 100644
--- a/batch/batchlet-simple/src/test/java/org/javaee7/batch/batchlet/simple/MyBatchletTest.java
+++ b/batch/batchlet-simple/src/test/java/org/javaee7/batch/batchlet/simple/MyBatchletTest.java
@@ -27,7 +27,7 @@
         WebArchive war = ShrinkWrap.create(WebArchive.class).
                 addClass(MyBatchlet.class).
                 addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml")).
-                addAsManifestResource("META-INF/batch-jobs/myJob.xml", "batch-jobs/myJob.xml");
+                addAsResource("META-INF/batch-jobs/myJob.xml");
         System.out.println(war.toString(true));
         return war;
     }
