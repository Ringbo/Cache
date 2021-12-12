diff --git a/presto-main/src/main/java/com/facebook/presto/version/EmbedVersion.java b/presto-main/src/main/java/com/facebook/presto/version/EmbedVersion.java
index e85b51a..bbdfbab 100644
--- a/presto-main/src/main/java/com/facebook/presto/version/EmbedVersion.java
+++ b/presto-main/src/main/java/com/facebook/presto/version/EmbedVersion.java
@@ -82,7 +82,7 @@
         String configuredVersion = serverConfig.getPrestoVersion();
 
         String version = configuredVersion;
-        if (Objects.equals(builtInVersion, configuredVersion)) {
+        if (!Objects.equals(builtInVersion, configuredVersion)) {
             version = format("%s__%s", builtInVersion, configuredVersion);
         }
         return format("Presto_%s___", version);
