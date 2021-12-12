diff --git a/drools-core/src/test/java/org/drools/reteoo/SchedulerTest.java b/drools-core/src/test/java/org/drools/reteoo/SchedulerTest.java
index 9598eda..9e0afc6 100644
--- a/drools-core/src/test/java/org/drools/reteoo/SchedulerTest.java
+++ b/drools-core/src/test/java/org/drools/reteoo/SchedulerTest.java
@@ -104,7 +104,7 @@
                                                                        null );
 
         final LeftTuple tuple = new LeftTuple( new DefaultFactHandle( 1,
-                                                                      "cheese" ) );
+                                                                      "cheese" ), null );
 
         assertEquals( 0,
                       data.size() );
@@ -166,7 +166,7 @@
                                                                                     rule,
                                                                                     knowledgeHelper.getActivation() );
                     final LeftTuple tuple2 = new LeftTuple( new DefaultFactHandle( 2,
-                                                                                   "cheese" ) );
+                                                                                   "cheese" ), null );
                     node.assertLeftTuple( tuple2,
                                       context2,
                                       (ReteooWorkingMemory) workingMemory );
@@ -188,7 +188,7 @@
                                                                         null );
 
         final LeftTuple tuple1 = new LeftTuple( new DefaultFactHandle( 1,
-                                                                       "cheese" ) );
+                                                                       "cheese" ), null );
 
         node.assertLeftTuple( tuple1,
                           context1,
@@ -254,7 +254,7 @@
                                                                                     rule,
                                                                                     knowledgeHelper.getActivation() );
                     final LeftTuple tuple2 = new LeftTuple( new DefaultFactHandle( 2,
-                                                                                   "cheese" ) );
+                                                                                   "cheese" ), null );
                     node.assertLeftTuple( tuple2,
                                       context2,
                                       (ReteooWorkingMemory) workingMemory );
@@ -276,7 +276,7 @@
                                                                         null );
 
         final LeftTuple tuple1 = new LeftTuple( new DefaultFactHandle( 1,
-                                                                       "cheese" ) );
+                                                                       "cheese" ), null );
         node.assertLeftTuple( tuple1,
                           context1,
                           workingMemory );
