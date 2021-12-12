diff --git a/demos/superjumper/superjumper/src/com/badlogicgames/superjumper/Settings.java b/demos/superjumper/superjumper/src/com/badlogicgames/superjumper/Settings.java
index 2f95c62..5dcffd2 100644
--- a/demos/superjumper/superjumper/src/com/badlogicgames/superjumper/Settings.java
+++ b/demos/superjumper/superjumper/src/com/badlogicgames/superjumper/Settings.java
@@ -22,7 +22,7 @@
             for(int i = 0; i < 5; i++) {
                 highscores[i] = Integer.parseInt(in.readLine());
             }
-        } catch (Exception e) {
+        } catch (Throwable e) {
             // :( It's ok we have defaults        
         } finally {
             try {
@@ -42,7 +42,7 @@
                 out.write(Integer.toString(highscores[i]));
             }
 
-        } catch (IOException e) {
+        } catch (Throwable e) {
         } finally {
             try {
                 if (out != null)
