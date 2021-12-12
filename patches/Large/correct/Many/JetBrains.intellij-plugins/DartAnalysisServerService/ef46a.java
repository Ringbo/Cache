diff --git a/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java b/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java
index 93e7c35..e901e45 100644
--- a/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java
+++ b/Dart/src/com/jetbrains/lang/dart/analyzer/DartAnalysisServerService.java
@@ -1753,7 +1753,8 @@
                     final DartProblemsView problemsView = DartProblemsView.getInstance(myProject);
                     problemsView.showErrorNotificationTerse("Analysis server has terminated");
                   },
-                  ModalityState.NON_MODAL
+                  ModalityState.NON_MODAL,
+                  myProject.getDisposed()
                 );
 
                 stopServer();
@@ -1774,7 +1775,8 @@
             final DartProblemsView problemsView = DartProblemsView.getInstance(myProject);
             problemsView.clearNotifications();
           },
-          ModalityState.NON_MODAL
+          ModalityState.NON_MODAL,
+          myProject.getDisposed()
         );
 
         // This must be done after myServer is set, and should be done each time the server starts.
