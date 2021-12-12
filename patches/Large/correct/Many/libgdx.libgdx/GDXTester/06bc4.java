diff --git a/gdx-tests-android/src/com/badlogic/gdx/GDXTester.java b/gdx-tests-android/src/com/badlogic/gdx/GDXTester.java
index a554f46..dd972e9 100644
--- a/gdx-tests-android/src/com/badlogic/gdx/GDXTester.java
+++ b/gdx-tests-android/src/com/badlogic/gdx/GDXTester.java
@@ -78,41 +78,41 @@
 			intent = new Intent( this, LagTest.class );
 		if( keyword.equals( items[14] ) )
 			intent = new Intent( this, Pong.class );
-		if( keyword.equals( items[16] ) )
+		if( keyword.equals( items[15] ) )
 			intent = new Intent( this, AudioDeviceTest.class );
-		if( keyword.equals( items[17] ) )
+		if( keyword.equals( items[16] ) )
 			intent = new Intent( this, Mpg123Test.class );
-		if( keyword.equals( items[18] ) )
+		if( keyword.equals( items[17] ) )
 			intent = new Intent( this, VorbisTest.class );
-		if( keyword.equals( items[19] ) )
+		if( keyword.equals( items[18] ) )
 			intent = new Intent( this, PerformanceTest.class );
-		if( keyword.equals( items[20] ) )
+		if( keyword.equals( items[19] ) )
 			intent = new Intent( this, MeshShaderTest.class );
-		if( keyword.equals( items[21] ) )
+		if( keyword.equals( items[20] ) )
 			intent = new Intent( this, SpriteBatchTest.class );
-		if( keyword.equals( items[22] ) )
+		if( keyword.equals( items[21] ) )
 			intent = new Intent( this, SpriteBatchShaderTest.class );
-		if( keyword.equals( items[23] ) )
+		if( keyword.equals( items[22] ) )
 			intent = new Intent( this, FrameBufferTest.class );
-		if( keyword.equals( items[24] ) )
+		if( keyword.equals( items[23] ) )
 			intent = new Intent( this, SpriteBatchRotationTest.class );
-		if( keyword.equals( items[25] ) )
+		if( keyword.equals( items[24] ) )
 			intent = new Intent( this, Box2DTest.class );
-		if( keyword.equals( items[26] ) )
+		if( keyword.equals( items[25] ) )
 			intent = new Intent( this, AudioRecorderTest.class );
-		if( keyword.equals( items[27] ) )
+		if( keyword.equals( items[26] ) )
 			intent = new Intent( this, TestCollection.class );
-		if( keyword.equals( items[28] ) )
+		if( keyword.equals( items[27] ) )
 			intent = new Intent( this, ResourcesTest.class );
-		if( keyword.equals( items[29] ) )
+		if( keyword.equals( items[28] ) )
 			intent = new Intent( this, MD5Test.class );
-		if( keyword.equals( items[30] ) )
+		if( keyword.equals( items[29] ) )
 			intent = new Intent( this, MicroBenchmarks.class );
-		if( keyword.equals( items[31] ) )
+		if( keyword.equals( items[30] ) )
 			intent = new Intent( this, MultitouchTest.class );
-		if( keyword.equals( items[32] ) )
+		if( keyword.equals( items[31] ) )
 			intent = new Intent( this, BufferUtilsTest.class );
-		if( keyword.equals( items[33] ) )
+		if( keyword.equals( items[32] ) )
 			intent = new Intent( this, TerrainTest.class );
 			
 		startActivity( intent );
