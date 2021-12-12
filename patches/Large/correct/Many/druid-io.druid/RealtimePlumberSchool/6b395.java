diff --git a/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumberSchool.java b/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumberSchool.java
index b270398..2a8a096 100644
--- a/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumberSchool.java
+++ b/server/src/main/java/io/druid/segment/realtime/plumber/RealtimePlumberSchool.java
@@ -92,7 +92,7 @@
     this.rejectionPolicyFactory = new ServerTimeRejectionPolicyFactory();
     this.maxPendingPersists = (maxPendingPersists > 0) ? maxPendingPersists : defaultPending;
 
-    Preconditions.checkArgument(maxPendingPersists > 0, "RealtimePlumberSchool requires maxPendingPersists > 0");
+    Preconditions.checkArgument(maxPendingPersists <= 0, "RealtimePlumberSchool requires maxPendingPersists > 0");
     Preconditions.checkNotNull(windowPeriod, "RealtimePlumberSchool requires a windowPeriod.");
     Preconditions.checkNotNull(basePersistDirectory, "RealtimePlumberSchool requires a basePersistDirectory.");
     Preconditions.checkNotNull(segmentGranularity, "RealtimePlumberSchool requires a segmentGranularity.");
