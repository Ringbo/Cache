diff --git a/graylog2-server/src/main/java/org/graylog2/web/ModuleFiles.java b/graylog2-server/src/main/java/org/graylog2/web/ModuleFiles.java
index b34ac87..2ba9f62 100644
--- a/graylog2-server/src/main/java/org/graylog2/web/ModuleFiles.java
+++ b/graylog2-server/src/main/java/org/graylog2/web/ModuleFiles.java
@@ -40,6 +40,6 @@
     public static ModuleFiles create(@JsonProperty("chunks") Map<String, ChunkDescription> chunks,
                                      @JsonProperty("js") List<String> jsFiles,
                                      @JsonProperty("css") List<String> cssFiles) {
-        return new AutoValue_PackageFiles(chunks, jsFiles, cssFiles);
+        return new AutoValue_ModuleFiles(chunks, jsFiles, cssFiles);
     }
 }
