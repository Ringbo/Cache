diff --git a/osmdroid-forge-app/src/androidTest/java/org/osmdroid/forge/app/MapsForgeMapTileProviderDirectTest.java b/osmdroid-forge-app/src/androidTest/java/org/osmdroid/forge/app/MapsForgeMapTileProviderDirectTest.java
index 12be28c..7d07e29 100644
--- a/osmdroid-forge-app/src/androidTest/java/org/osmdroid/forge/app/MapsForgeMapTileProviderDirectTest.java
+++ b/osmdroid-forge-app/src/androidTest/java/org/osmdroid/forge/app/MapsForgeMapTileProviderDirectTest.java
@@ -1,10 +1,3 @@
-/*
- * WARNING, All test cases exist in osmdroid-android-it/src/main/java (maven project)
- *
- * During build time (with gradle), these tests are copied from osmdroid-android-it to OpenStreetMapViewer/src/androidTest/java
- * DO NOT Modify files in OpenSteetMapViewer/src/androidTest. You will loose your changes when building!
- *
- */
 package org.osmdroid.forge.app;
 
 import android.graphics.Bitmap;
@@ -52,7 +45,7 @@
 	protected void setUp() throws Exception {
 
 		mProvider = new MapsForgeTileProvider(new SimpleRegisterReceiver(getContext()),
-				MapsForgeTileSource.createFromFile(new File[]{new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/osmdroid/world.map")}));
+				MapsForgeTileSource.createFromFiles(new File[]{new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/osmdroid/world.map")}));
 
 		super.setUp();
 	}
