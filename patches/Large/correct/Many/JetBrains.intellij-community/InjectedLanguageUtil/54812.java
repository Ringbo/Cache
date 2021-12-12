diff --git a/source/com/intellij/psi/impl/source/tree/injected/InjectedLanguageUtil.java b/source/com/intellij/psi/impl/source/tree/injected/InjectedLanguageUtil.java
index 7b074d0..670fc06 100644
--- a/source/com/intellij/psi/impl/source/tree/injected/InjectedLanguageUtil.java
+++ b/source/com/intellij/psi/impl/source/tree/injected/InjectedLanguageUtil.java
@@ -412,7 +412,7 @@
     List<DocumentRange> injected = hostDocument.getUserData(INJECTED_FILES_KEY);
 
     if (injected == null) {
-      injected = new SmartList<DocumentRange>();
+      injected = new ArrayList<DocumentRange>();
       hostDocument.putUserData(INJECTED_FILES_KEY, injected);
     }
 
