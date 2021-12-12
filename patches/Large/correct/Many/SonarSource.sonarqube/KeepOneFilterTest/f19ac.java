diff --git a/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/period/KeepOneFilterTest.java b/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/period/KeepOneFilterTest.java
index 0af92d1..4a9ecd4 100644
--- a/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/period/KeepOneFilterTest.java
+++ b/plugins/sonar-dbcleaner-plugin/src/test/java/org/sonar/plugins/dbcleaner/period/KeepOneFilterTest.java
@@ -78,7 +78,7 @@
   @Test
   public void test_isDeletable() {
     assertThat(KeepOneFilter.isDeletable(createSnapshotWithDate(1L, "2011-05-01"))).isTrue();
-    assertThat(KeepOneFilter.isDeletable(createSnapshotWithDate(1L, "2011-05-01").setLast(true))).isTrue();
+    assertThat(KeepOneFilter.isDeletable(createSnapshotWithDate(1L, "2011-05-01").setLast(true))).isFalse();
     assertThat(KeepOneFilter.isDeletable(createSnapshotWithDate(1L, "2011-05-01").setHasEvents(true))).isFalse();
   }
 
