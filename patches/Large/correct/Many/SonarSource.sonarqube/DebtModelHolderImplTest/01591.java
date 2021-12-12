diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/debt/DebtModelHolderImplTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/debt/DebtModelHolderImplTest.java
index 09556a13..f7386c0 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/debt/DebtModelHolderImplTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/debt/DebtModelHolderImplTest.java
@@ -43,7 +43,7 @@
   DebtModelHolderImpl sut = new DebtModelHolderImpl();
 
   @Test
-  public void add_and_get_characteristics() throws Exception {
+  public void add_and_get_characteristics() {
     sut.addCharacteristics(PORTABILITY, Arrays.asList(COMPILER_RELATED_PORTABILITY, HARDWARE_RELATED_PORTABILITY));
     sut.addCharacteristics(MAINTAINABILITY, singletonList(READABILITY));
 
@@ -53,7 +53,7 @@
   }
 
   @Test
-  public void add_characteristics_fail_with_NPE_if_root_characteristic_is_null() throws Exception {
+  public void add_characteristics_fail_with_NPE_if_root_characteristic_is_null() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("rootCharacteristic cannot be null");
 
@@ -61,7 +61,7 @@
   }
 
   @Test
-  public void add_characteristics_fail_with_NPE_if_sub_characteristics_are_null() throws Exception {
+  public void add_characteristics_fail_with_NPE_if_sub_characteristics_are_null() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("subCharacteristics cannot be null");
 
@@ -69,7 +69,7 @@
   }
 
   @Test
-  public void add_characteristics_fail_with_IAE_if_sub_characteristics_are_empty() throws Exception {
+  public void add_characteristics_fail_with_IAE_if_sub_characteristics_are_empty() {
     thrown.expect(IllegalArgumentException.class);
     thrown.expectMessage("subCharacteristics cannot be empty");
 
@@ -77,7 +77,7 @@
   }
 
   @Test
-  public void get_root_characteristics() throws Exception {
+  public void get_root_characteristics() {
     sut.addCharacteristics(PORTABILITY, Arrays.asList(COMPILER_RELATED_PORTABILITY, READABILITY));
     sut.addCharacteristics(MAINTAINABILITY, singletonList(READABILITY));
 
@@ -85,7 +85,7 @@
   }
 
   @Test
-  public void getCharacteristicById_throws_ISE_when_not_initialized() throws Exception {
+  public void getCharacteristicById_throws_ISE_when_not_initialized() {
     thrown.expect(IllegalStateException.class);
     thrown.expectMessage("Characteristics have not been initialized yet");
 
@@ -93,7 +93,7 @@
   }
 
   @Test
-  public void getRootCharacteristics_throws_ISE_when_not_initialized() throws Exception {
+  public void getRootCharacteristics_throws_ISE_when_not_initialized() {
     thrown.expect(IllegalStateException.class);
     thrown.expectMessage("Characteristics have not been initialized yet");
 
