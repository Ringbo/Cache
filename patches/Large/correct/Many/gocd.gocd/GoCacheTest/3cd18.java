diff --git a/server/test/integration/com/thoughtworks/go/server/cache/GoCacheTest.java b/server/test/integration/com/thoughtworks/go/server/cache/GoCacheTest.java
index 8c20e63..1e55e4a 100644
--- a/server/test/integration/com/thoughtworks/go/server/cache/GoCacheTest.java
+++ b/server/test/integration/com/thoughtworks/go/server/cache/GoCacheTest.java
@@ -331,7 +331,7 @@
         goCache.put(parentKey, "child1", "value");
         assertThat(goCache.get(parentKey), is(not(nullValue())));
         assertThat(goCache.get(parentKey + GoCache.SUB_KEY_DELIMITER + "child1"), is(not(nullValue())));
-        Thread.sleep(1000);// wait for cache elements to expire
+        Thread.sleep(2000);// wait for cache elements to expire
 
         goCache.put(parentKey, "child2", "value");
         assertThat(goCache.get(parentKey), is(not(nullValue())));
