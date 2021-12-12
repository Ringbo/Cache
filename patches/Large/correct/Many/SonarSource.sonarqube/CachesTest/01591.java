diff --git a/sonar-batch/src/test/java/org/sonar/batch/index/CachesTest.java b/sonar-batch/src/test/java/org/sonar/batch/index/CachesTest.java
index 411435a..32598b2 100644
--- a/sonar-batch/src/test/java/org/sonar/batch/index/CachesTest.java
+++ b/sonar-batch/src/test/java/org/sonar/batch/index/CachesTest.java
@@ -45,7 +45,7 @@
   }
 
   @Test
-  public void should_clean_resources() throws PersistitException {
+  public void should_clean_resources() {
     Cache<String> c = caches.<String>createCache("test1");
     for (int i = 0; i < 1_000_000; i++) {
       c.put("a" + i, "a" + i);
