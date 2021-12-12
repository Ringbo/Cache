diff --git a/vcs-api/src/com/intellij/openapi/vcs/history/VcsHistorySession.java b/vcs-api/src/com/intellij/openapi/vcs/history/VcsHistorySession.java
index 3ea2fc2..7be4ac0 100644
--- a/vcs-api/src/com/intellij/openapi/vcs/history/VcsHistorySession.java
+++ b/vcs-api/src/com/intellij/openapi/vcs/history/VcsHistorySession.java
@@ -22,7 +22,7 @@
 
 public abstract class VcsHistorySession {
   private final List<VcsFileRevision> myRevisions;
-  private VcsRevisionNumber myCachedRevisionNumber;
+  private volatile VcsRevisionNumber myCachedRevisionNumber;
 
   public VcsHistorySession(List<VcsFileRevision> revisions) {
     myRevisions = revisions;
@@ -46,7 +46,7 @@
   @Nullable
   protected abstract VcsRevisionNumber calcCurrentRevisionNumber();
 
-  public synchronized final VcsRevisionNumber getCurrentRevisionNumber(){
+  public final VcsRevisionNumber getCurrentRevisionNumber() {
     return myCachedRevisionNumber;
   }
 
