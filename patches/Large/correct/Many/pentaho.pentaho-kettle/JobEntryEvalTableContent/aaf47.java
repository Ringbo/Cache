diff --git a/src/org/pentaho/di/job/entries/evaluatetablecontent/JobEntryEvalTableContent.java b/src/org/pentaho/di/job/entries/evaluatetablecontent/JobEntryEvalTableContent.java
index 4c216c3..576664f 100644
--- a/src/org/pentaho/di/job/entries/evaluatetablecontent/JobEntryEvalTableContent.java
+++ b/src/org/pentaho/di/job/entries/evaluatetablecontent/JobEntryEvalTableContent.java
@@ -226,7 +226,7 @@
 
 			schemaname = rep.getJobEntryAttributeString(id_jobentry, "schemaname");
 			tablename = rep.getJobEntryAttributeString(id_jobentry, "tablename");
-			successCondition = getSuccessConditionByCode(Const.NVL(rep.getStepAttributeString(id_jobentry,"success_condition"), ""));
+			successCondition = getSuccessConditionByCode(Const.NVL(rep.getJobEntryAttributeString(id_jobentry,"success_condition"), ""));
 			limit = rep.getJobEntryAttributeString(id_jobentry, "limit");
 			iscustomSQL = rep.getJobEntryAttributeBoolean(id_jobentry, "is_custom_sql");
 			isUseVars = rep.getJobEntryAttributeBoolean(id_jobentry, "is_usevars");
@@ -268,7 +268,7 @@
 
 			rep.saveJobEntryAttribute(id_job, getID(), "schemaname", schemaname);
 			rep.saveJobEntryAttribute(id_job, getID(), "tablename", tablename);
-			rep.saveStepAttribute(id_job, getID(),"success_condition", getSuccessConditionCode(successCondition));
+			rep.saveJobEntryAttribute(id_job, getID(),"success_condition", getSuccessConditionCode(successCondition));
 			rep.saveJobEntryAttribute(id_job, getID(), "limit", limit); 
 			rep.saveJobEntryAttribute(id_job, getID(), "custom_sql", customSQL);
 			rep.saveJobEntryAttribute(id_job, getID(), "is_custom_sql", iscustomSQL);
