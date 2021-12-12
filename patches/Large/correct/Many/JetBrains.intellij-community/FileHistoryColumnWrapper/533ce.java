diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/history/FileHistoryColumnWrapper.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/history/FileHistoryColumnWrapper.java
index 7fcb885..455b26b 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/history/FileHistoryColumnWrapper.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/history/FileHistoryColumnWrapper.java
@@ -30,7 +30,7 @@
 import java.util.Comparator;
 import java.util.Enumeration;
 
-abstract class FileHistoryColumnWrapper<T> extends DualViewColumnInfo<TreeNodeOnVcsRevision, Object> {
+abstract class FileHistoryColumnWrapper<T> extends DualViewColumnInfo<TreeNodeOnVcsRevision, T> {
   @NotNull private final ColumnInfo<VcsFileRevision, T> myBaseColumn;
 
   public FileHistoryColumnWrapper(@NotNull ColumnInfo<VcsFileRevision, T> additionalColumn) {
@@ -66,9 +66,9 @@
     return myBaseColumn.isCellEditable(o.getRevision());
   }
 
-  public void setValue(TreeNodeOnVcsRevision o, Object aValue) {
+  public void setValue(TreeNodeOnVcsRevision o, T aValue) {
     //noinspection unchecked
-    myBaseColumn.setValue(o.getRevision(), (T)aValue);
+    myBaseColumn.setValue(o.getRevision(), aValue);
   }
 
   public TableCellRenderer getRenderer(TreeNodeOnVcsRevision p0) {
@@ -132,7 +132,7 @@
     return true;
   }
 
-  public Object valueOf(TreeNodeOnVcsRevision o) {
+  public T valueOf(TreeNodeOnVcsRevision o) {
     return myBaseColumn.valueOf(o.getRevision());
   }
 
