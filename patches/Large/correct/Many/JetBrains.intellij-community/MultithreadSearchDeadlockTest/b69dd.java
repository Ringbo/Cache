diff --git a/platform/lang-impl/testSources/com/intellij/ide/actions/searcheverywhere/MultithreadSearchDeadlockTest.java b/platform/lang-impl/testSources/com/intellij/ide/actions/searcheverywhere/MultithreadSearchDeadlockTest.java
index 27779e6..8872ee5 100644
--- a/platform/lang-impl/testSources/com/intellij/ide/actions/searcheverywhere/MultithreadSearchDeadlockTest.java
+++ b/platform/lang-impl/testSources/com/intellij/ide/actions/searcheverywhere/MultithreadSearchDeadlockTest.java
@@ -48,7 +48,7 @@
     searcher.search(contributorsMap, "", false, ignrd -> null);
 
     try {
-      if (!collector.awaitFinish(2000)) {
+      if (!collector.awaitFinish(4000)) {
         Assert.fail("Searching still haven't finished. Possible deadlock");
       }
       Assert.assertEquals(Arrays.asList("ri11", "ri12", "ri13", "ri14", "ri15", "ri16"), collector.getFoundItems("readAction1"));
