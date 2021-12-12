diff --git a/modules/activiti-rest/src/test/java/org/activiti/rest/api/management/JobCollectionResourceTest.java b/modules/activiti-rest/src/test/java/org/activiti/rest/api/management/JobCollectionResourceTest.java
index 4bcd048..431ddd7 100644
--- a/modules/activiti-rest/src/test/java/org/activiti/rest/api/management/JobCollectionResourceTest.java
+++ b/modules/activiti-rest/src/test/java/org/activiti/rest/api/management/JobCollectionResourceTest.java
@@ -75,7 +75,7 @@
     
     // Fetch using processDefinitionId
     url = RestUrls.createRelativeResourceUrl(RestUrls.URL_JOB_COLLECTION) + "?processDefinitionId=" + processInstance.getProcessDefinitionId();
-    assertResultsPresentInDataResponse(url, timerJob.getId());
+    assertResultsPresentInDataResponse(url, asyncJob.getId(), timerJob.getId());
     
     url = RestUrls.createRelativeResourceUrl(RestUrls.URL_JOB_COLLECTION) + "?processDefinitionId=unexisting";
     assertResultsPresentInDataResponse(url);
