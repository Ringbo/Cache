diff --git a/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/dao/CustomSession.java b/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/dao/CustomSession.java
index 1b1545c..714f21c 100644
--- a/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/dao/CustomSession.java
+++ b/webs/jbpm-web/docroot/WEB-INF/src/com/liferay/portal/workflow/jbpm/dao/CustomSession.java
@@ -143,7 +143,7 @@
 			Criteria criteria = buildProcessInstanceExtensionSearchCriteria(
 				companyId, userId, assetClassName, assetClassPK, completed);
 
-			return (int)criteriaCount(criteria);
+			return criteriaCount(criteria);
 		}
 		catch (Exception e) {
 			throw new JbpmException(e);
@@ -480,7 +480,7 @@
 				taskName, assetType, assetPrimaryKeys, dueDateGT, dueDateLT,
 				completed, searchByUserRoles, andOperator, serviceContext);
 
-			return (int)criteriaCount(criteria);
+			return criteriaCount(criteria);
 		}
 		catch (Exception e) {
 			throw new JbpmException(e);
@@ -728,16 +728,16 @@
 		return criteria;
 	}
 
-	protected long criteriaCount(Criteria criteria){
+	protected int criteriaCount(Criteria criteria){
 		criteria.setProjection(Projections.rowCount());
 
-		List<Long> results = criteria.list();
+		List<Integer> results = criteria.list();
 
 		if (results.isEmpty()) {
 			return 0;
 		}
 		else {
-			return (results.get(0)).longValue();
+			return results.get(0);
 		}
 	}
 
