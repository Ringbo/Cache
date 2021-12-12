diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/step/NewCoverageMeasuresStepTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/step/NewCoverageMeasuresStepTest.java
index d870add..d36027b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/step/NewCoverageMeasuresStepTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/step/NewCoverageMeasuresStepTest.java
@@ -80,7 +80,7 @@
   public static final DumbComponent FILE_COMPONENT = DumbComponent.builder(Component.Type.FILE, 1).setFileAttributes(new FileAttributes(false, null)).build();
 
   @Before
-  public void setUp() throws Exception {
+  public void setUp() {
     periodsHolder.setPeriods(
       new Period(2, "mode_p_1", null, parseDate("2009-12-25").getTime(), 1),
       new Period(5, "mode_p_5", null, parseDate("2011-02-18").getTime(), 2));
