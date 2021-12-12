diff --git a/services/java/com/android/server/TextServicesManagerService.java b/services/java/com/android/server/TextServicesManagerService.java
index 788ecda..a653322 100644
--- a/services/java/com/android/server/TextServicesManagerService.java
+++ b/services/java/com/android/server/TextServicesManagerService.java
@@ -691,7 +691,7 @@
                 }
                 ISpellCheckerService spellChecker = ISpellCheckerService.Stub.asInterface(service);
                 final SpellCheckerBindGroup group = mSpellCheckerBindGroups.get(mSciId);
-                if (this == group.mInternalConnection) {
+                if (group != null && this == group.mInternalConnection) {
                     group.onServiceConnected(spellChecker);
                 }
             }
