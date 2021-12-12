diff --git a/src/test/java/com/google/devtools/build/skyframe/DeterministicInMemoryGraph.java b/src/test/java/com/google/devtools/build/skyframe/DeterministicInMemoryGraph.java
index d12c9f0..2141c6c 100644
--- a/src/test/java/com/google/devtools/build/skyframe/DeterministicInMemoryGraph.java
+++ b/src/test/java/com/google/devtools/build/skyframe/DeterministicInMemoryGraph.java
@@ -67,7 +67,7 @@
 
     @SuppressWarnings("unchecked")
     @Override
-    public synchronized Iterable<SkyKey> getReverseDeps() {
+    public synchronized Collection<SkyKey> getReverseDeps() {
       TreeSet<SkyKey> result = new TreeSet<>(ALPHABETICAL_SKYKEY_COMPARATOR);
       if (reverseDeps instanceof List) {
         result.addAll((Collection<? extends SkyKey>) reverseDeps);
