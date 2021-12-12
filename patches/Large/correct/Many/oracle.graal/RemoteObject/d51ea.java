diff --git a/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/types/RemoteObject.java b/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/types/RemoteObject.java
index 9d6cf0e..295bda5 100644
--- a/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/types/RemoteObject.java
+++ b/tools/src/com.oracle.truffle.tools.chromeinspector/src/com/oracle/truffle/tools/chromeinspector/types/RemoteObject.java
@@ -184,7 +184,7 @@
         DebugValue metaObject;
         try {
             metaObject = debugValue.getMetaObject();
-            if (originalLanguage != null) {
+            if (originalLanguage != null && metaObject != null) {
                 metaObject = metaObject.asInLanguage(originalLanguage);
             }
         } catch (Exception ex) {
