diff --git a/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/BazelJavaBuilder.java b/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/BazelJavaBuilder.java
index 71fb049..607adcd 100644
--- a/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/BazelJavaBuilder.java
+++ b/src/java_tools/buildjar/java/com/google/devtools/build/buildjar/BazelJavaBuilder.java
@@ -88,10 +88,10 @@
         return builder.run(build, err).exitCode;
       }
     } catch (InvalidCommandLineException e) {
-      System.err.println(CMDNAME + " threw exception: " + e.getMessage());
+      err.println(CMDNAME + " threw exception: " + e.getMessage());
       return 1;
     } catch (Exception e) {
-      e.printStackTrace();
+      e.printStackTrace(err);
       return 1;
     }
   }
