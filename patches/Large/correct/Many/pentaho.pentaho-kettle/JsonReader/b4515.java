diff --git a/engine/src/org/pentaho/di/trans/steps/jsoninput/JsonReader.java b/engine/src/org/pentaho/di/trans/steps/jsoninput/JsonReader.java
index a099bb3..530f431 100644
--- a/engine/src/org/pentaho/di/trans/steps/jsoninput/JsonReader.java
+++ b/engine/src/org/pentaho/di/trans/steps/jsoninput/JsonReader.java
@@ -118,13 +118,13 @@
     InputStreamReader isr = null;
     try {
       isr = new InputStreamReader( KettleVFS.getInputStream( filename ) );
-      Object o = JSONValue.parse( isr );
+      Object o = JSONValue.parseWithException( isr );
       if ( o == null ) {
-        throw new KettleException( BaseMessages.getString( PKG, "JsonReader.Error.ParsingFile", filename ) );
+        throw new Exception( BaseMessages.getString( PKG, "JsonReader.Error.ReadFile.Null" ) );
       }
       eval( o );
     } catch ( Exception e ) {
-      throw new KettleException( e );
+      throw new KettleException( BaseMessages.getString( PKG, "JsonReader.Error.ParsingFile", e ) );
     } finally {
       try {
         if ( isr != null ) {
@@ -138,13 +138,13 @@
 
   public void readString( String value ) throws KettleException {
     try {
-      Object o = JSONValue.parse( value );
+      Object o = JSONValue.parseWithException( value );
       if ( o == null ) {
-        throw new KettleException( BaseMessages.getString( PKG, "JsonReader.Error.ParsingString", value ) );
+        throw new Exception( BaseMessages.getString( PKG, "JsonReader.Error.ReadString.Null" ) );
       }
       eval( o );
     } catch ( Exception e ) {
-      throw new KettleException( e );
+      throw new KettleException( BaseMessages.getString( PKG, "JsonReader.Error.ParsingString", e ) );
     }
   }
 
@@ -155,11 +155,11 @@
       is = new InputStreamReader( url.openConnection().getInputStream() );
       Object o = JSONValue.parse( is );
       if ( o == null ) {
-        throw new KettleException( BaseMessages.getString( PKG, "JsonReader.Error.ParsingUrl", value ) );
+        throw new Exception( BaseMessages.getString( PKG, "JsonReader.Error.ReadUrl.Null" ) );
       }
       eval( o );
     } catch ( Exception e ) {
-      throw new KettleException( e );
+      throw new KettleException( BaseMessages.getString( PKG, "JsonReader.Error.ParsingUrl", e ) );
     } finally {
       try {
         if ( is != null ) {
