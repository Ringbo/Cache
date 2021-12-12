diff --git a/portal-impl/test/integration/com/liferay/portlet/polls/lar/PollsVoteStagedModelDataHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/polls/lar/PollsVoteStagedModelDataHandlerTest.java
index f219dab..f17ffe5 100644
--- a/portal-impl/test/integration/com/liferay/portlet/polls/lar/PollsVoteStagedModelDataHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/polls/lar/PollsVoteStagedModelDataHandlerTest.java
@@ -147,7 +147,7 @@
 		List<StagedModel> choices = dependentStagedModelsMap.get(
 			PollsChoice.class.getName());
 
-		Assert.assertEquals(1, questions.size());
+		Assert.assertEquals(1, choices.size());
 
 		PollsChoice choice = (PollsChoice)choices.get(0);
 
