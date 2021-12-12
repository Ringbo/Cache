diff --git a/src/be/ibridge/kettle/repository/Repository.java b/src/be/ibridge/kettle/repository/Repository.java
index 32b92f0..cb1f2fb 100644
--- a/src/be/ibridge/kettle/repository/Repository.java
+++ b/src/be/ibridge/kettle/repository/Repository.java
@@ -5216,7 +5216,7 @@
         JobEntryLoader jobEntryLoader = JobEntryLoader.getInstance();
         JobPlugin[] jobPlugins = jobEntryLoader.getJobEntriesWithType(JobPlugin.TYPE_ALL);
         
-        for (int i = 1; i < jobPlugins.length; i++)
+        for (int i = 0; i < jobPlugins.length; i++)
         {
             String type_desc = jobPlugins[i].getID();
             String type_desc_long = jobPlugins[i].getDescription();
