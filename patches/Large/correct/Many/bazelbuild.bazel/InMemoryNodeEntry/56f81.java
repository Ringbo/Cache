diff --git a/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java b/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java
index 1351d46..be20224 100644
--- a/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java
+++ b/src/main/java/com/google/devtools/build/skyframe/InMemoryNodeEntry.java
@@ -280,7 +280,7 @@
   }
 
   @Override
-  public synchronized Iterable<SkyKey> getReverseDeps() {
+  public synchronized Collection<SkyKey> getReverseDeps() {
     assertKeepEdges();
     Preconditions.checkState(isDone() || buildingState.getReverseDepsToSignal().isEmpty(),
         "Reverse deps should only be queried before the build has begun "
