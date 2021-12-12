diff --git a/wifi/tests/src/android/net/wifi/aware/WifiAwareManagerTest.java b/wifi/tests/src/android/net/wifi/aware/WifiAwareManagerTest.java
index 653fcff..9cab66a 100644
--- a/wifi/tests/src/android/net/wifi/aware/WifiAwareManagerTest.java
+++ b/wifi/tests/src/android/net/wifi/aware/WifiAwareManagerTest.java
@@ -145,7 +145,7 @@
         // (2) publish - should succeed
         PublishConfig publishConfig = new PublishConfig.Builder().build();
         session.publish(publishConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).publish(eq(clientId), eq(publishConfig), any());
+        inOrder.verify(mockAwareService).publish(any(), eq(clientId), eq(publishConfig), any());
 
         // (3) disconnect
         session.close();
@@ -197,7 +197,7 @@
         // (4) subscribe: should succeed
         SubscribeConfig subscribeConfig = new SubscribeConfig.Builder().build();
         session.subscribe(subscribeConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).subscribe(eq(clientId), eq(subscribeConfig), any());
+        inOrder.verify(mockAwareService).subscribe(any(), eq(clientId), eq(subscribeConfig), any());
 
         verifyNoMoreInteractions(mockCallback, mockSessionCallback, mockAwareService);
     }
@@ -280,7 +280,7 @@
 
         // (1) publish
         session.publish(publishConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).publish(eq(clientId), eq(publishConfig),
+        inOrder.verify(mockAwareService).publish(any(), eq(clientId), eq(publishConfig),
                 sessionProxyCallback.capture());
 
         // (2) publish session created
@@ -372,7 +372,7 @@
 
         // (2) publish: successfully - then terminated
         session.publish(publishConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).publish(eq(clientId), eq(publishConfig),
+        inOrder.verify(mockAwareService).publish(any(), eq(clientId), eq(publishConfig),
                 sessionProxyCallback.capture());
         sessionProxyCallback.getValue().onSessionStarted(sessionId);
         sessionProxyCallback.getValue().onSessionTerminated(0);
@@ -429,7 +429,7 @@
 
         // (1) subscribe
         session.subscribe(subscribeConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).subscribe(eq(clientId), eq(subscribeConfig),
+        inOrder.verify(mockAwareService).subscribe(any(), eq(clientId), eq(subscribeConfig),
                 sessionProxyCallback.capture());
 
         // (2) subscribe session created
@@ -514,7 +514,7 @@
 
         // (2) subscribe: successfully - then terminated
         session.subscribe(subscribeConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).subscribe(eq(clientId), eq(subscribeConfig),
+        inOrder.verify(mockAwareService).subscribe(any(), eq(clientId), eq(subscribeConfig),
                 sessionProxyCallback.capture());
         sessionProxyCallback.getValue().onSessionStarted(sessionId);
         sessionProxyCallback.getValue().onSessionTerminated(0);
@@ -912,7 +912,7 @@
 
         // (2) publish successfully
         session.publish(publishConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).publish(eq(clientId), eq(publishConfig),
+        inOrder.verify(mockAwareService).publish(any(), eq(clientId), eq(publishConfig),
                 sessionProxyCallback.capture());
         sessionProxyCallback.getValue().onSessionStarted(sessionId);
         mMockLooper.dispatchAll();
@@ -1089,7 +1089,7 @@
 
         // (2) publish successfully
         session.publish(publishConfig, mockSessionCallback, mMockLooperHandler);
-        inOrder.verify(mockAwareService).publish(eq(clientId), eq(publishConfig),
+        inOrder.verify(mockAwareService).publish(any(), eq(clientId), eq(publishConfig),
                 sessionProxyCallback.capture());
         sessionProxyCallback.getValue().onSessionStarted(sessionId);
         mMockLooper.dispatchAll();
