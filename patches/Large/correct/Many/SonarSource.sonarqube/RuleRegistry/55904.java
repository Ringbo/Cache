diff --git a/sonar-server/src/main/java/org/sonar/server/rule/RuleRegistry.java b/sonar-server/src/main/java/org/sonar/server/rule/RuleRegistry.java
index c4339ca..ae687d6 100644
--- a/sonar-server/src/main/java/org/sonar/server/rule/RuleRegistry.java
+++ b/sonar-server/src/main/java/org/sonar/server/rule/RuleRegistry.java
@@ -154,9 +154,9 @@
     }
     if (query.hasDebtCharacteristic() != null) {
       if (Boolean.TRUE.equals(query.hasDebtCharacteristic())) {
-        mainFilter.must(FilterBuilders.missingFilter(RuleDocument.FIELD_CHARACTERISTIC_KEY));
+        mainFilter.must(FilterBuilders.existsFilter(RuleDocument.FIELD_CHARACTERISTIC_KEY));
       } else {
-        mainFilter.mustNot(FilterBuilders.missingFilter(RuleDocument.FIELD_CHARACTERISTIC_KEY));
+        mainFilter.mustNot(FilterBuilders.existsFilter(RuleDocument.FIELD_CHARACTERISTIC_KEY));
       }
     }
 
