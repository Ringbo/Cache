diff --git a/server/sonar-data-test/src/test/java/org/sonar/data/issues/IssuesDbExtractionTest.java b/server/sonar-data-test/src/test/java/org/sonar/data/issues/IssuesDbExtractionTest.java
index cd1313d..3a6b034 100644
--- a/server/sonar-data-test/src/test/java/org/sonar/data/issues/IssuesDbExtractionTest.java
+++ b/server/sonar-data-test/src/test/java/org/sonar/data/issues/IssuesDbExtractionTest.java
@@ -65,7 +65,7 @@
     ruleDao = new RuleDao();
     componentDao = new ComponentDao(System2.INSTANCE);
 
-    session = db.myBatis().openSession(true);
+    session = db.myBatis().openSession(false);
   }
 
   @After
@@ -75,7 +75,7 @@
 
   @Test
   public void extract_issues() throws Exception {
-    generateData();
+    insertReferentials();
 
     ProgressTask progressTask = new ProgressTask(counter);
     Timer timer = new Timer("Extract Issues");
@@ -89,7 +89,7 @@
       assertThat(issueDao.synchronizedIssues).isEqualTo(ISSUE_COUNT);
 
       long time = stop - start;
-      LOGGER.info("Extracted {} Issues in {} ms with avg {} Issue/second", ISSUE_COUNT, time, documentPerSecond(time));
+      LOGGER.info("Iterated over {} issues in {} ms with avg of {} issues/second", ISSUE_COUNT, time, rowsPerSecond(time));
       // assertDurationAround(time, Long.parseLong(getProperty("IssuesDbExtractionTest.extract_issues")));
 
     } finally {
@@ -98,7 +98,7 @@
     }
   }
 
-  private void generateData() {
+  private void insertReferentials() {
     long start = System.currentTimeMillis();
 
     for (int i = 0; i < RULES_NUMBER; i++) {
@@ -127,10 +127,10 @@
         session.commit();
       }
     }
-    LOGGER.info("Generated data in {} ms", System.currentTimeMillis() - start);
+    LOGGER.info("Referentials inserted in {} ms", System.currentTimeMillis() - start);
   }
 
-  protected int documentPerSecond(long time) {
+  protected int rowsPerSecond(long time) {
     return (int) Math.round(ISSUE_COUNT / (time / 1000.0));
   }
 
