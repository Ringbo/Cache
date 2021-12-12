diff --git a/hazelcast/src/main/java/com/hazelcast/cluster/ClusterImpl.java b/hazelcast/src/main/java/com/hazelcast/cluster/ClusterImpl.java
index 8309ee5..1ee73ff 100644
--- a/hazelcast/src/main/java/com/hazelcast/cluster/ClusterImpl.java
+++ b/hazelcast/src/main/java/com/hazelcast/cluster/ClusterImpl.java
@@ -59,7 +59,7 @@
             if (clusterMember == null) {
                 clusterMember = dummy; 
                 if (listenerSet != null && listenerSet.size() > 0) {
-                    node.executorManager.executeLocaly(new Runnable() {
+                    node.executorManager.executeLocally(new Runnable() {
                         public void run() {
                             MembershipEvent membershipEvent = new MembershipEvent(ClusterImpl.this,
                                     dummy, MembershipEvent.MEMBER_ADDED);
@@ -79,7 +79,7 @@
             Set<Member> it = clusterMembers.keySet();
             for (final Member cm : it) {
                 if (!setNew.contains(cm)) {
-                    node.executorManager.executeLocaly(new Runnable() {
+                    node.executorManager.executeLocally(new Runnable() {
                         public void run() {
                             MembershipEvent membershipEvent = new MembershipEvent(ClusterImpl.this,
                                     cm, MembershipEvent.MEMBER_REMOVED);
