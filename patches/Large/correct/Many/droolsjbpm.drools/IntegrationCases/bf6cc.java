diff --git a/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java b/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java
index e1c8c23..95a1dcd 100644
--- a/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java
+++ b/drools-compiler/src/test/java/org/drools/integrationtests/IntegrationCases.java
@@ -2975,7 +2975,7 @@
         workingMemory.fireAllRules();
 
         // all 3 in europe, so, 2 cheese
-        List cheeseList = workingMemory.getObjects( String.class );
+        List cheeseList = workingMemory.getObjects( Cheese.class );
         assertEquals( 2,
                       cheeseList.size() );
 
@@ -2984,7 +2984,7 @@
         workingMemory.modifyObject( c3FactHandle,
                                     p3 );
         workingMemory.fireAllRules();
-        cheeseList = workingMemory.getObjects( String.class );
+        cheeseList = workingMemory.getObjects( Cheese.class );
         assertEquals( 1,
                       cheeseList.size() );
 
@@ -2993,7 +2993,7 @@
         workingMemory.modifyObject( c2FactHandle,
                                     p2 );
         workingMemory.fireAllRules();
-        cheeseList = workingMemory.getObjects( String.class );
+        cheeseList = workingMemory.getObjects( Cheese.class );
         assertEquals( 1,
                       cheeseList.size() );
 
@@ -3002,7 +3002,7 @@
         workingMemory.modifyObject( c1FactHandle,
                                     p1 );
         workingMemory.fireAllRules();
-        cheeseList = workingMemory.getObjects( String.class );
+        cheeseList = workingMemory.getObjects( Cheese.class );
         assertEquals( 2,
                       cheeseList.size() );
 
@@ -3011,7 +3011,7 @@
         workingMemory.modifyObject( c2FactHandle,
                                     p2 );
         workingMemory.fireAllRules();
-        cheeseList = workingMemory.getObjects( String.class );
+        cheeseList = workingMemory.getObjects( Cheese.class );
         assertEquals( 1,
                       cheeseList.size() );
 
@@ -3020,7 +3020,7 @@
         workingMemory.modifyObject( c1FactHandle,
                                     p1 );
         workingMemory.fireAllRules();
-        cheeseList = workingMemory.getObjects( String.class );
+        cheeseList = workingMemory.getObjects( Cheese.class );
         assertEquals( 1,
                       cheeseList.size() );
 
@@ -3029,7 +3029,7 @@
         workingMemory.modifyObject( c3FactHandle,
                                     p3 );
         workingMemory.fireAllRules();
-        cheeseList = workingMemory.getObjects( String.class );
+        cheeseList = workingMemory.getObjects( Cheese.class );
         assertEquals( 2,
                       cheeseList.size() );
     }
