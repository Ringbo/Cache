diff --git a/ui/src/main/java/org/pentaho/di/ui/core/PropsUI.java b/ui/src/main/java/org/pentaho/di/ui/core/PropsUI.java
index e413021..7b3bed5 100644
--- a/ui/src/main/java/org/pentaho/di/ui/core/PropsUI.java
+++ b/ui/src/main/java/org/pentaho/di/ui/core/PropsUI.java
@@ -1221,7 +1221,7 @@
   }
 
   private void resetRecentSearches() {
-    if( properties.contains( STRING_RECENT_SEARCHES ) ) {
+    if ( properties.containsKey( STRING_RECENT_SEARCHES ) ) {
       properties.remove( STRING_RECENT_SEARCHES );
     }
   }
