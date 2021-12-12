diff --git a/sonar-core/src/main/java/org/sonar/core/review/workflow/condition/HasReviewPropertyCondition.java b/sonar-core/src/main/java/org/sonar/core/review/workflow/condition/HasReviewPropertyCondition.java
index 01ab093..f187063 100644
--- a/sonar-core/src/main/java/org/sonar/core/review/workflow/condition/HasReviewPropertyCondition.java
+++ b/sonar-core/src/main/java/org/sonar/core/review/workflow/condition/HasReviewPropertyCondition.java
@@ -39,7 +39,7 @@
     this.propertyKey = propertyKey;
   }
 
-  public final String getPropertyKey() {
+  public String getPropertyKey() {
     return propertyKey;
   }
 
