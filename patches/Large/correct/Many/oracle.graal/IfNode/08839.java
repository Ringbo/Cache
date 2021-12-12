diff --git a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
index 5e6a863..f92185c 100644
--- a/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
+++ b/graal/com.oracle.graal.nodes/src/com/oracle/graal/nodes/IfNode.java
@@ -197,7 +197,7 @@
             if (b instanceof IsNullNode) {
                 IsNullNode isNullNode = (IsNullNode) b;
                 if (isNullNode.object() == instanceOfA.object()) {
-                    if (instanceOfA.profile().getNullSeen() != TriState.FALSE) {
+                    if (instanceOfA.profile() != null && instanceOfA.profile().getNullSeen() != TriState.FALSE) {
                         instanceOfA.setProfile(new JavaTypeProfile(TriState.FALSE, instanceOfA.profile().getNotRecordedProbability(), instanceOfA.profile().getTypes()));
                     }
                     Debug.log("Can swap instanceof and isnull if");
