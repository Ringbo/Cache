diff --git a/ui/src/org/pentaho/di/ui/spoon/Spoon.java b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
index c9a7825..eee0781 100644
--- a/ui/src/org/pentaho/di/ui/spoon/Spoon.java
+++ b/ui/src/org/pentaho/di/ui/spoon/Spoon.java
@@ -2565,7 +2565,7 @@
     }
     if ( jobMeta != null ) {
 
-      TabMapEntry entry = delegates.tabs.findTabMapEntry( transMeta );
+      TabMapEntry entry = delegates.tabs.findTabMapEntry( jobMeta );
       if ( entry != null ) {
         int current = tabfolder.getSelectedIndex();
         int desired = tabfolder.indexOf( entry.getTabItem() );
