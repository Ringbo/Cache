diff --git a/client/rest-high-level/src/test/java/org/elasticsearch/client/indexlifecycle/ExplainLifecycleRequestTests.java b/client/rest-high-level/src/test/java/org/elasticsearch/client/indexlifecycle/ExplainLifecycleRequestTests.java
index 08cd106..2e2aec3 100644
--- a/client/rest-high-level/src/test/java/org/elasticsearch/client/indexlifecycle/ExplainLifecycleRequestTests.java
+++ b/client/rest-high-level/src/test/java/org/elasticsearch/client/indexlifecycle/ExplainLifecycleRequestTests.java
@@ -39,7 +39,7 @@
     }
 
     private ExplainLifecycleRequest createTestInstance() {
-        ExplainLifecycleRequest request = new ExplainLifecycleRequest(generateRandomStringArray(20, 20, false, true));
+        ExplainLifecycleRequest request = new ExplainLifecycleRequest(generateRandomStringArray(20, 20, false, false));
         if (randomBoolean()) {
             IndicesOptions indicesOptions = IndicesOptions.fromOptions(randomBoolean(), randomBoolean(), randomBoolean(), randomBoolean(),
                     randomBoolean(), randomBoolean(), randomBoolean(), randomBoolean());
