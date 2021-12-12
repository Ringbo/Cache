diff --git a/src/org/thoughtcrime/securesms/jobs/MmsDownloadJob.java b/src/org/thoughtcrime/securesms/jobs/MmsDownloadJob.java
index 1adb6e0..c98c8c9 100644
--- a/src/org/thoughtcrime/securesms/jobs/MmsDownloadJob.java
+++ b/src/org/thoughtcrime/securesms/jobs/MmsDownloadJob.java
@@ -220,7 +220,7 @@
       }
     }
 
-    if (members.size() > 1) {
+    if (members.size() > 2) {
       group = Optional.of(Address.fromSerialized(DatabaseFactory.getGroupDatabase(context).getOrCreateGroupForMembers(new LinkedList<>(members), true)));
     }
 
