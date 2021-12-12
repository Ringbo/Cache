diff --git a/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java b/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java
index c50549e..5f808ba 100644
--- a/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/persistence/SemaphoreDaoTest.java
@@ -99,7 +99,7 @@
     SemaphoreDto semaphore = selectSemaphore("foo");
     assertThat(semaphore.getCreatedAt().getTime()).isEqualTo(semaphore.getUpdatedAt().getTime());
 
-    Thread.sleep(500);
+    Thread.sleep(1000);
 
     dao.update(lock);
 
@@ -175,7 +175,7 @@
   }
 
   @Test
-  public void acquire_locked_semaphore_when_timeout_is_zeo() throws Exception {
+  public void acquire_locked_semaphore_when_timeout_is_zero() throws Exception {
     setupData("old_semaphore");
     Semaphores.Semaphore lock = dao.acquire("foo", 0);
     assertThat(lock.isLocked()).isTrue();
