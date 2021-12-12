diff --git a/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java b/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java
index c843fcc..c50549e 100644
--- a/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java
@@ -99,7 +99,7 @@
     SemaphoreDto semaphore = selectSemaphore("foo");
     assertThat(semaphore.getCreatedAt().getTime()).isEqualTo(semaphore.getUpdatedAt().getTime());
 
-    Thread.sleep(100);
+    Thread.sleep(500);
 
     dao.update(lock);
 
