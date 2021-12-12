diff --git a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ExternalSystemShortcutsManager.java b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ExternalSystemShortcutsManager.java
index f104d75..87e66a9 100644
--- a/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ExternalSystemShortcutsManager.java
+++ b/platform/external-system-impl/src/com/intellij/openapi/externalSystem/service/project/manage/ExternalSystemShortcutsManager.java
@@ -101,7 +101,7 @@
       KeymapManager keymapManager = KeymapManager.getInstance();
       if (keymapManager != null) {
         listenTo(keymapManager.getActiveKeymap());
-        ApplicationManager.getApplication().getMessageBus().connect(ExternalSystemShortcutsManager.this).subscribe(KeymapManagerListener.TOPIC, myKeyMapListener);
+        ApplicationManager.getApplication().getMessageBus().connect(ExternalSystemShortcutsManager.this).subscribe(KeymapManagerListener.TOPIC, this);
       }
     }
 
