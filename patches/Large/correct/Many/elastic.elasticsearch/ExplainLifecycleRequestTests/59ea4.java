diff --git a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/action/ExplainLifecycleRequestTests.java b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/action/ExplainLifecycleRequestTests.java
index ba1270d..c83317d 100644
--- a/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/action/ExplainLifecycleRequestTests.java
+++ b/x-pack/plugin/core/src/test/java/org/elasticsearch/xpack/core/indexlifecycle/action/ExplainLifecycleRequestTests.java
@@ -19,7 +19,7 @@
     protected Request createTestInstance() {
         Request request = new Request();
         if (randomBoolean()) {
-            request.indices(generateRandomStringArray(20, 20, false));
+            request.indices(generateRandomStringArray(20, 20, false, false));
         }
         if (randomBoolean()) {
             IndicesOptions indicesOptions = IndicesOptions.fromOptions(randomBoolean(), randomBoolean(), randomBoolean(), randomBoolean(),
@@ -35,7 +35,7 @@
         IndicesOptions indicesOptions = instance.indicesOptions();
         switch (between(0, 1)) {
         case 0:
-            indices = generateRandomStringArray(20, 10, false);
+            indices = generateRandomStringArray(20, 10, false, false);
             break;
         case 1:
             indicesOptions = randomValueOtherThan(indicesOptions, () -> IndicesOptions.fromOptions(randomBoolean(), randomBoolean(),
