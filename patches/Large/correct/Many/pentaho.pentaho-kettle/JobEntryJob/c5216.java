diff --git a/engine/src/org/pentaho/di/job/entries/job/JobEntryJob.java b/engine/src/org/pentaho/di/job/entries/job/JobEntryJob.java
index a8ddfe4..a054838 100644
--- a/engine/src/org/pentaho/di/job/entries/job/JobEntryJob.java
+++ b/engine/src/org/pentaho/di/job/entries/job/JobEntryJob.java
@@ -1196,8 +1196,8 @@
       switch ( specificationMethod ) {
         case FILENAME:
           jobMeta =
-            new JobMeta(
-              ( space != null ? space.environmentSubstitute( getFilename() ) : getFilename() ), rep, null );
+            new JobMeta( space, ( space != null ? space.environmentSubstitute( getFilename() ) : getFilename() ),
+              rep, metaStore, null );
           break;
         case REPOSITORY_BY_NAME:
           if ( rep != null ) {
