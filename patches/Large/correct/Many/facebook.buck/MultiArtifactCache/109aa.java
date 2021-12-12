diff --git a/src/com/facebook/buck/artifact_cache/MultiArtifactCache.java b/src/com/facebook/buck/artifact_cache/MultiArtifactCache.java
index c3f9ddd..15c986b 100644
--- a/src/com/facebook/buck/artifact_cache/MultiArtifactCache.java
+++ b/src/com/facebook/buck/artifact_cache/MultiArtifactCache.java
@@ -74,7 +74,7 @@
               .addRuleKeys(ruleKey)
               .setMetadata(cacheResult.getMetadata())
               .build(),
-          BorrowablePath.borrowablePath(output.getUnchecked()));
+          BorrowablePath.notBorrowablePath(output.getUnchecked()));
     }
     return cacheResult;
   }
