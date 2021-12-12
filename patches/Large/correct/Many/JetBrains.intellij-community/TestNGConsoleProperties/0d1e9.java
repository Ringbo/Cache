diff --git a/plugins/testng/src/com/theoryinpractice/testng/model/TestNGConsoleProperties.java b/plugins/testng/src/com/theoryinpractice/testng/model/TestNGConsoleProperties.java
index 322306d..1aae7cd 100644
--- a/plugins/testng/src/com/theoryinpractice/testng/model/TestNGConsoleProperties.java
+++ b/plugins/testng/src/com/theoryinpractice/testng/model/TestNGConsoleProperties.java
@@ -40,6 +40,6 @@
 
   @Override
   protected GlobalSearchScope initScope() {
-    return myConfiguration.getPersistantData().getScope().getSourceScope(myConfiguration).getLibrariesScope();
+    return myConfiguration.getPersistantData().getScope().getSourceScope(myConfiguration).getGlobalSearchScope();
   }
 }
