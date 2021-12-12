diff --git a/plugins/plugin-java/che-plugin-java-ext-lang-client/src/test/java/org/eclipse/che/ide/ext/java/client/navigation/filestructure/FileStructurePresenterTest.java b/plugins/plugin-java/che-plugin-java-ext-lang-client/src/test/java/org/eclipse/che/ide/ext/java/client/navigation/filestructure/FileStructurePresenterTest.java
index c4f1f11..474fb41 100644
--- a/plugins/plugin-java/che-plugin-java-ext-lang-client/src/test/java/org/eclipse/che/ide/ext/java/client/navigation/filestructure/FileStructurePresenterTest.java
+++ b/plugins/plugin-java/che-plugin-java-ext-lang-client/src/test/java/org/eclipse/che/ide/ext/java/client/navigation/filestructure/FileStructurePresenterTest.java
@@ -104,9 +104,7 @@
         .thenReturn(promise);
     when(loaderFactory.newLoader()).thenReturn(loader);
 
-    presenter =
-        new FileStructurePresenter(
-            view, javaNavigationService, context, editorAgent, loaderFactory);
+    presenter = new FileStructurePresenter(view, javaNavigationService, context, editorAgent);
   }
 
   @Test
