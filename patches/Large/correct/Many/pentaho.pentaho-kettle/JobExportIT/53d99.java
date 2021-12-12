diff --git a/engine/src/it/java/org/pentaho/di/job/JobExportIT.java b/engine/src/it/java/org/pentaho/di/job/JobExportIT.java
index 68313a3..3c683e7 100644
--- a/engine/src/it/java/org/pentaho/di/job/JobExportIT.java
+++ b/engine/src/it/java/org/pentaho/di/job/JobExportIT.java
@@ -56,10 +56,10 @@
   private static final String FILE_REPOSITORY_DESC = "File repository";
 
   private static final String EXPORT_FILE_NAME = "sample_job_export.zip";
-  private static final String EXPORT_DIR = "test-src/org/pentaho/di/job/out/";
+  private static final String EXPORT_DIR = "target/export/org/pentaho/di/job/out/";
   private static final String EXPORT_FILE = EXPORT_DIR + EXPORT_FILE_NAME;
 
-  private static final String REPOSITORY_ROOT_DIR = "test-src/org/pentaho/di/job/repo";
+  private static final String REPOSITORY_ROOT_DIR = "src/it/resources/org/pentaho/di/job/repo";
   private static final String REPOSITORY_DIR = "/folder";
   private static final String JOB_NAME = "sample_job";
   private static final String EXTRACT_DIR = EXPORT_DIR + File.separator + JOB_NAME;
@@ -71,7 +71,7 @@
   @BeforeClass
   public static void setUpOnce() throws KettleException {
     deleteFolder( new File( EXPORT_DIR ) );
-    new File( EXPORT_DIR ).mkdir();
+    new File( EXPORT_DIR ).mkdirs();
 
     KettleEnvironment.init();
   }
