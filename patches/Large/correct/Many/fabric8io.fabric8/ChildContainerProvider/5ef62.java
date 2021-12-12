diff --git a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
index 09daa0b..4d94d1e 100644
--- a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
+++ b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
@@ -59,7 +59,7 @@
                         .append(options.getJvmOpts()).append(" ")
                         .append(options.getZookeeperUrl() != null ? "-Dzookeeper.url=\"" + options.getZookeeperUrl() + "\"" : "");
 
-                if (!options.getJvmOpts().contains("-Xmx")) {
+                if (options.getJvmOpts() == null || !options.getJvmOpts().contains("-Xmx")) {
                     jvmOptsBuilder.append("-Xmx512m");
                 }
 
