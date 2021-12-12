diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistNumberOfDaysSinceLastCommitStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistNumberOfDaysSinceLastCommitStepTest.java
index 748de45..692c305 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistNumberOfDaysSinceLastCommitStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/PersistNumberOfDaysSinceLastCommitStepTest.java
@@ -68,7 +68,7 @@
   LanguageRepository languageRepository;
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     db.truncateTables();
     dbClient = new DbClient(db.database(), db.myBatis(), new MeasureDao());
     sourceLineIndex = mock(SourceLineIndex.class);
