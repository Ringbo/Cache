diff --git a/common/test/com/thoughtworks/go/domain/JobInstancesTest.java b/common/test/com/thoughtworks/go/domain/JobInstancesTest.java
index cc8a012..2bbe927 100644
--- a/common/test/com/thoughtworks/go/domain/JobInstancesTest.java
+++ b/common/test/com/thoughtworks/go/domain/JobInstancesTest.java
@@ -181,11 +181,11 @@
 
     @Test
     public void shouldReturnLatestTransitionDate() {
-        Date expectedLatest = date(2008, 10, 12);
+        Date expectedLatest = date(3908, 10, 12);
         Date actualLatest = new JobInstances(
                 completed(completed("job1"), JobResult.Failed, expectedLatest),
-                completed(completed("job1"), JobResult.Failed, date(2008, 10, 11)),
-                completed(completed("job1"), JobResult.Failed, date(2008, 10, 5))).latestTransitionDate();
+                completed(completed("job1"), JobResult.Failed, date(3908, 10, 11)),
+                completed(completed("job1"), JobResult.Failed, date(3908, 10, 5))).latestTransitionDate();
         assertThat(actualLatest,is(expectedLatest));
     }
 
