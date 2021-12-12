diff --git a/common/buildcraft/transport/triggers/TriggerPipeContents.java b/common/buildcraft/transport/triggers/TriggerPipeContents.java
index 4b4bce4..1e8fa32 100644
--- a/common/buildcraft/transport/triggers/TriggerPipeContents.java
+++ b/common/buildcraft/transport/triggers/TriggerPipeContents.java
@@ -129,14 +129,14 @@
 			switch (kind) {
 				case Empty:
 					for (double s : transportPower.displayPower) {
-						if (s > 0)
+						if (s > 1e-4)
 							return false;
 					}
 
 					return true;
 				case ContainsEnergy:
 					for (double s : transportPower.displayPower) {
-						if (s > 0)
+						if (s > 1e-4)
 							return true;
 					}
 
