diff --git a/drools-core/src/test/java/org/drools/reteoo/EvalConditionNodeTest.java b/drools-core/src/test/java/org/drools/reteoo/EvalConditionNodeTest.java
index a73fa17..bbbcb8f 100644
--- a/drools-core/src/test/java/org/drools/reteoo/EvalConditionNodeTest.java
+++ b/drools-core/src/test/java/org/drools/reteoo/EvalConditionNodeTest.java
@@ -106,7 +106,7 @@
         // Create the Tuple
         final DefaultFactHandle f0 = new DefaultFactHandle( 0,
                                                             "stilton" );
-        final LeftTuple tuple0 = new LeftTuple( f0 );
+        final LeftTuple tuple0 = new LeftTuple( f0, sink );
 
         // Tuple should pass and propagate 
         node.assertLeftTuple( tuple0,
@@ -116,7 +116,7 @@
         // Create the Tuple
         final DefaultFactHandle f1 = new DefaultFactHandle( 1,
                                                             "cheddar" );
-        final LeftTuple tuple1 = new LeftTuple( f1 );
+        final LeftTuple tuple1 = new LeftTuple( f1, sink );
 
         // Tuple should pass and propagate 
         node.assertLeftTuple( tuple1,
@@ -152,7 +152,7 @@
         // Create the Tuple
         final DefaultFactHandle f0 = new DefaultFactHandle( 0,
                                                             "stilton" );
-        final LeftTuple tuple0 = new LeftTuple( f0 );
+        final LeftTuple tuple0 = new LeftTuple( f0, sink );
 
         // Tuple should pass and propagate 
         node.assertLeftTuple( tuple0,
@@ -163,7 +163,7 @@
         // Create the Tuple
         final DefaultFactHandle f1 = new DefaultFactHandle( 1,
                                                             "cheddar" );
-        final LeftTuple tuple1 = new LeftTuple( f1 );
+        final LeftTuple tuple1 = new LeftTuple( f1, sink );
 
         // Tuple should pass and propagate 
         node.assertLeftTuple( tuple1,
@@ -226,7 +226,7 @@
         // Create the Tuple
         final DefaultFactHandle f0 = new DefaultFactHandle( 0,
                                                             "stilton" );
-        final LeftTuple tuple0 = new LeftTuple( f0 );
+        final LeftTuple tuple0 = new LeftTuple( f0, sink );
 
         // Tuple should fail and not propagate
         node.assertLeftTuple( tuple0,
@@ -236,7 +236,7 @@
         // Create the Tuple
         final DefaultFactHandle f1 = new DefaultFactHandle( 1,
                                                             "cheddar" );
-        final LeftTuple tuple1 = new LeftTuple( f1 );
+        final LeftTuple tuple1 = new LeftTuple( f1, sink );
 
         // Tuple should fail and not propagate 
         node.assertLeftTuple( tuple1,
@@ -281,7 +281,7 @@
         final DefaultFactHandle f0 = new DefaultFactHandle( 0,
                                                             "string0" );
 
-        final LeftTuple tuple1 = new LeftTuple( f0 );
+        final LeftTuple tuple1 = new LeftTuple( f0, sink1 );
 
         node.assertLeftTuple( tuple1,
                           this.context,
