diff --git a/it/it-tests/src/test/java/it/analysis/ReportDumpTest.java b/it/it-tests/src/test/java/it/analysis/ReportDumpTest.java
index 3cb35a5..b5abec8 100644
--- a/it/it-tests/src/test/java/it/analysis/ReportDumpTest.java
+++ b/it/it-tests/src/test/java/it/analysis/ReportDumpTest.java
@@ -54,9 +54,10 @@
     // verify properties
     Properties props = new Properties();
     props.load(new StringReader(FileUtils.readFileToString(metadata, StandardCharsets.UTF_8)));
-    assertThat(props).hasSize(5);
+    assertThat(props).hasSize(6);
     assertThat(props.getProperty("projectKey")).isEqualTo("dump_metadata_of_uploaded_report");
     assertThat(props.getProperty("ceTaskId")).isNotEmpty();
+    // FIXME assertThat(props.getProperty("serverVersion")).isEqualTo(orchestrator.getServer().version().toString());
     verifyUrl(props.getProperty("serverUrl"));
     verifyUrl(props.getProperty("dashboardUrl"));
     verifyUrl(props.getProperty("ceTaskUrl"));
