diff --git a/packages/SystemUI/src/com/android/systemui/qs/tiles/BatterySaverTile.java b/packages/SystemUI/src/com/android/systemui/qs/tiles/BatterySaverTile.java
index 089d07a..3f419a8 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/tiles/BatterySaverTile.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/tiles/BatterySaverTile.java
@@ -80,7 +80,7 @@
 
     @Override
     protected void handleUpdateState(BooleanState state, Object arg) {
-        state.state = mCharging ? Tile.STATE_UNAVAILABLE
+        state.state = mPluggedIn ? Tile.STATE_UNAVAILABLE
                 : mPowerSave ? Tile.STATE_ACTIVE : Tile.STATE_INACTIVE;
         BatterySaverIcon bsi = new BatterySaverIcon();
         bsi.mState = state.state;
