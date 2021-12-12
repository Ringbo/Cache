diff --git a/h2o-core/src/main/java/water/api/JobsHandler.java b/h2o-core/src/main/java/water/api/JobsHandler.java
index 77a9cb7..ad7fc88 100644
--- a/h2o-core/src/main/java/water/api/JobsHandler.java
+++ b/h2o-core/src/main/java/water/api/JobsHandler.java
@@ -17,7 +17,7 @@
 
 
   @SuppressWarnings("unused") // called through reflection by RequestServer
-  public Schema list(int version, JobsV3 s) {
+  public JobsV3 list(int version, JobsV3 s) {
     Job[] jobs = Job.jobs();
     // Jobs j = new Jobs();
     // j._jobs = Job.jobs();
@@ -44,7 +44,7 @@
   }
 
   @SuppressWarnings("unused") // called through reflection by RequestServer
-  public Schema fetch(int version, JobsV3 s) {
+  public JobsV3 fetch(int version, JobsV3 s) {
     Key key = s.job_id.key();
     Value val = DKV.get(key);
     if( null == val ) throw new IllegalArgumentException("Job is missing");
@@ -74,7 +74,7 @@
     return s;
   }
 
-  public Schema cancel(int version, JobsV3 c) {
+  public JobsV3 cancel(int version, JobsV3 c) {
     Job j = DKV.getGet(c.job_id.key());
     if (j == null) {
       throw new IllegalArgumentException("No job with key " + c.job_id.key());
