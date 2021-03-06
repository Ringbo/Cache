diff --git a/liquibase-core/src/test/java/liquibase/changelog/RanChangeSetTest.java b/liquibase-core/src/test/java/liquibase/changelog/RanChangeSetTest.java
index 3142d3b..8546b43 100644
--- a/liquibase-core/src/test/java/liquibase/changelog/RanChangeSetTest.java
+++ b/liquibase-core/src/test/java/liquibase/changelog/RanChangeSetTest.java
@@ -8,7 +8,7 @@
 
     @Test
     public void is_same_as_when_both_changelogs_have_classpath_prefix() throws Exception {
-        RanChangeSet ranChangeSet = new RanChangeSet("classpath:/db/file.log", "1", "author", null, null, null, null, null, null, null, null);
+        RanChangeSet ranChangeSet = new RanChangeSet("classpath:/db/file.log", "1", "author", null, null, null, null, null, null, null, null, null);
         ChangeSet incomingChangeSet = new ChangeSet("1", "author", false, false, "classpath:/db/file.log", null, null, null);
         assertTrue(ranChangeSet.isSameAs(incomingChangeSet));
     }
