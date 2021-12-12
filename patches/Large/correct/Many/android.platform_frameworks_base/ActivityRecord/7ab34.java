diff --git a/services/java/com/android/server/am/ActivityRecord.java b/services/java/com/android/server/am/ActivityRecord.java
index 296d484..e6849ed 100644
--- a/services/java/com/android/server/am/ActivityRecord.java
+++ b/services/java/com/android/server/am/ActivityRecord.java
@@ -511,7 +511,7 @@
             return false;
         }
         AttributeCache.Entry ent =
-                AttributeCache.instance().get(packageName, realTheme, styleable.Window);
+                AttributeCache.instance().get(packageName, realTheme, styleable.Window, userId);
         if (ent == null
                 || !ent.array.getBoolean(styleable.Window_windowIsTranslucent, false)
                 || ent.array.getBoolean(styleable.Window_windowIsFloating, false)) {
