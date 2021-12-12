diff --git a/h2o-testng/src/test/java/hex/glm/GLMBasic.java b/h2o-testng/src/test/java/hex/glm/GLMBasic.java
index 962bdb1..b379cde 100644
--- a/h2o-testng/src/test/java/hex/glm/GLMBasic.java
+++ b/h2o-testng/src/test/java/hex/glm/GLMBasic.java
@@ -35,11 +35,11 @@
         try {
             List<String> lines = Files.readAllLines(find_test_file_static("h2o-testng/src/test/resources/" +
                     "glmCases.csv").toPath(), Charset.defaultCharset());
-            data = new Object[lines.size()][18];
+            data = new Object[lines.size()][28];
             int r = 0;
             for(String line : lines){
                 String[] variables = line.trim().split(",");
-                for(int c = 0; c < 18; c++){
+                for(int c = 0; c < 28; c++){
                     try{ data[r][c] = variables[c]; } catch(IndexOutOfBoundsException e) { data[r][c] = "";}
                 }
                 r++;
