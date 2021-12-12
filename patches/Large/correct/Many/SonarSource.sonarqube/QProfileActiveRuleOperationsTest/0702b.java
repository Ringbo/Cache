diff --git a/sonar-server/src/test/java/org/sonar/server/qualityprofile/QProfileActiveRuleOperationsTest.java b/sonar-server/src/test/java/org/sonar/server/qualityprofile/QProfileActiveRuleOperationsTest.java
index 0bdca8f..c6193ac 100644
--- a/sonar-server/src/test/java/org/sonar/server/qualityprofile/QProfileActiveRuleOperationsTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/qualityprofile/QProfileActiveRuleOperationsTest.java
@@ -243,10 +243,10 @@
     when(profileDao.selectById(1, session)).thenReturn(new QualityProfileDto().setId(1).setName("Default").setLanguage("java"));
     when(ruleDao.selectById(10, session)).thenReturn(new RuleDto().setId(10));
     ActiveRuleDto activeRule = new ActiveRuleDto().setId(5).setProfileId(1).setRuleId(10).setSeverity(1);
-    when(activeRuleDao.selectByProfileAndRule(1, 10, session)).thenReturn(activeRule);
+    when(activeRuleDao.selectById(5, session)).thenReturn(activeRule);
     when(profilesManager.deactivated(eq(1), anyInt(), eq("Nicolas"))).thenReturn(new ProfilesManager.RuleInheritanceActions());
 
-    operations.deactivateRules(1, newArrayList(10), authorizedUserSession);
+    operations.deactivateRules(1, newArrayList(5), authorizedUserSession);
 
     verify(activeRuleDao).delete(eq(5), eq(session));
     verify(activeRuleDao).deleteParameters(eq(5), eq(session));
