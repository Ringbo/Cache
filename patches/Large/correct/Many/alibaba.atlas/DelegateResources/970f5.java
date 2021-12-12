diff --git a/atlas-core/src/main/java/android/taobao/atlas/runtime/DelegateResources.java b/atlas-core/src/main/java/android/taobao/atlas/runtime/DelegateResources.java
index 2b3bd1c..37e928a 100644
--- a/atlas-core/src/main/java/android/taobao/atlas/runtime/DelegateResources.java
+++ b/atlas-core/src/main/java/android/taobao/atlas/runtime/DelegateResources.java
@@ -271,7 +271,7 @@
             }
 
         }
-        if(result==null){
+        if(result==null && exception!=null){
             throw exception;
         }
         return result;
@@ -292,7 +292,7 @@
             }
 
         }
-        if(result==null){
+        if(result==null && exception!=null){
             throw exception;
         }
         return result;
