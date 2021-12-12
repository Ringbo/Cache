diff --git a/batch/chunk-simple/src/test/java/org/javaee7/batch/chunk/simple/ChunkSimpleTest.java b/batch/chunk-simple/src/test/java/org/javaee7/batch/chunk/simple/ChunkSimpleTest.java
index c53ee43..ebe694b 100644
--- a/batch/chunk-simple/src/test/java/org/javaee7/batch/chunk/simple/ChunkSimpleTest.java
+++ b/batch/chunk-simple/src/test/java/org/javaee7/batch/chunk/simple/ChunkSimpleTest.java
@@ -36,7 +36,7 @@
                                    .addClass(MyItemWriter.class)
                                    .addClass(MyOutputRecord.class)
                                    .addAsWebInfResource(EmptyAsset.INSTANCE, ArchivePaths.create("beans.xml"))
-                                   .addAsManifestResource("META-INF/batch-jobs/myJob.xml", "batch-jobs/myJob.xml");
+                                   .addAsResource("META-INF/batch-jobs/myJob.xml");
         System.out.println(war.toString(true));
         return war;
     }
