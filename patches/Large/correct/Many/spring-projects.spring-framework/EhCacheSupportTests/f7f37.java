diff --git a/spring-context-support/src/test/java/org/springframework/cache/ehcache/EhCacheSupportTests.java b/spring-context-support/src/test/java/org/springframework/cache/ehcache/EhCacheSupportTests.java
index ffee207..ac41151 100644
--- a/spring-context-support/src/test/java/org/springframework/cache/ehcache/EhCacheSupportTests.java
+++ b/spring-context-support/src/test/java/org/springframework/cache/ehcache/EhCacheSupportTests.java
@@ -1,5 +1,5 @@
 /*
- * Copyright 2002-2013 the original author or authors.
+ * Copyright 2002-2016 the original author or authors.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
@@ -119,7 +119,7 @@
 			assertTrue("Correct number of caches loaded", cm.getCacheNames().length == 1);
 			Cache myCache1 = cm.getCache("myCache1");
 			assertFalse("myCache1 is not eternal", myCache1.getCacheConfiguration().isEternal());
-			assertTrue("myCache1.maxElements == 300", myCache1.getCacheConfiguration().getMaxElementsInMemory() == 300);
+			assertTrue("myCache1.maxElements == 300", myCache1.getCacheConfiguration().getMaxEntriesLocalHeap() == 300);
 		}
 		finally {
 			cacheManagerFb.destroy();
@@ -162,10 +162,10 @@
 			CacheConfiguration config = cache.getCacheConfiguration();
 			assertEquals("myCache1", cache.getName());
 			if (useCacheManagerFb){
-				assertEquals("myCache1.maxElements", 300, config.getMaxElementsInMemory());
+				assertEquals("myCache1.maxElements", 300, config.getMaxEntriesLocalHeap());
 			}
 			else {
-				assertEquals("myCache1.maxElements", 10000, config.getMaxElementsInMemory());
+				assertEquals("myCache1.maxElements", 10000, config.getMaxEntriesLocalHeap());
 			}
 
 			// Cache region is not defined. Should create one with default properties.
@@ -178,7 +178,7 @@
 			cache = (Cache) cacheFb.getObject();
 			config = cache.getCacheConfiguration();
 			assertEquals("undefinedCache", cache.getName());
-			assertTrue("default maxElements is correct", config.getMaxElementsInMemory() == 10000);
+			assertTrue("default maxElements is correct", config.getMaxEntriesLocalHeap() == 10000);
 			assertFalse("default eternal is correct", config.isEternal());
 			assertTrue("default timeToLive is correct", config.getTimeToLiveSeconds() == 120);
 			assertTrue("default timeToIdle is correct", config.getTimeToIdleSeconds() == 120);
@@ -190,7 +190,7 @@
 				cacheFb.setCacheManager(cacheManagerFb.getObject());
 			}
 			cacheFb.setBeanName("undefinedCache2");
-			cacheFb.setMaxElementsInMemory(5);
+			cacheFb.setMaxEntriesLocalHeap(5);
 			cacheFb.setTimeToLive(8);
 			cacheFb.setTimeToIdle(7);
 			cacheFb.setDiskExpiryThreadIntervalSeconds(10);
@@ -199,7 +199,7 @@
 			config = cache.getCacheConfiguration();
 
 			assertEquals("undefinedCache2", cache.getName());
-			assertTrue("overridden maxElements is correct", config.getMaxElementsInMemory() == 5);
+			assertTrue("overridden maxElements is correct", config.getMaxEntriesLocalHeap() == 5);
 			assertTrue("default timeToLive is correct", config.getTimeToLiveSeconds() == 8);
 			assertTrue("default timeToIdle is correct", config.getTimeToIdleSeconds() == 7);
 			assertTrue("overridden diskExpiryThreadIntervalSeconds is correct", config.getDiskExpiryThreadIntervalSeconds() == 10);
@@ -253,7 +253,7 @@
 			cacheFb.afterPropertiesSet();
 			Ehcache myCache1 = cm.getEhcache("myCache1");
 			assertTrue(myCache1 instanceof SelfPopulatingCache);
-			assertEquals("myKey1", myCache1.get("myKey1").getValue());
+			assertEquals("myKey1", myCache1.get("myKey1").getObjectValue());
 		}
 		finally {
 			cacheManagerFb.destroy();
@@ -282,7 +282,7 @@
 			cacheFb.afterPropertiesSet();
 			Ehcache myCache1 = cm.getEhcache("myCache1");
 			assertTrue(myCache1 instanceof UpdatingSelfPopulatingCache);
-			assertEquals("myKey1", myCache1.get("myKey1").getValue());
+			assertEquals("myKey1", myCache1.get("myKey1").getObjectValue());
 		}
 		finally {
 			cacheManagerFb.destroy();
