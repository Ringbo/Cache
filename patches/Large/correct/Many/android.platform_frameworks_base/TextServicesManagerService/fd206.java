diff --git a/services/java/com/android/server/TextServicesManagerService.java b/services/java/com/android/server/TextServicesManagerService.java
index a653322..1976eba 100644
--- a/services/java/com/android/server/TextServicesManagerService.java
+++ b/services/java/com/android/server/TextServicesManagerService.java
@@ -701,7 +701,7 @@
         public void onServiceDisconnected(ComponentName name) {
             synchronized(mSpellCheckerMap) {
                 final SpellCheckerBindGroup group = mSpellCheckerBindGroups.get(mSciId);
-                if (this == group.mInternalConnection) {
+                if (group != null && this == group.mInternalConnection) {
                     mSpellCheckerBindGroups.remove(mSciId);
                 }
             }
