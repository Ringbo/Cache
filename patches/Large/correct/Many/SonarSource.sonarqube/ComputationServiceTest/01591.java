diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/ComputationServiceTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/ComputationServiceTest.java
index 935104f..9a9e266 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/ComputationServiceTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/ComputationServiceTest.java
@@ -58,12 +58,12 @@
   ComputationService sut;
 
   @Before
-  public void setUp() throws IOException {
+  public void setUp() {
     sut = new ComputationService(new ReportQueue.Item(dto, new File("Do_not_care")), steps, activityManager, system);
   }
 
   @Test
-  public void process_new_project() throws Exception {
+  public void process_new_project() {
     logTester.setLevel(LoggerLevel.INFO);
 
     when(steps.instances()).thenReturn(Arrays.asList(projectStep1, projectStep2));
@@ -85,7 +85,7 @@
   }
 
   @Test
-  public void debug_logs() throws Exception {
+  public void debug_logs() {
     when(steps.instances()).thenReturn(Collections.<ComputationStep>emptyList());
     logTester.setLevel(LoggerLevel.DEBUG);
 
@@ -95,7 +95,7 @@
   }
 
   @Test
-  public void fail_if_step_throws_error() throws Exception {
+  public void fail_if_step_throws_error() {
     String errorMessage = "Failed to unzip";
     when(steps.instances()).thenReturn(ImmutableList.of(projectStep1));
     doThrow(new IllegalStateException(errorMessage)).when(projectStep1).execute();
@@ -111,7 +111,7 @@
   }
 
   @Test
-  public void step_error() throws Exception {
+  public void step_error() {
     when(steps.instances()).thenReturn(Arrays.asList(projectStep1));
     doThrow(new IllegalStateException("pb")).when(projectStep1).execute();
 
