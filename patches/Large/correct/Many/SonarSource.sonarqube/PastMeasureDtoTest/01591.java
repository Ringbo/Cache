diff --git a/sonar-db/src/test/java/org/sonar/db/measure/PastMeasureDtoTest.java b/sonar-db/src/test/java/org/sonar/db/measure/PastMeasureDtoTest.java
index 6b11760..ecdcc46 100644
--- a/sonar-db/src/test/java/org/sonar/db/measure/PastMeasureDtoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/measure/PastMeasureDtoTest.java
@@ -66,7 +66,7 @@
   }
 
   @Test(expected = NullPointerException.class)
-  public void get_value_throw_a_NPE_if_value_is_null() throws Exception {
+  public void get_value_throw_a_NPE_if_value_is_null() {
     new PastMeasureDto().getValue();
   }
 }
