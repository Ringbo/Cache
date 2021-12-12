diff --git a/src/main/java/com/gitblit/manager/RepositoryManager.java b/src/main/java/com/gitblit/manager/RepositoryManager.java
index e2e4de6..e9bf5b8 100644
--- a/src/main/java/com/gitblit/manager/RepositoryManager.java
+++ b/src/main/java/com/gitblit/manager/RepositoryManager.java
@@ -1922,7 +1922,7 @@
 		cfg.setPackedGitWindowSize(settings.getFilesize(Keys.git.packedGitWindowSize, cfg.getPackedGitWindowSize()));
 		cfg.setPackedGitLimit(settings.getFilesize(Keys.git.packedGitLimit, cfg.getPackedGitLimit()));
 		cfg.setDeltaBaseCacheLimit(settings.getFilesize(Keys.git.deltaBaseCacheLimit, cfg.getDeltaBaseCacheLimit()));
-		cfg.setPackedGitOpenFiles(settings.getFilesize(Keys.git.packedGitOpenFiles, cfg.getPackedGitOpenFiles()));
+		cfg.setPackedGitOpenFiles(settings.getInteger(Keys.git.packedGitOpenFiles, cfg.getPackedGitOpenFiles()));
 		cfg.setPackedGitMMAP(settings.getBoolean(Keys.git.packedGitMmap, cfg.isPackedGitMMAP()));
 
 		try {
