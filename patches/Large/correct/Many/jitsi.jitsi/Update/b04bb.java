diff --git a/src/net/java/sip/communicator/plugin/update/Update.java b/src/net/java/sip/communicator/plugin/update/Update.java
index ee9100d..bdba08a 100644
--- a/src/net/java/sip/communicator/plugin/update/Update.java
+++ b/src/net/java/sip/communicator/plugin/update/Update.java
@@ -851,7 +851,7 @@
 
             Version ver = getCurrentVersion();
 
-            if(ver.isPreRelease())
+            if(ver.isNightly())
                 deltaTarget = ver.getNightlyBuildID();
             else
                 deltaTarget = String.valueOf(ver.getVersionRevision());
