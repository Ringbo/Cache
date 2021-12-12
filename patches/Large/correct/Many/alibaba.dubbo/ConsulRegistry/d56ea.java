diff --git a/dubbo-registry/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java b/dubbo-registry/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java
index e4832ac..2a8bc1c 100644
--- a/dubbo-registry/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java
+++ b/dubbo-registry/dubbo-registry-consul/src/main/java/org/apache/dubbo/registry/consul/ConsulRegistry.java
@@ -275,7 +275,7 @@
         service.setAddress(url.getHost());
         service.setPort(url.getPort());
         service.setId(buildId(url));
-        service.setName(url.getServiceInterface());
+        service.setName(url.getServiceKey());
         service.setCheck(buildCheck(url));
         service.setTags(buildTags(url));
         service.setMeta(Collections.singletonMap(URL_META_KEY, url.toFullString()));
