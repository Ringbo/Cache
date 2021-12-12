diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedPeriodsStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedPeriodsStepTest.java
index c480aa5..d6794ac 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedPeriodsStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/FeedPeriodsStepTest.java
@@ -97,12 +97,12 @@
   }
 
   @After
-  public void tearDown() throws Exception {
+  public void tearDown() {
     dbSession.close();
   }
 
   @Test
-  public void no_period_on_first_analysis() throws Exception {
+  public void no_period_on_first_analysis() {
     // No project, no snapshot
 
     sut.execute();
@@ -110,7 +110,7 @@
   }
 
   @Test
-  public void feed_one_period() throws Exception {
+  public void feed_one_period() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     String textDate = "2008-11-22";
@@ -128,7 +128,7 @@
   }
 
   @Test
-  public void no_period_when_settings_match_no_analysis() throws Exception {
+  public void no_period_when_settings_match_no_analysis() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period1", "UNKNWOWN VERSION");
@@ -138,7 +138,7 @@
   }
 
   @Test
-  public void no_period_when_settings_is_empty() throws Exception {
+  public void no_period_when_settings_is_empty() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period1", "");
@@ -148,7 +148,7 @@
   }
 
   @Test
-  public void ignore_unprocessed_snapshots() throws Exception {
+  public void ignore_unprocessed_snapshots() {
     dbTester.prepareDbUnit(getClass(), "unprocessed_snapshots.xml");
 
     settings.setProperty("sonar.timemachine.period1", "100");
@@ -158,7 +158,7 @@
   }
 
   @Test
-  public void feed_period_by_date() throws Exception {
+  public void feed_period_by_date() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     String textDate = "2008-11-22";
@@ -180,7 +180,7 @@
   }
 
   @Test
-  public void search_by_date_return_nearest_later_analysis() throws Exception {
+  public void search_by_date_return_nearest_later_analysis() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
     String date = "2008-11-24";
 
@@ -199,7 +199,7 @@
   }
 
   @Test
-  public void no_period_by_date() throws Exception {
+  public void no_period_by_date() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     // No analysis at and after this date
@@ -210,7 +210,7 @@
   }
 
   @Test
-  public void feed_period_by_days() throws Exception {
+  public void feed_period_by_days() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period1", "10");
@@ -231,7 +231,7 @@
   }
 
   @Test
-  public void no_period_by_days() throws Exception {
+  public void no_period_by_days() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     settings.setProperty("sonar.timemachine.period1", "0");
@@ -241,7 +241,7 @@
   }
 
   @Test
-  public void feed_period_by_previous_analysis() throws Exception {
+  public void feed_period_by_previous_analysis() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period1", "previous_analysis");
@@ -262,7 +262,7 @@
   }
 
   @Test
-  public void no_period_by_previous_analysis() throws Exception {
+  public void no_period_by_previous_analysis() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     settings.setProperty("sonar.timemachine.period1", "previous_analysis");
@@ -272,7 +272,7 @@
   }
 
   @Test
-  public void feed_period_by_previous_version() throws Exception {
+  public void feed_period_by_previous_version() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period1", "previous_version");
@@ -293,7 +293,7 @@
   }
 
   @Test
-  public void feed_period_by_previous_version_wit_previous_version_deleted() throws Exception {
+  public void feed_period_by_previous_version_wit_previous_version_deleted() {
     dbTester.prepareDbUnit(getClass(), "previous_version_deleted.xml");
 
     settings.setProperty("sonar.timemachine.period1", "previous_version");
@@ -311,7 +311,7 @@
   }
 
   @Test
-  public void no_period_by_previous_version() throws Exception {
+  public void no_period_by_previous_version() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     settings.setProperty("sonar.timemachine.period1", "previous_version");
@@ -321,7 +321,7 @@
   }
 
   @Test
-  public void no_period_by_previous_version_when_no_event_version() throws Exception {
+  public void no_period_by_previous_version_when_no_event_version() {
     dbTester.prepareDbUnit(getClass(), "no_previous_version.xml");
 
     settings.setProperty("sonar.timemachine.period1", "previous_version");
@@ -331,7 +331,7 @@
   }
 
   @Test
-  public void feed_period_by_version() throws Exception {
+  public void feed_period_by_version() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period1", "0.9");
@@ -352,7 +352,7 @@
   }
 
   @Test
-  public void no_period_by_version() throws Exception {
+  public void no_period_by_version() {
     dbTester.prepareDbUnit(getClass(), "empty.xml");
 
     settings.setProperty("sonar.timemachine.period1", "0.8");
@@ -362,7 +362,7 @@
   }
 
   @Test
-  public void feed_five_different_periods() throws Exception {
+  public void feed_five_different_periods() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period1", "2008-11-22"); // Analysis from 2008-11-22 should be returned
@@ -405,7 +405,7 @@
   }
 
   @Test
-  public void can_use_qualifier_in_settings() throws Exception {
+  public void can_use_qualifier_in_settings() {
     dbTester.prepareDbUnit(getClass(), "shared.xml");
 
     settings.setProperty("sonar.timemachine.period4.TRK", "2008-11-22");
