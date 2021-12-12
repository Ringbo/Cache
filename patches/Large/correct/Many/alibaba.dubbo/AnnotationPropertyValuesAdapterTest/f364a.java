diff --git a/dubbo-config/dubbo-config-spring/src/test/java/org/apache/dubbo/config/spring/beans/factory/annotation/AnnotationPropertyValuesAdapterTest.java b/dubbo-config/dubbo-config-spring/src/test/java/org/apache/dubbo/config/spring/beans/factory/annotation/AnnotationPropertyValuesAdapterTest.java
index d5889fa..94148e6 100644
--- a/dubbo-config/dubbo-config-spring/src/test/java/org/apache/dubbo/config/spring/beans/factory/annotation/AnnotationPropertyValuesAdapterTest.java
+++ b/dubbo-config/dubbo-config-spring/src/test/java/org/apache/dubbo/config/spring/beans/factory/annotation/AnnotationPropertyValuesAdapterTest.java
@@ -113,7 +113,7 @@
         Assert.assertEquals("ondisconnect", referenceBean.getOndisconnect());
         Assert.assertEquals("owner", referenceBean.getOwner());
         Assert.assertEquals("layer", referenceBean.getLayer());
-        Assert.assertEquals(Integer.valueOf(2), referenceBean.getRetries());
+        Assert.assertEquals(Integer.valueOf(1), referenceBean.getRetries());
         Assert.assertEquals("random", referenceBean.getLoadbalance());
         Assert.assertEquals(true, referenceBean.isAsync());
         Assert.assertEquals(Integer.valueOf(1), referenceBean.getActives());
@@ -147,7 +147,7 @@
                 check = false, init = true, lazy = true, stubevent = true,
                 reconnect = "reconnect", sticky = true, proxy = "javassist", stub = "stub",
                 cluster = "failover", connections = 1, callbacks = 1, onconnect = "onconnect",
-                ondisconnect = "ondisconnect", owner = "owner", layer = "layer", retries = 2,
+                ondisconnect = "ondisconnect", owner = "owner", layer = "layer", retries = 1,
                 loadbalance = "random", async = true, actives = 1, sent = true,
                 mock = "mock", validation = "validation", timeout = 2, cache = "cache",
                 filter = {"default", "default"}, listener = {"default", "default"}, parameters = {"key1", "value1"}, application = "application",
