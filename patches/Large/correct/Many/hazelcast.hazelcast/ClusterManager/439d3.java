diff --git a/hazelcast/src/main/java/com/hazelcast/cluster/ClusterManager.java b/hazelcast/src/main/java/com/hazelcast/cluster/ClusterManager.java
index b743d4b..c1c8299 100644
--- a/hazelcast/src/main/java/com/hazelcast/cluster/ClusterManager.java
+++ b/hazelcast/src/main/java/com/hazelcast/cluster/ClusterManager.java
@@ -28,9 +28,9 @@
 
 public final class ClusterManager extends BaseManager implements ConnectionListener {
 
-    private final int WAIT_SECONDS_BEFORE_JOIN = ConfigProperty.WAIT_SECONDS_BEFORE_JOIN.getInteger();
+    private final long WAIT_MILLIS_BEFORE_JOIN = ConfigProperty.WAIT_SECONDS_BEFORE_JOIN.getInteger() * 1000L;
 
-    private final int MAX_NO_HEARTBEAT_SECONDS = ConfigProperty.MAX_NO_HEARTBEAT_SECONDS.getInteger();
+    private final long MAX_NO_HEARTBEAT_MILLIS = ConfigProperty.MAX_NO_HEARTBEAT_SECONDS.getInteger() * 1000L;
 
     Set<ScheduledAction> setScheduledActions = new HashSet<ScheduledAction>(1000);
 
@@ -156,7 +156,7 @@
                     try {
                         Connection conn = node.connectionManager.getConnection(address);
                         if (conn != null && conn.live()) {
-                            if ((now - memberImpl.getLastRead()) >= (MAX_NO_HEARTBEAT_SECONDS * 1000L)) {
+                            if ((now - memberImpl.getLastRead()) >= (MAX_NO_HEARTBEAT_MILLIS)) {
                                 conn = null;
                                 if (lsDeadAddresses == null) {
                                     lsDeadAddresses = new ArrayList<Address>();
@@ -189,7 +189,7 @@
                 MemberImpl masterMember = getMember(getMasterAddress());
                 boolean removed = false;
                 if (masterMember != null) {
-                    if ((now - masterMember.getLastRead()) >= (MAX_NO_HEARTBEAT_SECONDS * 1000L)) {
+                    if ((now - masterMember.getLastRead()) >= (MAX_NO_HEARTBEAT_MILLIS)) {
                         doRemoveAddress(getMasterAddress());
                         removed = true;
                     }
@@ -339,7 +339,7 @@
                 if (setJoins.add(newMemberInfo)) {
                     sendProcessableTo(new Master(node.getMasterAddress()), conn);
                     // sendAddRemoveToAllConns(newAddress);
-                    timeToStartJoin = System.currentTimeMillis() + (WAIT_SECONDS_BEFORE_JOIN * 1000L);
+                    timeToStartJoin = System.currentTimeMillis() + WAIT_MILLIS_BEFORE_JOIN;
                 } else {
                     if (System.currentTimeMillis() > timeToStartJoin) {
                         startJoin();
@@ -401,7 +401,7 @@
     void joinReset() {
         joinInProgress = false;
         setJoins.clear();
-        timeToStartJoin = System.currentTimeMillis() + WAIT_SECONDS_BEFORE_JOIN + 1000;
+        timeToStartJoin = System.currentTimeMillis() + WAIT_MILLIS_BEFORE_JOIN;
     }
 
     public class AsyncRemotelyObjectCallable extends TargetAwareOp {
