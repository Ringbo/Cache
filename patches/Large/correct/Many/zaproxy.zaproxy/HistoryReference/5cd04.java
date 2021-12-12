diff --git a/src/org/parosproxy/paros/model/HistoryReference.java b/src/org/parosproxy/paros/model/HistoryReference.java
index c37e02d..bb94535 100644
--- a/src/org/parosproxy/paros/model/HistoryReference.java
+++ b/src/org/parosproxy/paros/model/HistoryReference.java
@@ -304,10 +304,10 @@
 	   
 	   //If this is the first alert
 	   if(alerts==null)
-		   alerts=new ArrayList<Alert>();
+		   alerts=new ArrayList<Alert>(1);
 	   
 	   for (Alert a : alerts) {
-		   if (a.getAlertId()==alert.getAlertId()) {
+		   if (alert.equals(a)) {
 			   // We've already recorded it
 			   return false;
 		   }
