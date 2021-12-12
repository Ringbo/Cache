diff --git a/src/test/groovy/inspect/InspectorTest.java b/src/test/groovy/inspect/InspectorTest.java
index 297f696..e43a4da 100644
--- a/src/test/groovy/inspect/InspectorTest.java
+++ b/src/test/groovy/inspect/InspectorTest.java
@@ -263,7 +263,7 @@
     }
 
     private String concat(String[] details) {
-        StringBuffer detailBuffer = new StringBuffer();
+        StringBuilder detailBuffer = new StringBuilder();
         for (int i = 0; i < details.length; i++) {
             detailBuffer.append(details[i]);
             detailBuffer.append(" ");
