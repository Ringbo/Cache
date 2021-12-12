diff --git a/it/it-tests/src/test/java/it/issue/IssueActionTest.java b/it/it-tests/src/test/java/it/issue/IssueActionTest.java
index dfc0bac..0006ac9 100644
--- a/it/it-tests/src/test/java/it/issue/IssueActionTest.java
+++ b/it/it-tests/src/test/java/it/issue/IssueActionTest.java
@@ -189,7 +189,7 @@
       issuesService.assign(new AssignRequest(randomIssue.getKey(), "unknown"));
       fail();
     } catch (org.sonarqube.ws.client.HttpException ex) {
-      assertThat(ex.code()).isEqualTo(400);
+      assertThat(ex.code()).isEqualTo(404);
     }
   }
 
