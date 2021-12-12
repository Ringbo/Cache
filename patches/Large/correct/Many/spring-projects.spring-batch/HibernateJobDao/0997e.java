diff --git a/execution/src/main/java/org/springframework/batch/execution/repository/dao/HibernateJobDao.java b/execution/src/main/java/org/springframework/batch/execution/repository/dao/HibernateJobDao.java
index 4ea5947..4f54c31 100644
--- a/execution/src/main/java/org/springframework/batch/execution/repository/dao/HibernateJobDao.java
+++ b/execution/src/main/java/org/springframework/batch/execution/repository/dao/HibernateJobDao.java
@@ -68,7 +68,7 @@
 	 */
 	public List findJobs(JobIdentifier jobIdentifier) {
 
-		final ScheduledJobIdentifier jobRuntimeInformation = (ScheduledJobIdentifier) jobIdentifier;
+		final JobIdentifier jobRuntimeInformation = jobIdentifier;
 
 		validateJobIdentifier(jobRuntimeInformation);
 
@@ -201,8 +201,8 @@
 	private void validateJobIdentifier(JobIdentifier jobIdentifier) {
 
 		Assert.notNull(jobIdentifier, "JobRuntimeInformation cannot be null.");
-		Assert.notNull(jobIdentifier.getName(),
-				"JobRuntimeInformation name cannot be null.");
+		Assert.hasText(jobIdentifier.getName(),
+				"JobRuntimeInformation name cannot be null or empty.");
 
 		if (jobIdentifier instanceof ScheduledJobIdentifier) {
 			ScheduledJobIdentifier jobRuntimeInformation = (ScheduledJobIdentifier) jobIdentifier;
