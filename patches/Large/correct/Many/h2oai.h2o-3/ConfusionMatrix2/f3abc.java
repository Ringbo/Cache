diff --git a/h2o-core/src/main/java/hex/ConfusionMatrix2.java b/h2o-core/src/main/java/hex/ConfusionMatrix2.java
index 25d3dab..cc3d322 100644
--- a/h2o-core/src/main/java/hex/ConfusionMatrix2.java
+++ b/h2o-core/src/main/java/hex/ConfusionMatrix2.java
@@ -243,7 +243,7 @@
   }
 
   public String toASCII(String[] domain) {
-    if (_cm_json == null)
+    if (_cm_json == null && domain != null)
       _cm_json = toTable(domain);
     return _cm_json.toString();
   }
