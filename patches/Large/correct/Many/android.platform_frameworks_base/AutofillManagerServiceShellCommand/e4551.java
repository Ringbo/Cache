diff --git a/services/autofill/java/com/android/server/autofill/AutofillManagerServiceShellCommand.java b/services/autofill/java/com/android/server/autofill/AutofillManagerServiceShellCommand.java
index 24b9fbd..4456087 100644
--- a/services/autofill/java/com/android/server/autofill/AutofillManagerServiceShellCommand.java
+++ b/services/autofill/java/com/android/server/autofill/AutofillManagerServiceShellCommand.java
@@ -192,7 +192,7 @@
                 pw.println("no score");
             } else {
                 pw.print("algorithm: ");
-                pw.print(scores.getAlgorithmName());
+                pw.print(scores.getAlgorithm());
                 pw.print(" score: ");
                 pw.println(scores.getScores()[0][0]);
             }
