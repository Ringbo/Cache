diff --git a/plugins/svn4idea/src/org/jetbrains/idea/svn/integrate/ToBeMergedDialog.java b/plugins/svn4idea/src/org/jetbrains/idea/svn/integrate/ToBeMergedDialog.java
index 47db12c..3ab7df0 100644
--- a/plugins/svn4idea/src/org/jetbrains/idea/svn/integrate/ToBeMergedDialog.java
+++ b/plugins/svn4idea/src/org/jetbrains/idea/svn/integrate/ToBeMergedDialog.java
@@ -124,7 +124,7 @@
 
     myAlarm = new Alarm(Alarm.ThreadToUse.POOLED_THREAD, getDisposable());
     if (! myAlreadyCalculatedState) {
-      refreshListStatus();
+      refreshListStatus(myLists);
     }
   }
 
@@ -158,16 +158,16 @@
     myMore100Action.setEnabled(true);
     myMore500Action.setEnabled(true);
     myMore500Action.setVisible(true);
-    refreshListStatus();
+    refreshListStatus(list);
   }
 
-  public void refreshListStatus() {
+  public void refreshListStatus(@NotNull final List<CommittedChangeList> changeLists) {
     if (myAlarm.isDisposed()) return;
     myAlarm.addRequest(new Runnable() {
       @Override
       public void run() {
         int cnt = 10;
-        for (CommittedChangeList list : myLists) {
+        for (CommittedChangeList list : changeLists) {
           final SvnMergeInfoCache.MergeCheckResult result = myMergeChecker.checkList((SvnChangeList)list);
           // at the moment we calculate only "merged" since we don;t have branch copy point
           if (SvnMergeInfoCache.MergeCheckResult.MERGED.equals(result)) {
