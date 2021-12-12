diff --git a/src/main/java/com/gitblit/models/PluginRegistry.java b/src/main/java/com/gitblit/models/PluginRegistry.java
index 8da3457..3f692bc 100644
--- a/src/main/java/com/gitblit/models/PluginRegistry.java
+++ b/src/main/java/com/gitblit/models/PluginRegistry.java
@@ -126,7 +126,7 @@
 			Version ir = Version.createVersion(installedRelease);
 			Version cr = Version.ZERO;
 			PluginRelease curr = getCurrentRelease(system);
-			if (cr != null) {
+			if (curr != null) {
 				cr = Version.createVersion(curr.version);
 			}
 			switch (ir.compareTo(cr)) {
