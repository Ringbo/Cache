diff --git a/sonar-batch/src/main/java/org/sonar/batch/index/ViolationPersister.java b/sonar-batch/src/main/java/org/sonar/batch/index/ViolationPersister.java
index 2334c0f..0b15823 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/index/ViolationPersister.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/index/ViolationPersister.java
@@ -57,11 +57,11 @@
     }
     model.setSnapshotId(snapshot.getId());
     model.setChecksum(checksum);
-    session.save(model);
+    session.saveWithoutFlush(model);
 
     if (model.getPermanentId()==null) {
       model.setPermanentId(model.getId());
-      session.save(model);
+      session.saveWithoutFlush(model);
     }
 
     // the following fields can have been changed
