diff --git a/src-ui/org/pentaho/di/ui/spoon/job/JobLogDelegate.java b/src-ui/org/pentaho/di/ui/spoon/job/JobLogDelegate.java
index 47731e8..b023210 100644
--- a/src-ui/org/pentaho/di/ui/spoon/job/JobLogDelegate.java
+++ b/src-ui/org/pentaho/di/ui/spoon/job/JobLogDelegate.java
@@ -199,7 +199,7 @@
 
 	public void showErrors()
 	{
-		String all = jobLogTab.getText();
+		String all = jobLogText.getText();
 		ArrayList<String> err = new ArrayList<String>();
 		
 		int i = 0;
