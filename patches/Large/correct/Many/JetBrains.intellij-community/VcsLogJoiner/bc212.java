diff --git a/platform/dvcs/vcs-log/vcs-log-data/src/org/hanuna/gitalk/data/VcsLogJoiner.java b/platform/dvcs/vcs-log/vcs-log-data/src/org/hanuna/gitalk/data/VcsLogJoiner.java
index 5d46bb7..57fe134 100644
--- a/platform/dvcs/vcs-log/vcs-log-data/src/org/hanuna/gitalk/data/VcsLogJoiner.java
+++ b/platform/dvcs/vcs-log/vcs-log-data/src/org/hanuna/gitalk/data/VcsLogJoiner.java
@@ -41,7 +41,7 @@
    */
   @NotNull
   public List<? extends CommitParents> addCommits(@NotNull List<CommitParents> savedLog,
-                                                  @NotNull List<? extends VcsCommitDetails> firstBlock, @NotNull Collection<Ref> refs,
+                                                  @NotNull List<? extends CommitParents> firstBlock, @NotNull Collection<Ref> refs,
                                                   @NotNull Computable<List<CommitParents>> wholeLogGetter) {
     // TODO
     return firstBlock;
