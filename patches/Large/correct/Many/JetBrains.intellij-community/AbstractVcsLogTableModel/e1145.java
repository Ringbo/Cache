diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/tables/AbstractVcsLogTableModel.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/tables/AbstractVcsLogTableModel.java
index 1e26910..25c0397 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/tables/AbstractVcsLogTableModel.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/tables/AbstractVcsLogTableModel.java
@@ -14,9 +14,9 @@
 import java.util.List;
 
 /**
- * @param <T> commit column class
+ * @param <CommitColumnClass> commit column class
  */
-public abstract class AbstractVcsLogTableModel<T> extends AbstractTableModel {
+public abstract class AbstractVcsLogTableModel<CommitColumnClass> extends AbstractTableModel {
 
   public static final VirtualFile FAKE_ROOT = NullVirtualFile.INSTANCE;
 
@@ -80,10 +80,10 @@
   protected abstract VirtualFile getRoot(int rowIndex);
 
   @NotNull
-  protected abstract T getCommitColumnCell(int index, @Nullable VcsShortCommitDetails details);
+  protected abstract CommitColumnClass getCommitColumnCell(int index, @Nullable VcsShortCommitDetails details);
 
   @NotNull
-  protected abstract Class<T> getCommitColumnClass();
+  protected abstract Class<CommitColumnClass> getCommitColumnClass();
 
   /**
    * Returns the Hash of the commit displayed in the given row.
