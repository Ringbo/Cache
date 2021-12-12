diff --git a/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java b/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java
index 7faa006..774f1ef 100644
--- a/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java
+++ b/check_api/src/main/java/com/google/errorprone/BaseErrorProneJavaCompiler.java
@@ -241,7 +241,7 @@
         refactoringResult = refactoringCollection.applyChanges(event.getSourceFile().toUri());
       } catch (Exception e) {
         PrintWriter out = Log.instance(context).getWriter(WriterKind.ERROR);
-        out.append(e.getMessage());
+        out.println(e.getMessage());
         out.flush();
         return;
       }
