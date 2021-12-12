diff --git a/ReactNative/android/src/main/java/cn/jiguang/imui/messagelist/ReactMsgListManager.java b/ReactNative/android/src/main/java/cn/jiguang/imui/messagelist/ReactMsgListManager.java
index 5cb9f87..3536f1e 100644
--- a/ReactNative/android/src/main/java/cn/jiguang/imui/messagelist/ReactMsgListManager.java
+++ b/ReactNative/android/src/main/java/cn/jiguang/imui/messagelist/ReactMsgListManager.java
@@ -116,7 +116,7 @@
             EventBus.getDefault().register(this);
         }
         mContext = reactContext;
-        PullToRefreshLayout rootView = (PullToRefreshLayout) LayoutInflater.from(reactContext).inflate(R.layout.ptr_layout, null);
+        final PullToRefreshLayout rootView = (PullToRefreshLayout) LayoutInflater.from(reactContext).inflate(R.layout.ptr_layout, null);
         PtrDefaultHeader header = new PtrDefaultHeader(reactContext);
         int[] colors = reactContext.getResources().getIntArray(R.array.google_colors);
         header.setColorSchemeColors(colors);
@@ -181,7 +181,7 @@
             public void onMessageClick(RCTMessage message) {
                 WritableMap event = Arguments.createMap();
                 event.putString("message", message.toString());
-                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(mMessageList.getId(), ON_MSG_CLICK_EVENT, event);
+                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(rootView.getId(), ON_MSG_CLICK_EVENT, event);
             }
         });
 
@@ -190,7 +190,7 @@
             public void onMessageLongClick(RCTMessage message) {
                 WritableMap event = Arguments.createMap();
                 event.putString("message", message.toString());
-                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(mMessageList.getId(), ON_MSG_LONG_CLICK_EVENT, event);
+                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(rootView.getId(), ON_MSG_LONG_CLICK_EVENT, event);
             }
         });
 
@@ -199,7 +199,7 @@
             public void onAvatarClick(RCTMessage message) {
                 WritableMap event = Arguments.createMap();
                 event.putString("message", message.toString());
-                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(mMessageList.getId(), ON_AVATAR_CLICK_EVENT, event);
+                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(rootView.getId(), ON_AVATAR_CLICK_EVENT, event);
             }
         });
 
@@ -208,7 +208,7 @@
             public void onStatusViewClick(RCTMessage message) {
                 WritableMap event = Arguments.createMap();
                 event.putString("message", message.toString());
-                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(mMessageList.getId(), ON_STATUS_VIEW_CLICK_EVENT, event);
+                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(rootView.getId(), ON_STATUS_VIEW_CLICK_EVENT, event);
             }
         });
 
@@ -218,7 +218,7 @@
                 switch (event.getAction()) {
                     case MotionEvent.ACTION_DOWN:
                         EventBus.getDefault().post(new OnTouchMsgListEvent());
-                        reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(mMessageList.getId(), ON_TOUCH_MSG_LIST_EVENT, null);
+                        reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(rootView.getId(), ON_TOUCH_MSG_LIST_EVENT, null);
                         if (reactContext.getCurrentActivity() != null) {
                             InputMethodManager imm = (InputMethodManager) reactContext.getCurrentActivity()
                                     .getSystemService(Context.INPUT_METHOD_SERVICE);
