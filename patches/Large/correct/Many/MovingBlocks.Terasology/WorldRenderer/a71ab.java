diff --git a/src/main/java/org/terasology/rendering/world/WorldRenderer.java b/src/main/java/org/terasology/rendering/world/WorldRenderer.java
index b4aa325..d500acc 100644
--- a/src/main/java/org/terasology/rendering/world/WorldRenderer.java
+++ b/src/main/java/org/terasology/rendering/world/WorldRenderer.java
@@ -345,9 +345,9 @@
         _worldTimeEventManager.addWorldTimeEvent(new WorldTimeEvent(0.1, true) {
             @Override
             public void run() {
-            	if(getPlayerPosition().z<50)
+            	if(getPlayerPosition().y<50)
             		AudioManager.playMusic("engine:SpacialWinds");
-            	else if(getPlayerPosition().z>175)
+            	else if(getPlayerPosition().y>175)
             		AudioManager.playMusic("engine:Heaven");
             	else
             		AudioManager.playMusic("engine:Sunrise");
@@ -359,9 +359,9 @@
             @Override
             public void run() {
             	//TODO get beter tck instead afternoon
-            	if(getPlayerPosition().z<50)
+            	if(getPlayerPosition().y<50)
             		AudioManager.playMusic("engine:DwarfForge");
-            	else if(getPlayerPosition().z>175)
+            	else if(getPlayerPosition().y>175)
             		AudioManager.playMusic("engine:SpaceExplorers");
             	else
                 AudioManager.playMusic("engine:Afternoon");
@@ -372,9 +372,9 @@
         _worldTimeEventManager.addWorldTimeEvent(new WorldTimeEvent(0.4, true) {
             @Override
             public void run() {
-            	if(getPlayerPosition().z<50)
+            	if(getPlayerPosition().y<50)
             		AudioManager.playMusic("engine:OrcFortress");
-            	else if(getPlayerPosition().z>175)
+            	else if(getPlayerPosition().y>175)
             		AudioManager.playMusic("engine:PeacefulWorld");
             	else
             		AudioManager.playMusic("engine:Sunset");
@@ -385,9 +385,9 @@
         _worldTimeEventManager.addWorldTimeEvent(new WorldTimeEvent(0.6, true) {
             @Override
             public void run() {
-            	if(getPlayerPosition().z<50)
+            	if(getPlayerPosition().y<50)
             		AudioManager.playMusic("engine:CreepyCaves");
-            	else if(getPlayerPosition().z>175)
+            	else if(getPlayerPosition().y>175)
             		AudioManager.playMusic("engine:ShootingStars");
             	else
             		AudioManager.playMusic("engine:Dimlight");
@@ -398,9 +398,9 @@
         _worldTimeEventManager.addWorldTimeEvent(new WorldTimeEvent(0.75, true) {
             @Override
             public void run() {
-            	if(getPlayerPosition().z<50)
+            	if(getPlayerPosition().y<50)
             		AudioManager.playMusic("engine:CreepyCaves");
-            	else if(getPlayerPosition().z>175)
+            	else if(getPlayerPosition().y>175)
             		AudioManager.playMusic("engine:NightTheme");
             	else
             		AudioManager.playMusic("engine:OtherSide");
@@ -411,9 +411,9 @@
         _worldTimeEventManager.addWorldTimeEvent(new WorldTimeEvent(0.9, true) {
             @Override
             public void run() {
-            	if(getPlayerPosition().z<50)
+            	if(getPlayerPosition().y<50)
             		AudioManager.playMusic("engine:CreepyCaves");
-            	else if(getPlayerPosition().z>175)
+            	else if(getPlayerPosition().y>175)
             		AudioManager.playMusic("engine:Heroes");
             	else
             		AudioManager.playMusic("engine:Resurface");
