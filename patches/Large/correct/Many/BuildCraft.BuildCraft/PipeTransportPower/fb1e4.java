diff --git a/common/buildcraft/transport/PipeTransportPower.java b/common/buildcraft/transport/PipeTransportPower.java
index a940ac4..e35362e 100644
--- a/common/buildcraft/transport/PipeTransportPower.java
+++ b/common/buildcraft/transport/PipeTransportPower.java
@@ -184,7 +184,7 @@
 			internalPower = internalNextPower;
 			internalNextPower = next;
 			for (int i = 0; i < nextPowerQuery.length; i++) {
-				if (powerQuery[i] == 0.0d) {
+				if (powerQuery[i] == 0.0d && internalNextPower[i] > 0) {
 					internalNextPower[i]-=1;
 				}
 			}
