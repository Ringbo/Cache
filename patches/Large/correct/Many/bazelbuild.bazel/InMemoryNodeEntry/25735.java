diff --git a/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java b/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java
index 7ad9025..007cfef 100644
--- a/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java
+++ b/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java
@@ -385,14 +385,14 @@
   }
 
   @Override
-  public synchronized Iterable<SkyKey> getReverseDepsForDoneEntry() {
+  public synchronized Set<SkyKey> getReverseDepsForDoneEntry() {
     assertKeepEdges();
     Preconditions.checkState(isDone(), "Called on not done %s", this);
     return ReverseDepsUtility.getReverseDeps(this);
   }
 
   @Override
-  public synchronized Iterable<SkyKey> getAllReverseDepsForNodeBeingDeleted() {
+  public synchronized Set<SkyKey> getAllReverseDepsForNodeBeingDeleted() {
     assertKeepEdges();
     if (!isDone()) {
       // This consolidation loses information about pending reverse deps to signal, but that is
