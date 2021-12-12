diff --git a/src/org/pentaho/di/trans/step/BaseStep.java b/src/org/pentaho/di/trans/step/BaseStep.java
index 7992165..7298126 100644
--- a/src/org/pentaho/di/trans/step/BaseStep.java
+++ b/src/org/pentaho/di/trans/step/BaseStep.java
@@ -997,7 +997,7 @@
         
         // This rowSet is perhaps no longer giving back rows?
         //
-        while (row==null) {
+        while (row==null && !stopped.get()) {
         	// Try the next input row set(s) until we find a row set that still has rows...
         	// The getRowFrom() method removes row sets from the input row sets list.
         	//
