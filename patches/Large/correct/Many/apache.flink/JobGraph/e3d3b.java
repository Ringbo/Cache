diff --git a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobGraph.java b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobGraph.java
index b206e52..16749b6 100644
--- a/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobGraph.java
+++ b/nephele/nephele-common/src/main/java/eu/stratosphere/nephele/jobgraph/JobGraph.java
@@ -770,7 +770,7 @@
 	public void read(final Kryo kryo, final Input input) {
 
 		// Read job id
-		this.jobID = kryo.readObjectOrNull(input, JobID.class);
+		this.jobID = kryo.readObject(input, JobID.class);
 
 		// Read the job name
 		this.jobName = input.readString();
