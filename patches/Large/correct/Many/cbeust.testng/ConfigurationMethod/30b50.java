diff --git a/src/main/java/org/testng/internal/ConfigurationMethod.java b/src/main/java/org/testng/internal/ConfigurationMethod.java
index 1237245..7003939 100755
--- a/src/main/java/org/testng/internal/ConfigurationMethod.java
+++ b/src/main/java/org/testng/internal/ConfigurationMethod.java
@@ -422,7 +422,8 @@
         isAfterMethodConfiguration(),
         getBeforeGroups(),
         getAfterGroups(),
-        false /* do not call init() */
+        false /* do not call init() */,
+        getInstance()
         );
     clone.m_testClass= getTestClass();
     clone.setDate(getDate());
