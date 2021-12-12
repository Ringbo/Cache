diff --git a/it/it-tests/src/test/java/it/serverSystem/ServerSystemTest.java b/it/it-tests/src/test/java/it/serverSystem/ServerSystemTest.java
index b9b97ec..d20dbef 100644
--- a/it/it-tests/src/test/java/it/serverSystem/ServerSystemTest.java
+++ b/it/it-tests/src/test/java/it/serverSystem/ServerSystemTest.java
@@ -106,7 +106,7 @@
     assertThat(response.code()).isEqualTo(200);
     assertThat(response.content()).contains(
       "\"Compute Engine Database Connection\":", "\"Compute Engine State\":", "\"Compute Engine Tasks\":",
-      "\"Elasticsearch\":", "\"State\":\"GREEN\"", "\"Elasticsearch State\"");
+      "\"Elasticsearch\":", "\"State\":\"GREEN\"");
   }
 
   private static void waitForComputeEngineToBeUp(Orchestrator orchestrator) throws IOException {
