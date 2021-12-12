diff --git a/services/src/main/java/io/druid/cli/CliBridge.java b/services/src/main/java/io/druid/cli/CliBridge.java
index 6da1ec2..a1f893f 100644
--- a/services/src/main/java/io/druid/cli/CliBridge.java
+++ b/services/src/main/java/io/druid/cli/CliBridge.java
@@ -71,7 +71,7 @@
           public void configure(Binder binder)
           {
             binder.bindConstant().annotatedWith(Names.named("serviceName")).to("druid/bridge");
-            binder.bindConstant().annotatedWith(Names.named("servicePort")).to(8081);
+            binder.bindConstant().annotatedWith(Names.named("servicePort")).to(8089);
 
             ConfigProvider.bind(binder, BridgeCuratorConfig.class);
 
