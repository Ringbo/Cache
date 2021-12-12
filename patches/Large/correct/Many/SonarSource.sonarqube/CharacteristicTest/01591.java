diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/debt/CharacteristicTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/debt/CharacteristicTest.java
index 0dea829..496ca6f 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/debt/CharacteristicTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/debt/CharacteristicTest.java
@@ -62,7 +62,7 @@
   }
 
   @Test
-  public void creating_a_new_characteristic_with_null_key_throws_a_NPE() throws Exception {
+  public void creating_a_new_characteristic_with_null_key_throws_a_NPE() {
     thrown.expect(NullPointerException.class);
     thrown.expectMessage("key cannot be null");
 
