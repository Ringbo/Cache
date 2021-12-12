diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodsHolderImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodsHolderImplTest.java
index 8af67b3..813419c 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodsHolderImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/period/PeriodsHolderImplTest.java
@@ -39,7 +39,7 @@
   private PeriodsHolderImpl underTest = new PeriodsHolderImpl();
 
   @Test
-  public void get_periods() throws Exception {
+  public void get_periods() {
     List<Period> periods = new ArrayList<>();
     periods.add(createPeriod(1));
 
@@ -49,7 +49,7 @@
   }
 
   @Test
-  public void get_periods_throws_illegal_state_exception_if_not_initialized() throws Exception {
+  public void get_periods_throws_illegal_state_exception_if_not_initialized() {
     thrown.expect(IllegalStateException.class);
     thrown.expectMessage("Periods have not been initialized yet");
 
@@ -57,7 +57,7 @@
   }
 
   @Test
-  public void setPeriods_throws_NPE_if_arg_is_null() throws Exception {
+  public void setPeriods_throws_NPE_if_arg_is_null() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("Periods cannot be null");
 
@@ -65,7 +65,7 @@
   }
 
   @Test
-  public void setPeriods_throws_NPE_if_arg_contains_null() throws Exception {
+  public void setPeriods_throws_NPE_if_arg_contains_null() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("No null Period can be added to the holder");
 
@@ -75,7 +75,7 @@
   }
 
   @Test
-  public void setPeriods_throws_NPE_if_arg_contains_null_among_others() throws Exception {
+  public void setPeriods_throws_NPE_if_arg_contains_null_among_others() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("No null Period can be added to the holder");
 
@@ -101,7 +101,7 @@
   }
 
   @Test
-  public void setPeriods_throws_ISE_if_already_initialized() throws Exception {
+  public void setPeriods_throws_ISE_if_already_initialized() {
     thrown.expect(IllegalStateException.class);
     thrown.expectMessage("Periods have already been initialized");
 
@@ -121,7 +121,7 @@
   }
 
   @Test
-  public void update_periods_throws_unsupported_operation_exception() throws Exception {
+  public void update_periods_throws_unsupported_operation_exception() {
     thrown.expect(UnsupportedOperationException.class);
 
     underTest.setPeriods(ImmutableList.of(createPeriod(1)));
