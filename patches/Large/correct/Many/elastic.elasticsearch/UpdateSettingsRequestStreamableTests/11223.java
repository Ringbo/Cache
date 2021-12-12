diff --git a/server/src/test/java/org/elasticsearch/action/admin/indices/settings/put/UpdateSettingsRequestStreamableTests.java b/server/src/test/java/org/elasticsearch/action/admin/indices/settings/put/UpdateSettingsRequestStreamableTests.java
index e8dd394..83ddb45 100644
--- a/server/src/test/java/org/elasticsearch/action/admin/indices/settings/put/UpdateSettingsRequestStreamableTests.java
+++ b/server/src/test/java/org/elasticsearch/action/admin/indices/settings/put/UpdateSettingsRequestStreamableTests.java
@@ -41,7 +41,7 @@
         List<Runnable> mutators = new ArrayList<>();
         mutators.add(() -> mutation
                 .masterNodeTimeout(randomValueOtherThan(request.masterNodeTimeout().getStringRep(), ESTestCase::randomTimeValue)));
-        mutators.add(() -> mutation.timeout(randomValueOtherThan(request.masterNodeTimeout().getStringRep(), ESTestCase::randomTimeValue)));
+        mutators.add(() -> mutation.timeout(randomValueOtherThan(request.timeout().getStringRep(), ESTestCase::randomTimeValue)));
         mutators.add(() -> mutation.settings(mutateSettings(request.settings())));
         mutators.add(() -> mutation.indices(mutateIndices(request.indices())));
         mutators.add(() -> mutation.indicesOptions(randomValueOtherThan(request.indicesOptions(),
