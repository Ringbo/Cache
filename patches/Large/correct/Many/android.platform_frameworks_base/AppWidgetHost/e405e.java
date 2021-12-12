diff --git a/core/java/android/appwidget/AppWidgetHost.java b/core/java/android/appwidget/AppWidgetHost.java
index 24c6793..8e86824 100644
--- a/core/java/android/appwidget/AppWidgetHost.java
+++ b/core/java/android/appwidget/AppWidgetHost.java
@@ -57,7 +57,7 @@
     static IAppWidgetService sService;
     private DisplayMetrics mDisplayMetrics;
 
-    Context mContext;
+    private String mContextOpPackageName;
     Handler mHandler;
     int mHostId;
     Callbacks mCallbacks = new Callbacks();
@@ -128,7 +128,7 @@
      * @hide
      */
     public AppWidgetHost(Context context, int hostId, OnClickHandler handler, Looper looper) {
-        mContext = context;
+        mContextOpPackageName = context.getOpPackageName();
         mHostId = hostId;
         mOnClickHandler = handler;
         mHandler = new UpdateHandler(looper);
@@ -154,7 +154,7 @@
         int[] updatedIds;
         ArrayList<RemoteViews> updatedViews = new ArrayList<RemoteViews>();
         try {
-            updatedIds = sService.startListening(mCallbacks, mContext.getOpPackageName(), mHostId,
+            updatedIds = sService.startListening(mCallbacks, mContextOpPackageName, mHostId,
                     updatedViews);
         }
         catch (RemoteException e) {
@@ -173,7 +173,7 @@
      */
     public void stopListening() {
         try {
-            sService.stopListening(mContext.getOpPackageName(), mHostId);
+            sService.stopListening(mContextOpPackageName, mHostId);
         }
         catch (RemoteException e) {
             throw new RuntimeException("system server dead?", e);
@@ -191,7 +191,7 @@
      */
     public int allocateAppWidgetId() {
         try {
-            return sService.allocateAppWidgetId(mContext.getOpPackageName(), mHostId);
+            return sService.allocateAppWidgetId(mContextOpPackageName, mHostId);
         }
         catch (RemoteException e) {
             throw new RuntimeException("system server dead?", e);
@@ -221,7 +221,7 @@
             int appWidgetId, int intentFlags, int requestCode, @Nullable Bundle options) {
         try {
             IntentSender intentSender = sService.createAppWidgetConfigIntentSender(
-                    mContext.getOpPackageName(), appWidgetId, intentFlags);
+                    mContextOpPackageName, appWidgetId, intentFlags);
             if (intentSender != null) {
                 activity.startIntentSenderForResult(intentSender, requestCode, null, 0, 0, 0,
                         options);
@@ -245,7 +245,7 @@
             if (sService == null) {
                 bindService();
             }
-            return sService.getAppWidgetIdsForHost(mContext.getOpPackageName(), mHostId);
+            return sService.getAppWidgetIdsForHost(mContextOpPackageName, mHostId);
         } catch (RemoteException e) {
             throw new RuntimeException("system server dead?", e);
         }
@@ -262,7 +262,7 @@
         synchronized (mViews) {
             mViews.remove(appWidgetId);
             try {
-                sService.deleteAppWidgetId(mContext.getOpPackageName(), appWidgetId);
+                sService.deleteAppWidgetId(mContextOpPackageName, appWidgetId);
             }
             catch (RemoteException e) {
                 throw new RuntimeException("system server dead?", e);
@@ -280,7 +280,7 @@
      */
     public void deleteHost() {
         try {
-            sService.deleteHost(mContext.getOpPackageName(), mHostId);
+            sService.deleteHost(mContextOpPackageName, mHostId);
         }
         catch (RemoteException e) {
             throw new RuntimeException("system server dead?", e);
@@ -310,7 +310,7 @@
      */
     public final AppWidgetHostView createView(Context context, int appWidgetId,
             AppWidgetProviderInfo appWidget) {
-        AppWidgetHostView view = onCreateView(mContext, appWidgetId, appWidget);
+        AppWidgetHostView view = onCreateView(context, appWidgetId, appWidget);
         view.setOnClickHandler(mOnClickHandler);
         view.setAppWidget(appWidgetId, appWidget);
         synchronized (mViews) {
@@ -318,7 +318,7 @@
         }
         RemoteViews views;
         try {
-            views = sService.getAppWidgetViews(mContext.getOpPackageName(), appWidgetId);
+            views = sService.getAppWidgetViews(mContextOpPackageName, appWidgetId);
         } catch (RemoteException e) {
             throw new RuntimeException("system server dead?", e);
         }
