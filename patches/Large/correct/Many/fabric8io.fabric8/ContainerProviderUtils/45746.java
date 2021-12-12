diff --git a/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerProviderUtils.java b/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerProviderUtils.java
index f433d33..511abd8 100644
--- a/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerProviderUtils.java
+++ b/fabric/fabric-core/src/main/java/org/fusesource/fabric/internal/ContainerProviderUtils.java
@@ -148,7 +148,7 @@
         replaceLineInFile(sb, "etc/system.properties", "karaf.name=root", "karaf.name=" + name);
         for (Map.Entry<String, String> entry : options.getDataStoreProperties().entrySet()) {
             String key = entry.getKey();
-            String value = entry.getKey();
+            String value = entry.getValue();
             replacePropertyValue(sb, "etc/" + DATASTORE_TYPE_PID + ".cfg", key, value);
         }
         //Apply port range
