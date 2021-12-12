diff --git a/src/com/facebook/buck/artifact_cache/TwoLevelArtifactCacheDecorator.java b/src/com/facebook/buck/artifact_cache/TwoLevelArtifactCacheDecorator.java
index e43c69b..40ed405 100644
--- a/src/com/facebook/buck/artifact_cache/TwoLevelArtifactCacheDecorator.java
+++ b/src/com/facebook/buck/artifact_cache/TwoLevelArtifactCacheDecorator.java
@@ -198,7 +198,8 @@
             return Futures.immediateFuture(null);
           }
           return delegate.store(info, output);
-        });
+        },
+        MoreExecutors.directExecutor());
   }
 
   /**
@@ -259,7 +260,8 @@
                 BorrowablePath.notBorrowablePath(emptyFilePath)),
             delegate.store(
                 ArtifactInfo.builder().addRuleKeys(new RuleKey(hashCode)).build(), output)),
-        Functions.constant(true));
+        Functions.constant(true),
+        MoreExecutors.directExecutor());
   }
 
   @Nonnull
