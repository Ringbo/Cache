diff --git a/components/camel-caffeine/src/test/java/org/apache/camel/component/caffeine/loadcache/CaffeineLoadCacheProducerTest.java b/components/camel-caffeine/src/test/java/org/apache/camel/component/caffeine/loadcache/CaffeineLoadCacheProducerTest.java
index b2d6a5d..cc7cee8 100644
--- a/components/camel-caffeine/src/test/java/org/apache/camel/component/caffeine/loadcache/CaffeineLoadCacheProducerTest.java
+++ b/components/camel-caffeine/src/test/java/org/apache/camel/component/caffeine/loadcache/CaffeineLoadCacheProducerTest.java
@@ -100,12 +100,12 @@
     public void testCacheGet() throws Exception {
         final Cache<Object, Object> cache = getTestCache();
         final Integer key = 1;
-        final Integer val = 1;
+        final Integer val = 2;
 
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.expectedMinimumMessageCount(1);
         mock.expectedBodiesReceived(val);
-        mock.expectedHeaderReceived(CaffeineConstants.ACTION_HAS_RESULT, false);
+        mock.expectedHeaderReceived(CaffeineConstants.ACTION_HAS_RESULT, true);
         mock.expectedHeaderReceived(CaffeineConstants.ACTION_SUCCEEDED, true);
 
         fluentTemplate().withHeader(CaffeineConstants.ACTION, CaffeineConstants.ACTION_GET).withHeader(CaffeineConstants.KEY, key).withBody(val).to("direct://start").send();
