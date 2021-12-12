diff --git a/openapi/src/com/intellij/openapi/vcs/changes/ChangeList.java b/openapi/src/com/intellij/openapi/vcs/changes/ChangeList.java
index 72f37bd..908b801 100644
--- a/openapi/src/com/intellij/openapi/vcs/changes/ChangeList.java
+++ b/openapi/src/com/intellij/openapi/vcs/changes/ChangeList.java
@@ -30,7 +30,7 @@
     myDescription = description;
   }
 
-  public Collection<Change> getChanges() {
+  public synchronized Collection<Change> getChanges() {
     if (myReadChangesCache == null) {
       myReadChangesCache = new HashSet<Change>(myChanges);
       if (myOutdatedChanges != null) {
@@ -56,17 +56,17 @@
     myIsDefault = isDefault;
   }
 
-  void addChange(Change change) {
+  synchronized void addChange(Change change) {
     myReadChangesCache = null;
     myChanges.add(change);
   }
 
-  void removeChange(Change change) {
+  synchronized void removeChange(Change change) {
     myReadChangesCache = null;
     myChanges.remove(change);
   }
 
-  void startProcessingChanges(final VcsDirtyScope scope) {
+  synchronized void startProcessingChanges(final VcsDirtyScope scope) {
     myChangesBeforeUpdate = new HashSet<Change>(myChanges);
     myOutdatedChanges = new ArrayList<Change>();
     for (Change oldBoy : myChangesBeforeUpdate) {
@@ -98,7 +98,7 @@
     return false;
   }
 
-  boolean doneProcessingChanges() {
+  synchronized boolean doneProcessingChanges() {
     boolean changesDetected = !Comparing.equal(myChanges, myChangesBeforeUpdate);
     myOutdatedChanges = null;
     myReadChangesCache = null;
