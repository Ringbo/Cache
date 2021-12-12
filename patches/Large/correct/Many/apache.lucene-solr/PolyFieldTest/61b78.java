diff --git a/solr/src/test/org/apache/solr/schema/PolyFieldTest.java b/solr/src/test/org/apache/solr/schema/PolyFieldTest.java
index 597d8e6..bb79698 100644
--- a/solr/src/test/org/apache/solr/schema/PolyFieldTest.java
+++ b/solr/src/test/org/apache/solr/schema/PolyFieldTest.java
@@ -194,7 +194,7 @@
       }
     }
     assertU(commit());
-    CartesianPolyFilterBuilder cpfb = new CartesianPolyFilterBuilder("");
+    CartesianPolyFilterBuilder cpfb = new CartesianPolyFilterBuilder("", 4, 15);
     //Get the box based on this point and our distance
     final Shape shape = cpfb.getBoxShape(45, -80, 10);//There's a bit of a bug in here that requires a small tier filter here.
     final List<Double> boxIds = shape.getArea();
