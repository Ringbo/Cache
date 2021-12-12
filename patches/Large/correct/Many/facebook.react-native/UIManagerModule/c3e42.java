diff --git a/ReactAndroid/src/main/java/com/facebook/react/uimanager/UIManagerModule.java b/ReactAndroid/src/main/java/com/facebook/react/uimanager/UIManagerModule.java
index 37255c9..fcc11c6 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/uimanager/UIManagerModule.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/uimanager/UIManagerModule.java
@@ -219,7 +219,7 @@
     try {
       return UIManagerModuleConstantsHelper.createConstants(viewManagerResolver);
     } finally {
-      SystraceMessage.endSection(Systrace.TRACE_TAG_REACT_JAVA_BRIDGE);
+      Systrace.endSection(Systrace.TRACE_TAG_REACT_JAVA_BRIDGE);
       ReactMarker.logMarker(CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
     }
   }
@@ -237,7 +237,7 @@
       return UIManagerModuleConstantsHelper.createConstants(
           viewManagers, customBubblingEvents, customDirectEvents);
     } finally {
-      SystraceMessage.endSection(Systrace.TRACE_TAG_REACT_JAVA_BRIDGE);
+      Systrace.endSection(Systrace.TRACE_TAG_REACT_JAVA_BRIDGE);
       ReactMarker.logMarker(CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
     }
   }
