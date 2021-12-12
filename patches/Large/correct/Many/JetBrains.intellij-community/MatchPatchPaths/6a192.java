diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/MatchPatchPaths.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/MatchPatchPaths.java
index 7f8b2e8..5dee17f 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/MatchPatchPaths.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/patch/MatchPatchPaths.java
@@ -84,7 +84,7 @@
           for (VirtualFile file : files) {
             Pair<VirtualFile, Integer> pair = compareNamesImpl(strings, file, i);
             if (pair != null && pair.getSecond() < i) {
-              if (best == null || pair.getSecond() > best.getSecond()) {
+              if (best == null || pair.getSecond() < best.getSecond()) {
                 best = pair;
               }
             }
