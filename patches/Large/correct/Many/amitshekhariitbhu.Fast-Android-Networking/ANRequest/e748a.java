diff --git a/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java b/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java
index d5a1771..9a18351 100644
--- a/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java
+++ b/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java
@@ -942,7 +942,7 @@
 
         @Override
         public T addPathParameter(Map<String, String> pathParameterMap) {
-            if (mPathParameterMap != null) {
+            if (pathParameterMap != null) {
                 mPathParameterMap.putAll(pathParameterMap);
             }
             return (T) this;
@@ -1156,7 +1156,7 @@
 
         @Override
         public T addPathParameter(Map<String, String> pathParameterMap) {
-            if (mPathParameterMap != null) {
+            if (pathParameterMap != null) {
                 mPathParameterMap.putAll(pathParameterMap);
             }
             return (T) this;
@@ -1424,7 +1424,7 @@
 
         @Override
         public T addPathParameter(Map<String, String> pathParameterMap) {
-            if (mPathParameterMap != null) {
+            if (pathParameterMap != null) {
                 mPathParameterMap.putAll(pathParameterMap);
             }
             return (T) this;
@@ -1563,7 +1563,7 @@
 
         @Override
         public T addPathParameter(Map<String, String> pathParameterMap) {
-            if (mPathParameterMap != null) {
+            if (pathParameterMap != null) {
                 mPathParameterMap.putAll(pathParameterMap);
             }
             return (T) this;
