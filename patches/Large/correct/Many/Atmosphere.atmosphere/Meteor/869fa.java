diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/Meteor.java b/modules/cpr/src/main/java/org/atmosphere/cpr/Meteor.java
index 7fcaf08..1833276 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/Meteor.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/Meteor.java
@@ -386,7 +386,7 @@
      */
     public void destroy() {
         isDestroyed.set(true);
-        cache.remove(this);
+        cache.remove(r);
     }
 
     private boolean destroyed(){
