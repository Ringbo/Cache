diff --git a/src/com/facebook/buck/rules/CassandraArtifactCache.java b/src/com/facebook/buck/rules/CassandraArtifactCache.java
index e897483..41faa34 100644
--- a/src/com/facebook/buck/rules/CassandraArtifactCache.java
+++ b/src/com/facebook/buck/rules/CassandraArtifactCache.java
@@ -165,7 +165,7 @@
       m.withRow(CF_ARTIFACT, ruleKey.toString())
           .setDefaultTtl(ttl)
           .putColumn(artifactColumnName, Files.toByteArray(output));
-      m.execute();
+      m.executeAsync();
     } catch (IOException | ConnectionException | OutOfMemoryError e) {
       logger.warning(String.format("Artifact store(%s, %s) error: %s",
           ruleKey,
