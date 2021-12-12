diff --git a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/batch/BasicBatchConfigurer.java b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/batch/BasicBatchConfigurer.java
index 219c0d1..ea54654 100644
--- a/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/batch/BasicBatchConfigurer.java
+++ b/spring-boot-autoconfigure/src/main/java/org/springframework/boot/autoconfigure/batch/BasicBatchConfigurer.java
@@ -66,7 +66,7 @@
 	 * @param properties the batch properties
 	 * @param dataSource the underlying data source
 	 */
-	BasicBatchConfigurer(BatchProperties properties, DataSource dataSource) {
+	protected BasicBatchConfigurer(BatchProperties properties, DataSource dataSource) {
 		this(properties, dataSource, null);
 	}
 
@@ -76,7 +76,7 @@
 	 * @param dataSource the underlying data source
 	 * @param entityManagerFactory the entity manager factory (or {@code null})
 	 */
-	BasicBatchConfigurer(BatchProperties properties, DataSource dataSource,
+	protected BasicBatchConfigurer(BatchProperties properties, DataSource dataSource,
 			EntityManagerFactory entityManagerFactory) {
 		this.properties = properties;
 		this.entityManagerFactory = entityManagerFactory;
@@ -116,7 +116,7 @@
 		}
 	}
 
-	private JobExplorer createJobExplorer() throws Exception {
+	protected JobExplorer createJobExplorer() throws Exception {
 		JobExplorerFactoryBean jobExplorerFactoryBean = new JobExplorerFactoryBean();
 		jobExplorerFactoryBean.setDataSource(this.dataSource);
 		String tablePrefix = this.properties.getTablePrefix();
@@ -127,7 +127,7 @@
 		return jobExplorerFactoryBean.getObject();
 	}
 
-	private JobLauncher createJobLauncher() throws Exception {
+	protected JobLauncher createJobLauncher() throws Exception {
 		SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
 		jobLauncher.setJobRepository(getJobRepository());
 		jobLauncher.afterPropertiesSet();
