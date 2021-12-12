diff --git a/eureka-client/src/test/java/com/netflix/discovery/shared/transport/EurekaHttpClientsTest.java b/eureka-client/src/test/java/com/netflix/discovery/shared/transport/EurekaHttpClientsTest.java
index eedca1a..99edacb 100644
--- a/eureka-client/src/test/java/com/netflix/discovery/shared/transport/EurekaHttpClientsTest.java
+++ b/eureka-client/src/test/java/com/netflix/discovery/shared/transport/EurekaHttpClientsTest.java
@@ -159,7 +159,7 @@
         when(clientConfig.getRegion()).thenReturn("us-east-1");
 
         when(transportConfig.getWriteClusterVip()).thenReturn(vipAddress);
-        when(transportConfig.getAsyncExecutorThreadPoolSize()).thenReturn(3);
+        when(transportConfig.getAsyncExecutorThreadPoolSize()).thenReturn(4);
         when(transportConfig.getAsyncResolverRefreshIntervalMs()).thenReturn(300);
         when(transportConfig.getAsyncResolverWarmUpTimeoutMs()).thenReturn(200);
 
@@ -195,10 +195,10 @@
             endpoints = resolver.getClusterEndpoints();
             assertThat(endpoints.size(), equalTo(applications.getInstancesByVirtualHostName(vipAddress).size()));
 
-            // wait for the third cycle that hits the app source
+            // wait for the third cycle that triggers the mock http client (which is the third resolver cycle)
             // for the third cycle we have mocked the application resolver to return null data so should fall back
             // to calling the remote resolver again (which should return applications2)
-            verify(applicationsSource, timeout(1000).times(3)).getApplications(anyInt(), eq(TimeUnit.SECONDS));
+            verify(mockHttpClient, timeout(1000).times(3)).getVip(anyString());
             endpoints = resolver.getClusterEndpoints();
             assertThat(endpoints.size(), equalTo(applications2.getInstancesByVirtualHostName(vipAddress).size()));
         } finally {
