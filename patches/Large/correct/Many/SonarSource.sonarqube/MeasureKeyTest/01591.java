diff --git a/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureKeyTest.java b/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureKeyTest.java
index 0bf59f5..842961b 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureKeyTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/computation/measure/MeasureKeyTest.java
@@ -32,21 +32,21 @@
   public ExpectedException thrown = ExpectedException.none();
 
   @Test
-  public void fail_with_NPE_when_metric_key_is_null() throws Exception {
+  public void fail_with_NPE_when_metric_key_is_null() {
     thrown.expect(NullPointerException.class);
 
     new MeasureKey(null, 1, 2);
   }
 
   @Test
-  public void fail_with_IAE_when_rule_id_is_default_value() throws Exception {
+  public void fail_with_IAE_when_rule_id_is_default_value() {
     thrown.expect(IllegalArgumentException.class);
 
     new MeasureKey("metricKey", -6253, 2);
   }
 
   @Test
-  public void fail_with_IAE_when_characteristic_id_is_default_value() throws Exception {
+  public void fail_with_IAE_when_characteristic_id_is_default_value() {
     thrown.expect(IllegalArgumentException.class);
 
     new MeasureKey("metricKey", 1, -6253);
@@ -86,7 +86,7 @@
   }
 
   @Test
-  public void to_string() throws Exception {
+  public void to_string() {
     assertThat(new MeasureKey("metricKey", 1, 2).toString()).isEqualTo("MeasureKey{metricKey='metricKey', ruleId=1, characteristicId=2}");
     assertThat(new MeasureKey("metricKey", 1, null).toString()).isEqualTo("MeasureKey{metricKey='metricKey', ruleId=1, characteristicId=-6253}");
     assertThat(new MeasureKey("metricKey", null, 2).toString()).isEqualTo("MeasureKey{metricKey='metricKey', ruleId=-6253, characteristicId=2}");
