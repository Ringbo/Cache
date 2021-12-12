diff --git a/modules/GraphAPI/src/main/java/org/gephi/graph/LegacyDataPersistenceProvider.java b/modules/GraphAPI/src/main/java/org/gephi/graph/LegacyDataPersistenceProvider.java
index 1c6dc1c..4b183dc 100644
--- a/modules/GraphAPI/src/main/java/org/gephi/graph/LegacyDataPersistenceProvider.java
+++ b/modules/GraphAPI/src/main/java/org/gephi/graph/LegacyDataPersistenceProvider.java
@@ -155,11 +155,11 @@
                     float b = Float.parseFloat(reader.getAttributeValue(null, "b"));
                     float alpha = Float.parseFloat(reader.getAttributeValue(null, "a"));
                     
-                    //I have an old .gephi file with <color r="-1.0" g="0.0" b="0.0" a="1.0"> in every <edgedata>
-                    //So it seems that old versions of Gephi stored r = -1 sometimes. I guess it means no edge color set up? So use black instead.
+                    //Old gephi versions stored r = -1 to indicate that the edge had no color (use the node color)
+                    //Since Gephi 0.9, we do that with alpha = 0
                     if(r < 0 || g < 0 || b < 0){
                         r = g = b = 0;
-                        alpha = 1;
+                        alpha = 0;
                     }
                     
                     edge.setR(r);
