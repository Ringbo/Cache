diff --git a/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java b/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
index 17c3c6f..900e5a8 100644
--- a/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
+++ b/drools-compiler/src/main/java/org/drools/lang/dsl/DefaultExpander.java
@@ -136,7 +136,7 @@
                 String headerFragment = m.group( 2 );
                 expanded.append( headerFragment ); // adding rule header and attributes
                 String lhsFragment = m.group( 3 );
-                expanded.append( this.expandLHS( lhsFragment, countNewlines( headerFragment ) + 2 ) ); // adding expanded LHS
+                expanded.append( this.expandLHS( lhsFragment, countNewlines( headerFragment ) + 1 ) ); // adding expanded LHS
                 String thenFragment = m.group( 4 ); 
                 
                 expanded.append( thenFragment ); // adding "then" header
@@ -147,7 +147,7 @@
                 // match query
                 String fragment = m.group( 7 );
                 expanded.append( fragment ); // adding query header and attributes
-                expanded.append( this.expandLHS( m.group( 8 ), countNewlines( fragment ) + 2 ) ); // adding expanded LHS
+                expanded.append( this.expandLHS( m.group( 8 ), countNewlines( fragment ) + 1 ) ); // adding expanded LHS
                 expanded.append( m.group( 9 ) ); // adding query trailer
                 expanded.append( "\n" );
             } else {
