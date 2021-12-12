diff --git a/engine/src/org/pentaho/di/core/playlist/FilePlayListReplay.java b/engine/src/org/pentaho/di/core/playlist/FilePlayListReplay.java
index 154b2d4..5ab3574 100644
--- a/engine/src/org/pentaho/di/core/playlist/FilePlayListReplay.java
+++ b/engine/src/org/pentaho/di/core/playlist/FilePlayListReplay.java
@@ -2,7 +2,7 @@
  *
  * Pentaho Data Integration
  *
- * Copyright (C) 2002-2013 by Pentaho : http://www.pentaho.com
+ * Copyright (C) 2002-2017 by Pentaho : http://www.pentaho.com
  *
  *******************************************************************************
  *
@@ -99,7 +99,7 @@
 
       FileObject errorFile =
         AbstractFileErrorHandler.getReplayFilename(
-          errorDirectory, file.getName().getURI(), replayDate, errorExtension,
+          errorDirectory, file.getName().getBaseName(), replayDate, errorExtension,
           AbstractFileErrorHandler.NO_PARTS );
       if ( errorFile.exists() ) {
         currentErrorFile = new FilePlayListReplayErrorFile( errorFile, file );
