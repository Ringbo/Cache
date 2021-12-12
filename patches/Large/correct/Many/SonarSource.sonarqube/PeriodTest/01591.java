diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodTest.java
index 570bab4..34ec82e 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodTest.java
@@ -73,7 +73,7 @@
   }
 
   @Test
-  public void verify_to_string() throws Exception {
+  public void verify_to_string() {
     assertThat(new Period(1, CoreProperties.TIMEMACHINE_MODE_VERSION, "2.3", 1420034400000L, 10L).toString())
       .isEqualTo("Period{index=1, mode=version, modeParameter=2.3, snapshotDate=1420034400000, snapshotId=10}");
   }
