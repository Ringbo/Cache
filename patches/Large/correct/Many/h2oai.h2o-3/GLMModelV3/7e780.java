diff --git a/h2o-algos/src/main/java/hex/schemas/GLMModelV3.java b/h2o-algos/src/main/java/hex/schemas/GLMModelV3.java
index 268cbbb..9f2c9db 100644
--- a/h2o-algos/src/main/java/hex/schemas/GLMModelV3.java
+++ b/h2o-algos/src/main/java/hex/schemas/GLMModelV3.java
@@ -76,7 +76,7 @@
         // coefficients_table = new TwoDimTable("Coefficients",impl._names,impl.isNormalized()? new String[]{"Coefficients, Normalized Coefficients"}: new String[]{"Coefficients"});
         String [] colTypes = new String[]{"double"};
         String [] colFormats = new String[]{"%5f"};
-        TwoDimTable tdt = new TwoDimTable("Coefficients","glm coefficients", names, new String[]{"Coefficients"}, colTypes, colFormats, "names");
+        TwoDimTable tdt = new TwoDimTable("Coefficients","glm coefficients", ns, new String[]{"Coefficients"}, colTypes, colFormats, "names");
         tdt.set(0,0,beta[beta.length-1]);
         for(int i = 0; i < beta.length-1; ++i) {
           tdt.set(i + 1, 0, beta[i]);
