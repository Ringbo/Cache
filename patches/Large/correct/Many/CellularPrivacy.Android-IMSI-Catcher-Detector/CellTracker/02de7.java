diff --git a/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java b/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
index da155ed..b1095e2 100644
--- a/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
+++ b/app/src/main/java/com/SecUpwN/AIMSICD/service/CellTracker.java
@@ -537,7 +537,7 @@
          */
         //TinyDB tinydb = new TinyDB(context);
         Integer ncls = 0;
-        if(tm != null) //https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/issues/383
+        if(tm != null && tm.getNeighboringCellInfo() != null) //https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/issues/383
             ncls = tm.getNeighboringCellInfo().size(); // NC list size
         Boolean nclp = tinydb.getBoolean("nc_list_present"); // NC list present? (default is false)
 
