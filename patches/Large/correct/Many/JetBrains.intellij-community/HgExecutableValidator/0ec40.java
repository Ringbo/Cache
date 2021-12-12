diff --git a/plugins/hg4idea/src/org/zmlx/hg4idea/HgExecutableValidator.java b/plugins/hg4idea/src/org/zmlx/hg4idea/HgExecutableValidator.java
index ce8e3ae..a2d8189 100644
--- a/plugins/hg4idea/src/org/zmlx/hg4idea/HgExecutableValidator.java
+++ b/plugins/hg4idea/src/org/zmlx/hg4idea/HgExecutableValidator.java
@@ -24,16 +24,16 @@
 public class HgExecutableValidator {
 
   private static final Logger LOG = Logger.getInstance(HgExecutableValidator.class.getName());
-  private final Project project;
+  private final Project myProject;
   private boolean myValidHgExecutable;
 
   public HgExecutableValidator(Project project) {
-    this.project = project;
+    this.myProject = project;
   }
 
   public boolean check(final HgGlobalSettings globalSettings) {
     final HgVersionCommand command = new HgVersionCommand();
-    if (command.isValid(globalSettings.getHgExecutable())) {
+    if (command.isValid(HgVcs.getInstance(myProject).getHgExecutable())) {
       return true;
     }
 
@@ -48,7 +48,7 @@
           String previousHgPath = globalSettings.getHgExecutable();
           HgSetExecutableDialog dialog;
           do {
-            dialog = new HgSetExecutableDialog(project);
+            dialog = new HgSetExecutableDialog(myProject);
             dialog.setBadHgPath(previousHgPath);
             dialog.show();
             myValidHgExecutable = dialog.isOK() && command.isValid(dialog.getNewHgPath());
