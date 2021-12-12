diff --git a/dbdialog/test-src/org/pentaho/ui/database/event/FragmentHandlerTest.java b/dbdialog/test-src/org/pentaho/ui/database/event/FragmentHandlerTest.java
index 633f5b1..a06e34e 100644
--- a/dbdialog/test-src/org/pentaho/ui/database/event/FragmentHandlerTest.java
+++ b/dbdialog/test-src/org/pentaho/ui/database/event/FragmentHandlerTest.java
@@ -2,7 +2,7 @@
  *
  * Pentaho Data Integration
  *
- * Copyright (C) 2002-2015 by Pentaho : http://www.pentaho.com
+ * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
  *
  *******************************************************************************
  *
@@ -81,7 +81,7 @@
     XulComponent firstChild = mock( XulComponent.class );
     when( mockDoc.getFirstChild() ).thenReturn( firstChild );
     when( fragmentContainer.getDocumentRoot() ).thenReturn( mockDoc );
-    when( xulDomContainer.loadFragment( anyString(), any() ) ).thenReturn( fragmentContainer );
+    when( xulDomContainer.loadFragment( anyString(), any( Object.class ) ) ).thenReturn( fragmentContainer );
 
     XulTextbox portBox = mock( XulTextbox.class );
     when( document.getElementById( "port-number-text" ) ).thenReturn( portBox );
@@ -119,7 +119,7 @@
     XulComponent firstChild = mock( XulComponent.class );
     when( mockDoc.getFirstChild() ).thenReturn( firstChild );
     when( fragmentContainer.getDocumentRoot() ).thenReturn( mockDoc );
-    when( xulDomContainer.loadFragment( anyString(), any() ) ).thenReturn( fragmentContainer );
+    when( xulDomContainer.loadFragment( anyString(), any( Object.class ) ) ).thenReturn( fragmentContainer );
     fragmentHandler.loadDatabaseOptionsFragment( null );
   }
 
@@ -129,7 +129,7 @@
     XulComponent parent = mock( XulComponent.class );
     when( component.getParent() ).thenReturn( parent );
     when( document.getElementById( "database-options-box" ) ).thenReturn( component );
-    when( xulDomContainer.loadFragment( anyString(), any() ) ).thenThrow( new XulException() );
+    when( xulDomContainer.loadFragment( anyString(), any( Object.class ) ) ).thenThrow( new XulException() );
     fragmentHandler.loadDatabaseOptionsFragment( null );
   }
 
