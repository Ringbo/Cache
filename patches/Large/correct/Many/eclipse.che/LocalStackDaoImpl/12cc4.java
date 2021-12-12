diff --git a/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalStackDaoImpl.java b/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalStackDaoImpl.java
index 279b6df..c60aa82 100644
--- a/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalStackDaoImpl.java
+++ b/wsmaster/wsmaster-local/src/main/java/org/eclipse/che/api/local/LocalStackDaoImpl.java
@@ -130,13 +130,13 @@
     public List<StackImpl> searchStacks(String user, @Nullable List<String> tags, int skipCount, int maxItems) {
         lock.readLock().lock();
         try {
-            final Stream<StackImpl> stacksStream = stacks.values()
+            Stream<StackImpl> stacksStream = stacks.values()
                                                          .stream()
                                                          .skip(skipCount)
                                                          .filter(decoratedStack -> tags == null ||
                                                                                    decoratedStack.getTags().containsAll(tags));
             if (maxItems != 0) {
-                stacksStream.limit(maxItems);
+                stacksStream = stacksStream.limit(maxItems);
             }
 
             return stacksStream.map(StackImpl::new)
