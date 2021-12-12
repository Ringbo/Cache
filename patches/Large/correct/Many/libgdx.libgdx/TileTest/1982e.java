diff --git a/tests/gdx-tests/src/com/badlogic/gdx/tests/TileTest.java b/tests/gdx-tests/src/com/badlogic/gdx/tests/TileTest.java
index 1739621..1740101 100644
--- a/tests/gdx-tests/src/com/badlogic/gdx/tests/TileTest.java
+++ b/tests/gdx-tests/src/com/badlogic/gdx/tests/TileTest.java
@@ -1,3 +1,15 @@
+/*
+ * Copyright 2010 Mario Zechner (contact@badlogicgames.com), Nathan Sweet (admin@esotericsoftware.com)
+ * 
+ * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
+ * License. You may obtain a copy of the License at
+ * 
+ * http://www.apache.org/licenses/LICENSE-2.0
+ * 
+ * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
+ * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
+ * governing permissions and limitations under the License.
+ */
 package com.badlogic.gdx.tests;
 
 import com.badlogic.gdx.Gdx;
@@ -11,7 +23,7 @@
 import com.badlogic.gdx.tests.utils.GdxTest;
 
 public class TileTest extends GdxTest {
-	static final int LAYERS = 10;
+	static final int LAYERS = 5;
 	static final int BLOCK_TILES = 25;
 	static final int WIDTH = 15;
 	static final int HEIGHT = 10;
@@ -26,7 +38,7 @@
 	public void create() {
 		cam = new OrthographicCamera();
 		cam.setViewport(480, 320);
-		cam.getPosition().set(WIDTH*32/2, 10*HEIGHT/2,0);		
+		cam.getPosition().set(WIDTH*32/2, HEIGHT/2,0);		
 		texture = Gdx.graphics.newTexture(Gdx.files.internal("data/tiles.png"), TextureFilter.Nearest, TextureFilter.Nearest, TextureWrap.ClampToEdge, TextureWrap.ClampToEdge);
 		
 		for(int i = 0; i < LAYERS; i++) {
