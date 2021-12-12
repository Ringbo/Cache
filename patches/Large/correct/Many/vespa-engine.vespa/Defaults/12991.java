diff --git a/defaults/src/main/java/com/yahoo/vespa/defaults/Defaults.java b/defaults/src/main/java/com/yahoo/vespa/defaults/Defaults.java
index 4ab6622..c32a80e 100644
--- a/defaults/src/main/java/com/yahoo/vespa/defaults/Defaults.java
+++ b/defaults/src/main/java/com/yahoo/vespa/defaults/Defaults.java
@@ -39,7 +39,7 @@
         vespaPortBase = findVespaPortBase(19000);
         vespaPortConfigServerRpc = findConfigServerPort(vespaPortBase + 70);
         vespaPortConfigServerHttp = vespaPortConfigServerRpc + 1;
-        vespaPortConfigProxyRpc = findConfigProxyPort(vespaPortBase + 91);
+        vespaPortConfigProxyRpc = findConfigProxyPort(vespaPortBase + 90);
     }
     static private String findVespaHome() {
         Optional<String> vespaHomeEnv = Optional.ofNullable(System.getenv("VESPA_HOME"));
