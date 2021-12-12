diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java
index ff8de63..2743e00 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/phases/OnStackReplacementPhase.java
@@ -115,7 +115,7 @@
                  * we need to drop the stamp since the types we see during OSR may be too precise
                  * (if a branch was not parsed for example).
                  */
-                proxy.replaceAndDelete(graph.add(new OSRLocalNode(i, proxy.stamp().unrestricted())));
+                proxy.replaceAndDelete(graph.addOrUnique(new OSRLocalNode(i, proxy.stamp().unrestricted())));
             } else {
                 assert value == null || value instanceof OSRLocalNode;
             }
