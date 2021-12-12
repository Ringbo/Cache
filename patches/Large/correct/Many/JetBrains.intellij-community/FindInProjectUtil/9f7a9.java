diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java b/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java
index f418db4..43af897 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindInProjectUtil.java
@@ -299,7 +299,7 @@
         final TextRange range = new TextRange(result.getStartOffset(), result.getEndOffset());
         if (!((LocalSearchScope)customScope).containsRange(psiFile, range)) continue;
       }
-      UsageInfo info = new FindResultUsageInfo(findManager, psiFile, offset, findModel, result);
+      UsageInfo info = new FindResultUsageInfo(findManager, psiFile, prevOffset, findModel, result);
       if (!consumer.process(info)){
         throw new ProcessCanceledException();
       }
