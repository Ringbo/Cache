diff --git a/config-model/src/main/java/com/yahoo/vespa/model/builder/xml/dom/DomAdminV2Builder.java b/config-model/src/main/java/com/yahoo/vespa/model/builder/xml/dom/DomAdminV2Builder.java
index 2313a2f..75cd755 100644
--- a/config-model/src/main/java/com/yahoo/vespa/model/builder/xml/dom/DomAdminV2Builder.java
+++ b/config-model/src/main/java/com/yahoo/vespa/model/builder/xml/dom/DomAdminV2Builder.java
@@ -168,7 +168,7 @@
         public ConfigserverBuilder(int i, List<ConfigServerSpec> configServerSpec) {
             this.i = i;
             Objects.requireNonNull(configServerSpec);
-            if (configServerSpec.size() > 1)
+            if (configServerSpec.size() > 0)
                 this.rpcPort = configServerSpec.get(0).getConfigServerPort();
             else
                 this.rpcPort = Configserver.defaultRpcPort;
