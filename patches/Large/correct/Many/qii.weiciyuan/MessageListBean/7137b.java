diff --git a/src/org/qii/weiciyuan/bean/MessageListBean.java b/src/org/qii/weiciyuan/bean/MessageListBean.java
index c67f41e..7edb3ab 100644
--- a/src/org/qii/weiciyuan/bean/MessageListBean.java
+++ b/src/org/qii/weiciyuan/bean/MessageListBean.java
@@ -99,7 +99,7 @@
         }
 
         boolean receivedCountBelowRequestCount = newValue.getReceivedNumber() < Integer.valueOf(SettingUtility.getMsgCount());
-        boolean receivedCountEqualRequestCount = newValue.getReceivedNumber() == Integer.valueOf(SettingUtility.getMsgCount());
+        boolean receivedCountEqualRequestCount = newValue.getReceivedNumber() >= Integer.valueOf(SettingUtility.getMsgCount());
         if (receivedCountEqualRequestCount && this.getSize() > 0) {
             newValue.getItemList().add(null);
         }
