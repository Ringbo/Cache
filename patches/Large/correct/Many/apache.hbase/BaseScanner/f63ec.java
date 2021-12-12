diff --git a/src/java/org/apache/hadoop/hbase/master/BaseScanner.java b/src/java/org/apache/hadoop/hbase/master/BaseScanner.java
index cdcd77b..3ef9898 100644
--- a/src/java/org/apache/hadoop/hbase/master/BaseScanner.java
+++ b/src/java/org/apache/hadoop/hbase/master/BaseScanner.java
@@ -240,7 +240,8 @@
       return false;
     }
     if (!info.isOffline()) {
-      LOG.warn("Region is split but not offline: " + info.getRegionName());
+      LOG.warn("Region is split but not offline: " +
+        info.getRegionNameAsString());
     }
     return true;
   }
@@ -268,7 +269,7 @@
         parent.getRegionName(), rowContent, COL_SPLITB);
     
     if (!hasReferencesA && !hasReferencesB) {
-      LOG.info("Deleting region " + parent.getRegionName() +
+      LOG.info("Deleting region " + parent.getRegionNameAsString() +
         " because daughter splits no longer hold references");
       HRegion.deleteRegion(master.fs, master.rootdir, parent);
       
@@ -334,8 +335,8 @@
     }
     
     if (LOG.isDebugEnabled()) {
-      LOG.debug(split.getRegionName().toString()
-          +" no longer has references to " + parent.toString());
+      LOG.debug(split.getRegionNameAsString() +
+        " no longer has references to " + parent.toString());
     }
     
     BatchUpdate b = new BatchUpdate(parent);
@@ -365,7 +366,7 @@
         // Skip if region is on kill list
         if(LOG.isDebugEnabled()) {
           LOG.debug("not assigning region (on kill list): " +
-            info.getRegionName());
+            info.getRegionNameAsString());
         }
         return;
       }
@@ -385,7 +386,7 @@
       // The current assignment is invalid
       if (LOG.isDebugEnabled()) {
         LOG.debug("Current assignment of " +
-          Bytes.toString(info.getRegionName()) +
+          info.getRegionNameAsString() +
           " is not valid: serverInfo: " + storedInfo + ", passed startCode: " +
           startCode + ", storedInfo.startCode: " +
           ((storedInfo != null)? storedInfo.getStartCode(): -1) +
