diff --git a/src/test/java/org/springframework/site/integration/BasicAcceptanceTests.java b/src/test/java/org/springframework/site/integration/BasicAcceptanceTests.java
index e2d7b91..b37bf4e 100644
--- a/src/test/java/org/springframework/site/integration/BasicAcceptanceTests.java
+++ b/src/test/java/org/springframework/site/integration/BasicAcceptanceTests.java
@@ -42,7 +42,7 @@
 							@Override
 							public ConfigurableApplicationContext call() throws Exception {
 								return (ConfigurableApplicationContext) ApplicationConfiguration
-										.build(ElasticsearchStubConfiguration.class).run("--server.port=" + PORT);
+										.build(ElasticsearchStubConfiguration.class).run("--server.port=" + PORT, "--spring.database.url=jdbc:hsqldb:mem:acceptancetestdb");
 							}
 						});
 		context = future.get(30, TimeUnit.SECONDS);
