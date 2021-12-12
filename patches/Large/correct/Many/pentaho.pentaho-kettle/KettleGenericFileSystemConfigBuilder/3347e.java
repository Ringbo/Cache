diff --git a/core/src/org/pentaho/di/core/vfs/configuration/KettleGenericFileSystemConfigBuilder.java b/core/src/org/pentaho/di/core/vfs/configuration/KettleGenericFileSystemConfigBuilder.java
index 9324cda..adb04b0 100644
--- a/core/src/org/pentaho/di/core/vfs/configuration/KettleGenericFileSystemConfigBuilder.java
+++ b/core/src/org/pentaho/di/core/vfs/configuration/KettleGenericFileSystemConfigBuilder.java
@@ -2,7 +2,7 @@
  *
  * Pentaho Data Integration
  *
- * Copyright (C) 2002-2013 by Pentaho : http://www.pentaho.com
+ * Copyright (C) 2002-2017 by Pentaho : http://www.pentaho.com
  *
  *******************************************************************************
  *
@@ -126,14 +126,14 @@
         log.logMinimal( "Warning: Cannot process VFS parameters if no scheme is specified: " + vfsUrl );
       }
     } catch ( FileSystemException e ) {
-      if ( e.getCode().equalsIgnoreCase( "vfs.provider/config-key-invalid.error" ) ) {
+      if ( ( e.getCode() != null ) && ( e.getCode().equalsIgnoreCase( "vfs.provider/config-key-invalid.error" ) ) ) {
         // This key is not supported by the default scheme config builder. This may be a custom key of another config
         // builder
         log.logMinimal( "Warning: The configuration parameter ["
           + name + "] is not supported by the default configuration builder for scheme: " + scheme );
       } else {
         // An unexpected error has occurred loading in parameters
-        throw new IOException( e.getLocalizedMessage() );
+        throw new IOException( e.getLocalizedMessage(), e );
       }
     }
   }
