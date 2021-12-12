diff --git a/sonar-server/src/test/java/org/sonar/server/issue/SetSeverityActionTest.java b/sonar-server/src/test/java/org/sonar/server/issue/SetSeverityActionTest.java
index 0148ab2..487f9bb 100644
--- a/sonar-server/src/test/java/org/sonar/server/issue/SetSeverityActionTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/issue/SetSeverityActionTest.java
@@ -57,7 +57,7 @@
     when(context.issue()).thenReturn(issue);
 
     action.execute(properties, context);
-    verify(issueUpdater).setSeverity(eq(issue), eq(severity), any(IssueChangeContext.class));
+    verify(issueUpdater).setManualSeverity(eq(issue), eq(severity), any(IssueChangeContext.class));
   }
 
   @Test
