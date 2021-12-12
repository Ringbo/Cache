diff --git a/sonar-db/src/test/java/org/sonar/db/component/SnapshotDaoTest.java b/sonar-db/src/test/java/org/sonar/db/component/SnapshotDaoTest.java
index d4e65fc..7d9092c 100644
--- a/sonar-db/src/test/java/org/sonar/db/component/SnapshotDaoTest.java
+++ b/sonar-db/src/test/java/org/sonar/db/component/SnapshotDaoTest.java
@@ -169,7 +169,7 @@
   }
 
   @Test
-  public void select_previous_version_snapshots() throws Exception {
+  public void select_previous_version_snapshots() {
     db.prepareDbUnit(getClass(), "select_previous_version_snapshots.xml");
 
     List<SnapshotDto> snapshots = sut.selectPreviousVersionSnapshots(session, 1L, "1.2-SNAPSHOT");
