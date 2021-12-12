diff --git a/location/java/android/location/LocationManager.java b/location/java/android/location/LocationManager.java
index 2b3ed87..da0e515 100644
--- a/location/java/android/location/LocationManager.java
+++ b/location/java/android/location/LocationManager.java
@@ -1465,7 +1465,7 @@
             mGpsNmeaListener = null;
             mNmeaBuffer = null;
             mOldGnssCallback = null;
-            mGnssCallback = new GnssStatus.Callback() {
+            mGnssCallback = mGpsListener != null ? new GnssStatus.Callback() {
                 @Override
                 public void onStarted() {
                     mGpsListener.onGpsStatusChanged(GpsStatus.GPS_EVENT_STARTED);
@@ -1485,7 +1485,7 @@
                 public void onSatelliteStatusChanged(GnssStatus status) {
                     mGpsListener.onGpsStatusChanged(GpsStatus.GPS_EVENT_SATELLITE_STATUS);
                 }
-            };
+            } : null;
             mOldGnssNmeaListener = null;
             mGnssNmeaListener = null;
         }
@@ -1502,12 +1502,12 @@
             mOldGnssCallback = null;
             mGnssCallback = null;
             mOldGnssNmeaListener = null;
-            mGnssNmeaListener = new OnNmeaMessageListener() {
+            mGnssNmeaListener = mGpsNmeaListener != null ? new OnNmeaMessageListener() {
                 @Override
                 public void onNmeaMessage(String nmea, long timestamp) {
                     mGpsNmeaListener.onNmeaReceived(timestamp, nmea);
                 }
-            };
+            } : null;
         }
 
         GnssStatusListenerTransport(GnssStatusCallback callback) {
@@ -1516,7 +1516,7 @@
 
         GnssStatusListenerTransport(GnssStatusCallback callback, Handler handler) {
             mOldGnssCallback = callback;
-            mGnssCallback = new GnssStatus.Callback() {
+            mGnssCallback = mOldGnssCallback != null ? new GnssStatus.Callback() {
                 @Override
                 public void onStarted() {
                     mOldGnssCallback.onStarted();
@@ -1536,7 +1536,7 @@
                 public void onSatelliteStatusChanged(GnssStatus status) {
                     mOldGnssCallback.onSatelliteStatusChanged(status);
                 }
-            };
+            } : null;
             mGnssHandler = new GnssHandler(handler);
             mOldGnssNmeaListener = null;
             mGnssNmeaListener = null;
@@ -1569,12 +1569,12 @@
             mOldGnssCallback = null;
             mGnssHandler = new GnssHandler(handler);
             mOldGnssNmeaListener = listener;
-            mGnssNmeaListener = new OnNmeaMessageListener() {
+            mGnssNmeaListener = mOldGnssNmeaListener != null ? new OnNmeaMessageListener() {
                 @Override
                 public void onNmeaMessage(String message, long timestamp) {
                     mOldGnssNmeaListener.onNmeaReceived(timestamp, message);
                 }
-            };
+            } : null;
             mGpsListener = null;
             mGpsNmeaListener = null;
             mNmeaBuffer = new ArrayList<Nmea>();
@@ -1597,7 +1597,7 @@
 
         @Override
         public void onGnssStarted() {
-            if (mGpsListener != null) {
+            if (mGnssCallback != null) {
                 Message msg = Message.obtain();
                 msg.what = GpsStatus.GPS_EVENT_STARTED;
                 mGnssHandler.sendMessage(msg);
@@ -1606,7 +1606,7 @@
 
         @Override
         public void onGnssStopped() {
-            if (mGpsListener != null) {
+            if (mGnssCallback != null) {
                 Message msg = Message.obtain();
                 msg.what = GpsStatus.GPS_EVENT_STOPPED;
                 mGnssHandler.sendMessage(msg);
@@ -1615,7 +1615,7 @@
 
         @Override
         public void onFirstFix(int ttff) {
-            if (mGpsListener != null) {
+            if (mGnssCallback != null) {
                 mTimeToFirstFix = ttff;
                 Message msg = Message.obtain();
                 msg.what = GpsStatus.GPS_EVENT_FIRST_FIX;
