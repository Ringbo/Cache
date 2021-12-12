diff --git a/python/educational/src/com/jetbrains/edu/courseFormat/Task.java b/python/educational/src/com/jetbrains/edu/courseFormat/Task.java
index 80d2737..ce6a3fb 100644
--- a/python/educational/src/com/jetbrains/edu/courseFormat/Task.java
+++ b/python/educational/src/com/jetbrains/edu/courseFormat/Task.java
@@ -140,35 +140,35 @@
     return null;
   }
 
-  @Nullable
+  @NotNull
   public String getTaskText(@NotNull final Project project) {
     if (!StringUtil.isEmptyOrSpaces(text)) return text;
     final VirtualFile taskDir = getTaskDir(project);
     if (taskDir != null) {
       final VirtualFile file = taskDir.findChild(EduNames.TASK_HTML);
-      if (file == null) return null;
+      if (file == null) return "";
       final Document document = FileDocumentManager.getInstance().getDocument(file);
       if (document != null) {
         return document.getImmutableCharSequence().toString();
       }
     }
 
-    return null;
+    return "";
   }
 
-  @Nullable
+  @NotNull
   public String getTestsText(@NotNull final Project project) {
     final VirtualFile taskDir = getTaskDir(project);
     if (taskDir != null) {
       final VirtualFile file = taskDir.findChild(EduNames.TESTS_FILE);
-      if (file == null) return null;
+      if (file == null) return "";
       final Document document = FileDocumentManager.getInstance().getDocument(file);
       if (document != null) {
         return document.getImmutableCharSequence().toString();
       }
     }
 
-    return null;
+    return "";
   }
 
   @Override
