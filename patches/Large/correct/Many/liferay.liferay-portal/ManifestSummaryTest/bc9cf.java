diff --git a/modules/apps/journal/journal-test/src/testIntegration/java/com/liferay/journal/exportimport/data/handler/test/ManifestSummaryTest.java b/modules/apps/journal/journal-test/src/testIntegration/java/com/liferay/journal/exportimport/data/handler/test/ManifestSummaryTest.java
index 7c6f8f2..97a5399 100644
--- a/modules/apps/journal/journal-test/src/testIntegration/java/com/liferay/journal/exportimport/data/handler/test/ManifestSummaryTest.java
+++ b/modules/apps/journal/journal-test/src/testIntegration/java/com/liferay/journal/exportimport/data/handler/test/ManifestSummaryTest.java
@@ -170,7 +170,7 @@
 			manifestSummary.getModelAdditionCounters();
 
 		Assert.assertEquals(
-			modelAdditionCounters.toString(), 5, modelAdditionCounters.size());
+			modelAdditionCounters.toString(), 4, modelAdditionCounters.size());
 
 		Assert.assertEquals(
 			1,
@@ -223,7 +223,7 @@
 			manifestSummary.getModelAdditionCounters();
 
 		Assert.assertEquals(
-			modelAdditionCounters.toString(), 5, modelAdditionCounters.size());
+			modelAdditionCounters.toString(), 4, modelAdditionCounters.size());
 
 		Assert.assertEquals(
 			1,
