diff --git a/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileRule.java b/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileRule.java
index 7eaa5b4..a3d5951 100644
--- a/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileRule.java
+++ b/sonar-server/src/main/java/org/sonar/server/qualityprofile/QProfileRule.java
@@ -42,7 +42,7 @@
   private final String description;
   private final String status;
   private final String cardinality;
-  private final String parentKey;
+  private final Integer parentId;
   private final Date createdAt;
   private final Date updatedAt;
   private final QProfileRuleNote ruleNote;
@@ -62,7 +62,7 @@
     description = (String) ruleSource.get(RuleDocument.FIELD_DESCRIPTION);
     status = (String) ruleSource.get(RuleDocument.FIELD_STATUS);
     cardinality = (String) ruleSource.get("cardinality");
-    parentKey = (String) ruleSource.get(RuleDocument.FIELD_PARENT_KEY);
+    parentId = (Integer) ruleSource.get(RuleDocument.FIELD_PARENT_KEY);
     createdAt = parseOptionalDate(RuleDocument.FIELD_CREATED_AT, ruleSource);
     updatedAt = parseOptionalDate(RuleDocument.FIELD_UPDATED_AT, ruleSource);
 
@@ -199,7 +199,7 @@
   }
 
   public boolean isEditable() {
-    return parentKey != null;
+    return parentId != null;
   }
 
   public List<QProfileRuleParam> params() {
