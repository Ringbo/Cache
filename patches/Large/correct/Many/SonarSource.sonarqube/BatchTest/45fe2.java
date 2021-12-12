diff --git a/it/it-tests/src/test/java/it/analysis/BatchTest.java b/it/it-tests/src/test/java/it/analysis/BatchTest.java
index bf15ee6..57d5084 100644
--- a/it/it-tests/src/test/java/it/analysis/BatchTest.java
+++ b/it/it-tests/src/test/java/it/analysis/BatchTest.java
@@ -161,7 +161,7 @@
     Resource project = sonar.find(new ResourceQuery("com.sonarsource.it.projects.batch:duplicate-source").setMetrics("files", "directories"));
     // 2 main files and 1 test file all with same deprecated key
     assertThat(project.getMeasureIntValue("files")).isEqualTo(2);
-    assertThat(project.getMeasureIntValue("directories")).isEqualTo(3);
+    assertThat(project.getMeasureIntValue("directories")).isEqualTo(2);
   }
 
   /**
