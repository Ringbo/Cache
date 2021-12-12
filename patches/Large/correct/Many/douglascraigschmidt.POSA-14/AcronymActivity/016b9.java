diff --git a/ex/AcronymApplication/src/edu/vuum/mocca/AcronymActivity.java b/ex/AcronymApplication/src/edu/vuum/mocca/AcronymActivity.java
index 6b37727..d7d2fc6 100644
--- a/ex/AcronymApplication/src/edu/vuum/mocca/AcronymActivity.java
+++ b/ex/AcronymApplication/src/edu/vuum/mocca/AcronymActivity.java
@@ -27,27 +27,27 @@
     /**
      * The ListView that will display the results to the user.
      */
-    ListView mListView;
+     private ListView mListView;
 
     /**
      * A custom ArrayAdapter used to display the list of AcronymData objects.
      */
-    AcronymDataArrayAdapter adapter;
+    private AcronymDataArrayAdapter adapter;
     
     /**
      * Acronym entered by the usre.
      */
-    EditText mEditText;
+    private EditText mEditText;
 
     /**
-     * The implementation of the AcronymResults AIDL
-     * Interface. Should be passed to the WebService using the
+     * The implementation of the AcronymResults AIDL Interface.
+     * Should be passed to the WebService using the
      * AcronymRequest.expandAcronym() method.
      * 
      * This implementation of AcronymResults.Stub plays the role of
      * Invoker in the Broker Pattern.
      */
-    AcronymResults.Stub mAcronymResults = new AcronymResults.Stub() {
+    private AcronymResults.Stub mAcronymResults = new AcronymResults.Stub() {
             /**
              * This method is called back by the Service to return the
              * results.
@@ -68,10 +68,10 @@
 	};
 
     /**
-     * This ServiceConnection is used to receive results after binding
-     * to the AcronymServiceAsync Service using bindService().
+     * This GenericServiceConnection is used to receive results after
+     * binding to the AcronymServiceAsync Service using bindService().
      */
-    GenericServiceConnection<AcronymRequest> mServiceConnectionAsync =
+    private GenericServiceConnection<AcronymRequest> mServiceConnectionAsync =
         new GenericServiceConnection<AcronymRequest>
         (new GenericServiceConnection.InterfaceFactory<AcronymRequest>() {
             public AcronymRequest asInterface(IBinder service) { 
@@ -79,10 +79,10 @@
             }});
 
     /**
-     * This ServiceConnection is used to receive results after binding
-     * to the AcronymServiceSync Service using bindService().
+     * This GenericServiceConnection is used to receive results after
+     * binding to the AcronymServiceSync Service using bindService().
      */
-    GenericServiceConnection<AcronymCall> mServiceConnectionSync =
+    private GenericServiceConnection<AcronymCall> mServiceConnectionSync =
         new GenericServiceConnection<AcronymCall>
         (new GenericServiceConnection.InterfaceFactory<AcronymCall>() {
             public AcronymCall asInterface(IBinder service) { 
@@ -90,8 +90,8 @@
             }});
 
     /**
-     * Called when the activity is starting. This is where most initialization
-     * should go.
+     * Called when the activity is starting - this is where most
+     * initialization should go.
      */
     @Override
 	protected void onCreate(Bundle savedInstanceState) {
@@ -105,7 +105,7 @@
     }
 
     /*
-     * Start the asynchronous Acronym lookup.
+     * Initiate the asynchronous acronym lookup.
      */
     public void expandAcronymAsync(View v) {
         AcronymRequest acronymRequest = 
@@ -119,7 +119,10 @@
 
             try {
                 // Invoke a one-way AIDL call, which does not block
-                // the client.
+                // the client.  The results are returned via the
+                // sendResults() method of the mAcronymResults
+                // callback object, which runs in a Thread from the
+                // Thread pool managed by the Binder framework.
                 acronymRequest.expandAcronym(mAcronymResults,
                                              acronym);
             } catch (RemoteException e) {
@@ -131,7 +134,7 @@
     }
 
     /*
-     * Start the synchronous Acronym lookup.
+     * Initiate the synchronous acronym lookup.
      */
     public void expandAcronymSync(View v) {
         final AcronymCall acronymCall = 
@@ -198,8 +201,8 @@
     }
 
     /**
-     * Hook method called when the MainActivity becomes visible to bind the
-     * Activity to the Services.
+     * Hook method called when the MainActivity becomes visible to
+     * bind the Activity to the Services.
      */
     @Override
     public void onStart() {
