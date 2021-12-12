diff --git a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/BridgeTypedArray.java b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/BridgeTypedArray.java
index daba8cfd..957f737 100644
--- a/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/BridgeTypedArray.java
+++ b/tools/layoutlib/bridge/src/com/android/layoutlib/bridge/BridgeTypedArray.java
@@ -673,7 +673,8 @@
 
         // looks like we were unable to resolve the drawable
         mContext.getLogger().warning(String.format(
-                "Unable to resolve drawable \"%1$s\" in attribute \"%2$s\"", value, mNames[index]));
+                "Unable to resolve drawable \"%1$s\" in attribute \"%2$s\"", stringValue,
+                mNames[index]));
 
         return null;
     }
