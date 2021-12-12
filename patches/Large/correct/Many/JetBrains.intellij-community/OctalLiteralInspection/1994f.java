diff --git a/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/OctalLiteralInspection.java b/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/OctalLiteralInspection.java
index 78b5bbd..7ef6451 100644
--- a/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/OctalLiteralInspection.java
+++ b/plugins/InspectionGadgets/src/com/siyeh/ig/numeric/OctalLiteralInspection.java
@@ -46,7 +46,7 @@
                 return;
             }
             final String text = literal.getText();
-            if("0".equals(text) || "0L".equals(text)){
+            if("0".equals(text) || "0L".equals(text)|| "0l".equals(text)){
                 return;
             }
             if(text.charAt(0) != '0'){
