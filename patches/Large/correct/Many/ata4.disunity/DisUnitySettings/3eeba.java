diff --git a/src/info/ata4/unity/DisUnitySettings.java b/src/info/ata4/unity/DisUnitySettings.java
index f8a80d3..0421c10 100644
--- a/src/info/ata4/unity/DisUnitySettings.java
+++ b/src/info/ata4/unity/DisUnitySettings.java
@@ -50,6 +50,6 @@
     }
     
     public boolean isClassFiltered(Integer classID) {
-        return classFilter != null && classFilter.contains(classID);
+        return classFilter != null && !classFilter.contains(classID);
     }
 }
