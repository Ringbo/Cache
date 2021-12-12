diff --git a/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeDaoTest.java b/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeDaoTest.java
index 5579545..e7686ee 100644
--- a/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeDaoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/issue/IssueChangeDaoTest.java
@@ -105,7 +105,8 @@
     dbTester.prepareDbUnit(getClass(), "selectChangelogOfNonClosedIssuesByComponent.xml");
 
     List<IssueChangeDto> dtos = dao.selectChangelogOfNonClosedIssuesByComponent("FILE_1");
-    assertThat(dtos).extracting("id").containsExactly(100L, 103L);
+    // no need to have ordered results (see NewDebtCalculator)
+    assertThat(dtos).extracting("id").containsOnly(100L, 103L);
   }
 
   @Test
