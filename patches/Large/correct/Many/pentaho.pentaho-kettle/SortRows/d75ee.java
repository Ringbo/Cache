diff --git a/src/org/pentaho/di/trans/steps/sort/SortRows.java b/src/org/pentaho/di/trans/steps/sort/SortRows.java
index 52ab667..2163fca 100644
--- a/src/org/pentaho/di/trans/steps/sort/SortRows.java
+++ b/src/org/pentaho/di/trans/steps/sort/SortRows.java
@@ -249,7 +249,7 @@
 					}
                     else
 					{
-						di=new DataInputStream(new BufferedInputStream(fi, 5000000));
+						di=new DataInputStream(new BufferedInputStream(fi, 50000));
 					}
 					data.dis.add(di);
 					
