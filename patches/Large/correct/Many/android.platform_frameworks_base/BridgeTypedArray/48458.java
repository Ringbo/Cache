diff --git a/tools/layoutlib/bridge/src/android/content/res/BridgeTypedArray.java b/tools/layoutlib/bridge/src/android/content/res/BridgeTypedArray.java
index f939678..5b69681 100644
--- a/tools/layoutlib/bridge/src/android/content/res/BridgeTypedArray.java
+++ b/tools/layoutlib/bridge/src/android/content/res/BridgeTypedArray.java
@@ -91,7 +91,7 @@
         // first count the array size
         int count = 0;
         for (ResourceValue data : mResourceData) {
-            if (data != null) {
+            if (data != null && !RenderResources.REFERENCE_NULL.equals(data.getValue())) {
                 count++;
             }
         }
@@ -103,7 +103,8 @@
         // fill the array with the indices.
         int index = 1;
         for (int i = 0 ; i < mResourceData.length ; i++) {
-            if (mResourceData[i] != null) {
+            if (mResourceData[i] != null
+                    && !RenderResources.REFERENCE_NULL.equals(mResourceData[i].getValue())) {
                 mIndices[index++] = i;
             }
         }
