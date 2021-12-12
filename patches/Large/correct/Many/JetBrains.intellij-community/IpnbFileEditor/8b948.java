diff --git a/src/org/jetbrains/plugins/ipnb/IpnbFileEditor.java b/src/org/jetbrains/plugins/ipnb/IpnbFileEditor.java
index bc66ff0..9e2ca3f 100644
--- a/src/org/jetbrains/plugins/ipnb/IpnbFileEditor.java
+++ b/src/org/jetbrains/plugins/ipnb/IpnbFileEditor.java
@@ -157,7 +157,7 @@
   private static FileEditorProvider getProvider(Project project, VirtualFile vFile) {
     FileEditorProvider[] providers = FileEditorProviderManagerImpl.getInstance().getProviders(project, vFile);
     for (FileEditorProvider provider : providers) {
-      if (!(provider instanceof IpnbFileEditor)) {
+      if (!(provider instanceof IpnbEditorProvider)) {
         return provider;
       }
     }
