diff --git a/drools-analytics/src/test/java/org/drools/analytics/ConsequenceTest.java b/drools-analytics/src/test/java/org/drools/analytics/ConsequenceTest.java
index 29c4756..2a77d06 100644
--- a/drools-analytics/src/test/java/org/drools/analytics/ConsequenceTest.java
+++ b/drools-analytics/src/test/java/org/drools/analytics/ConsequenceTest.java
@@ -27,7 +27,7 @@
 		session.setAgendaFilter(new RuleNameMatchesAgendaFilter(
 				"No action - possibly commented out"));
 
-		AnalyticsDataFactory.getAnalyticsData();
+		AnalyticsDataFactory.clearAnalyticsData();
 		Collection<? extends Object> testData = getTestData(this.getClass()
 				.getResourceAsStream("ConsequenceTest.drl"));
 
