diff --git a/server/sonar-server/src/test/java/org/sonar/server/db/migrations/v51/FeedIssueChangesLongDatesTest.java b/server/sonar-server/src/test/java/org/sonar/server/db/migrations/v51/FeedIssueChangesLongDatesTest.java
index 5cd281b..ecc00bb 100644
--- a/server/sonar-server/src/test/java/org/sonar/server/db/migrations/v51/FeedIssueChangesLongDatesTest.java
+++ b/server/sonar-server/src/test/java/org/sonar/server/db/migrations/v51/FeedIssueChangesLongDatesTest.java
@@ -48,6 +48,6 @@
 
     int countWithAllDateFieldsNull = db
       .countSql("select count(*) from issue_changes where created_at_ms is not null and updated_at_ms is not null and issue_change_creation_date_ms is not null");
-    assertThat(countWithAllDateFieldsNull).isEqualTo(1);
+    assertThat(countWithAllDateFieldsNull).isEqualTo(2);
   }
 }
